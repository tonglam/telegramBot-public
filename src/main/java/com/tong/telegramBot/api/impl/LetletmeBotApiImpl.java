package com.tong.telegramBot.api.impl;

import com.tong.telegramBot.api.ILetletmeBotApi;
import com.tong.telegramBot.domain.telegram.User;
import com.tong.telegramBot.service.INotificationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create by tong on 2023/1/7
 */
@Slf4j
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class LetletmeBotApiImpl implements ILetletmeBotApi {

    private final INotificationService notificationService;

    @Override
    public void textNotification(String text, List<String> userList) {
        this.notificationService.textNotification(text, userList);
    }

    @Override
    public void imageNotification(String url, String caption, List<String> userList) {
        this.notificationService.imageNotification(url, caption, userList);
    }

}
