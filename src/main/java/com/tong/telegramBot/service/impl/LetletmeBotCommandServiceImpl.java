package com.tong.telegramBot.service.impl;

import com.google.common.collect.Lists;
import com.tong.telegramBot.constant.Constant;
import com.tong.telegramBot.domain.bot.common.NoticeData;
import com.tong.telegramBot.domain.bot.letletme.HermesNoticeData;
import com.tong.telegramBot.domain.bot.letletme.LiveCalcData;
import com.tong.telegramBot.service.IContextService;
import com.tong.telegramBot.service.ILetletmeBotCommandService;
import com.tong.telegramBot.utils.JsonUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Create by tong on 2023/1/2
 */
@Slf4j
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class LetletmeBotCommandServiceImpl implements ILetletmeBotCommandService {

    private final InterfaceServiceImpl interfaceService;
    private final IContextService contextService;

    @Override
    public String priceChange() {
        String date = LocalDate.now().format(DateTimeFormatter.ofPattern(Constant.SHORTDAY));
        Optional<String> result = this.interfaceService.qryPlayerValueByDate(date);
        if (result.isPresent()) {
            String text = this.contextService.price(result.get());
            if (StringUtils.isEmpty(text)) {
                return "Price_change: " + date + "\r\n" + "\r\n" + "Rise:" + "\r\n" + "None" + "\r\n" + "\r\n" + "Fall:" + "\r\n" + "None" + "\r\n";
            }
            return text;
        }
        return "";
    }

    @Override
    public String ddl() {
        StringBuilder builder = new StringBuilder();
        this.interfaceService.qryCurrentEventAndNextUtcDeadline().ifPresent(result -> {
            Map<String, String> map = JsonUtils.json2obj(result, Map.class);
            if (CollectionUtils.isEmpty(map)) {
                return;
            }
            String context = this.contextService.ddl(map);
            if (StringUtils.isNotEmpty(context)) {
                builder.append(context);
            }
        });
        return builder.toString();
    }

    @Override
    public String live() {
        return null;
    }

    @Override
    public String live(String entryStr) {
        StringBuilder builder = new StringBuilder();
        int entry = Integer.parseInt(entryStr);
        if (entry <= 0) {
            return builder.toString();
        }
        // get current event
        this.interfaceService.qryCurrentEventAndNextUtcDeadline().ifPresent(result -> {
            Map<String, String> map = JsonUtils.json2obj(result, Map.class);
            if (CollectionUtils.isEmpty(map)) {
                return;
            }
            // event
            int event = Integer.parseInt(map.get("event"));
            // get live points
            this.interfaceService.calcLivePointsByEntry(event, entry).ifPresent(liveResult -> {
                LiveCalcData liveCalcData = JsonUtils.json2obj(liveResult, LiveCalcData.class);
                if (liveCalcData == null) {
                    return;
                }
                // get context
                String context = this.contextService.live(liveCalcData);
                if (StringUtils.isEmpty(context)) {
                    return;
                }
                builder.append(context);
            });
        });
        return builder.toString();
    }

    @Override
    public List<NoticeData> hermesAll() {
        List<NoticeData> list = Lists.newArrayList();
        this.interfaceService.queryHermesInfoList().ifPresent(result -> {
            List<HermesNoticeData> resultList = JsonUtils.json2Collection(result, List.class, HermesNoticeData.class);
            if (CollectionUtils.isEmpty(resultList)) {
                return;
            }
            resultList.forEach(o -> {
                StringBuilder builder = new StringBuilder();
                builder.append(o.getName()).append("\r\n").append(o.getPrice()).append("\r\n").append(o.getHref()).append("\r\n").append("update_time: ").append(o.getUpdateTime()).append(" (GMT+8)");
                String caption = builder.toString();
                if (o.isNewEntry()) {
                    caption = "[NEW]" + caption;
                }
                NoticeData noticeData = new NoticeData().setImgUrl(o.getImg()).setImgCaption(caption);
                list.add(noticeData);
            });
        });
        return list;
    }

}
