package com.tong.telegramBot.service.impl;

import com.tong.telegramBot.constant.Constant;
import com.tong.telegramBot.service.IInterfaceService;
import com.tong.telegramBot.utils.HttpUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Optional;

/**
 * Create by tong on 2023/1/2
 */
@Slf4j
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class InterfaceServiceImpl implements IInterfaceService {

    @Override
    public Optional<String> qryPlayerValueByDate(String date) {
        try {
            return HttpUtils.httpGet(String.format(Constant.FPL_PLAYER_VALUE_BY_DATE, date));
        } catch (IOException e) {
            log.error("httpGet error:" + e.getMessage());
        }
        return Optional.empty();
    }

    @Override
    public Optional<String> qryCurrentEventAndNextUtcDeadline() {
        try {
            return HttpUtils.httpGet(Constant.FPL_CURRENT_EVENT_AND_NEXT_UTC_DEADLINE);
        } catch (IOException e) {
            log.error("httpGet error:" + e.getMessage());
        }
        return Optional.empty();
    }

    @Override
    public Optional<String> calcLivePointsByEntry(int event, int entry) {
        try {
            return HttpUtils.httpGet(String.format(Constant.FPL_LIVE_ENTRY_POINTS, event, entry));
        } catch (IOException e) {
            log.error("httpGet error:" + e.getMessage());
        }
        return Optional.empty();
    }

    @Override
    public Optional<String> queryHermesInfoList() {
        try {
            return HttpUtils.httpGet(Constant.HERMES_GET_ALL);
        } catch (IOException e) {
            log.error("httpGet error:" + e.getMessage());
        }
        return Optional.empty();
    }

}
