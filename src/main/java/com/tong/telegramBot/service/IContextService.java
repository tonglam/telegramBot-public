package com.tong.telegramBot.service;

import com.tong.telegramBot.domain.bot.letletme.LiveCalcData;

import java.util.Map;

/**
 * Create by tong on 2023/1/7
 */
public interface IContextService {

    String price(String priceChange);

    String ddl(Map<String, String> map);

    String live(LiveCalcData liveCalcData);

}
