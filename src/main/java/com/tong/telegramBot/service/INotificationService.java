package com.tong.telegramBot.service;

import java.util.List;

/**
 * Create by tong on 2023/1/5
 */
public interface INotificationService {

    void textNotification(String text, List<String> userList);

    void imageNotification(String url, String caption, List<String> userList);

    void playerValueNotification();

}
