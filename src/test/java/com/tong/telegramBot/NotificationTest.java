package com.tong.telegramBot;

import com.google.common.collect.Lists;
import com.tong.telegramBot.service.INotificationService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Create by tong on 2023/1/5
 */
public class NotificationTest extends TelegramBotApplicationTests {

    @Autowired
    private INotificationService notificationService;

    @ParameterizedTest
    @CsvSource({"TIME FOR PIZZA, xx"})
    void textNotification(String text, String user) {
        this.notificationService.textNotification(text, Lists.newArrayList(user));
    }

    @ParameterizedTest
    @CsvSource({"https://en.wikipedia.org/wiki/Pizza#/media/File:Eq_it-na_pizza-margherita_sep2005_sml.jpg, xx"})
    void imageNotification(String url, String user) {
        String caption = "TIME FOR PIZZA";
        this.notificationService.imageNotification(url, caption, Lists.newArrayList(user));
    }

    @Test
    void playerValueNotification() {
        this.notificationService.playerValueNotification();
    }

}
