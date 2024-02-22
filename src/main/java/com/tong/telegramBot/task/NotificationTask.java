package com.tong.telegramBot.task;

import com.tong.telegramBot.service.INotificationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Create by tong on 2023/1/4
 */
@Slf4j
@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class NotificationTask {

    private final INotificationService notificationService;

    @Scheduled(cron = "0 25-35 9 * * *")
    public void updatePlayerValue() {
        try {
            this.notificationService.playerValueNotification();
            log.info("updatePlayerValue run successfully");
        } catch (Exception e) {
            log.error("updatePlayerValue", e);
            e.printStackTrace();
        }
    }

}


