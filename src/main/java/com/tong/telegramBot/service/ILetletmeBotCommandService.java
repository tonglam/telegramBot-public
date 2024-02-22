package com.tong.telegramBot.service;

import com.tong.telegramBot.domain.bot.common.NoticeData;

import java.util.List;

/**
 * Create by tong on 2023/1/2
 */
public interface ILetletmeBotCommandService {

    String priceChange();

    String ddl();

    String live();

    String live(String entryStr);

    List<NoticeData> hermesAll();

}
