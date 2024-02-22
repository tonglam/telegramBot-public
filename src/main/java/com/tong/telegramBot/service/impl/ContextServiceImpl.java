package com.tong.telegramBot.service.impl;

import com.tong.telegramBot.constant.Constant;
import com.tong.telegramBot.domain.bot.letletme.LiveCalcData;
import com.tong.telegramBot.service.IContextService;
import com.tong.telegramBot.utils.JsonUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Create by tong on 2023/1/7
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class ContextServiceImpl implements IContextService {

    @Override
    public String price(String priceChange) {
        StringBuilder builder = new StringBuilder();
        String date = LocalDate.now().format(DateTimeFormatter.ofPattern(Constant.SHORTDAY));
        String rise = "Rise";
        String fall = "Faller";
        Map<String, List<LinkedHashMap<String, Object>>> map = JsonUtils.json2obj(priceChange, Map.class);
        if (CollectionUtils.isEmpty(map)) {
            log.info("priceChange is empty");
            return null;
        }
        // rise
        builder.append("Price_change: ").append(date).append("\r\n").append("\r\n");
        builder.append("Rise:").append("\r\n");
        if (!map.containsKey(rise) || CollectionUtils.isEmpty(map.get(rise))) {
            builder.append("None").append("\r\n");
        } else {
            map.get(rise).forEach(o -> builder.append(o.get("webName")).append(" [").append(o.get("teamShortName")).append("]").append("  ").append(o.get("lastValue")).append("m").append(" => ").append(o.get("value")).append("m").append("\r\n"));
        }
        builder.append("\r\n");
        // fall
        builder.append("Fall:").append("\r\n");
        if (!map.containsKey(fall) || CollectionUtils.isEmpty(map.get(fall))) {
            builder.append("None").append("\r\n");
        } else {
            map.get(fall).forEach(o -> builder.append(o.get("webName")).append(" [").append(o.get("teamShortName")).append("]").append("  ").append(o.get("lastValue")).append("m").append(" => ").append(o.get("value")).append("m").append("\r\n"));
        }
        return builder.toString();
    }

    @Override
    public String ddl(Map<String, String> map) {
        StringBuilder builder = new StringBuilder();
        if (!map.containsKey("event") || !map.containsKey("utcDeadline")) {
            return builder.toString();
        }
        // event
        String event = map.get("event");
        builder.append("Gameweek ").append(event).append(" Deadline: ").append("\r\n").append("\r\n");
        // deadline
        String utcDeadline = map.get("utcDeadline");
        // London
        StringBuilder londonBuilder = this.initZoneDdl(utcDeadline, "GMT+0", "LONDON");
        if (londonBuilder != null) {
            builder.append(londonBuilder);
        }
        // Guangzhou
        StringBuilder guangzhouBuilder = this.initZoneDdl(utcDeadline, "GMT+8", "GUANGZHOU");
        if (guangzhouBuilder != null) {
            builder.append(guangzhouBuilder);
        }
        // Japan
        StringBuilder tokyoBuilder = this.initZoneDdl(utcDeadline, "GMT+9", "TOKYO");
        if (tokyoBuilder != null) {
            builder.append(tokyoBuilder);
        }
        // Australia
        StringBuilder sydneyBuilder = this.initZoneDdl(utcDeadline, "GMT+11", "SYDNEY");
        if (sydneyBuilder != null) {
            builder.append(sydneyBuilder);
        }
        builder.append("\r\n");
        // countdown
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localZoneDateTime = LocalDateTime.ofInstant(Instant.parse(utcDeadline), ZoneId.of("GMT+8"));
        Duration duration = Duration.between(localDateTime, localZoneDateTime);
        long days = duration.toDays();
        long hours = duration.toHours() - (days * 24);
        long minutes = duration.toMinutes() - (days * 24 * 60) - (hours * 60);
        long seconds = duration.getSeconds() - (days * 24 * 60 * 60) - (hours * 60 * 60) - (minutes * 60);
        builder.append(days).append(" day(s) ").append(hours).append(" hour(s) ").append(minutes).append(" minute(s) ").append(seconds).append(" second(s) ").append(" TO DEADLINE");
        builder.append("\r\n");
        return builder.toString();
    }

    private StringBuilder initZoneDdl(String utcDeadline, String zone, String zoneName) {
        StringBuilder builder = new StringBuilder();
        ZoneId zoneId = ZoneId.of(zone);
        LocalDateTime zoneDateTime = LocalDateTime.ofInstant(Instant.parse(utcDeadline), zoneId);
        String zoneDeadline = zoneDateTime.atZone(zoneId).format(DateTimeFormatter.ofPattern(Constant.DATETIME));
        builder.append(zoneName).append(" => ").append(zoneDeadline).append(" (").append(zone).append(")").append("\r\n");
        return builder;
    }

    @Override
    public String live(LiveCalcData liveCalcData) {
        StringBuilder builder = new StringBuilder();
        builder.append(liveCalcData.getEntryName()).append(" (").append(liveCalcData.getPlayerName()).append(")").append("\r\n").append("Gameweek ").append(liveCalcData.getEvent()).append(" => ").append(liveCalcData.getLivePoints()).append(" points");
        if (liveCalcData.getTransferCost() > 0) {
            builder.append("(-").append(liveCalcData.getTransferCost()).append(")");
        }
        builder.append("\r\n").append("\r\n");
        // start line
        liveCalcData.getPickList().forEach(o -> {
            if (o.getPosition() >= 12) {
                return;
            }
            builder.append("[").append(o.getTeamShortName()).append("]").append(o.getWebName());
            if (o.isCaptain()) {
                builder.append("(c)");
            } else if (o.isViceCaptain()) {
                builder.append("(vc)");
            }
            builder.append(" => ").append(o.getTotalPoints());
            if (o.isPlayed()) {
                builder.append(" (Played)");
            }
            builder.append("\r\n");
        });
        builder.append("\r\n");
        // bench
        if (!StringUtils.equals("bboost", liveCalcData.getChip())) {
            builder.append("Subs:").append("\r\n");
        }
        liveCalcData.getPickList().forEach(o -> {
            if (o.getPosition() < 12) {
                return;
            }
            builder.append("[").append(o.getTeamShortName()).append("]").append(o.getWebName()).append(" => ").append(o.getTotalPoints());
            if (o.isPlayed()) {
                builder.append(" (Played)");
            }
            builder.append("\r\n");
        });
        return builder.toString();
    }

}
