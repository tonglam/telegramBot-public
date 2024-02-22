package com.tong.telegramBot.api;

import com.tong.telegramBot.domain.telegram.User;

import java.util.List;

/**
 * Create by tong on 2023/1/7
 */
public interface ILetletmeBotApi {

    void textNotification(String text, List<String> userList);

    void imageNotification(String url, String caption, List<String> userList);

}
