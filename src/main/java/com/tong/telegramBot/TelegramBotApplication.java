package com.tong.telegramBot;

import com.tong.telegramBot.bot.LetletmeBot;
import com.tong.telegramBot.service.ILetletmeBotCommandService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@EnableScheduling
@SpringBootApplication
public class TelegramBotApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext app = SpringApplication.run(TelegramBotApplication.class, args);
        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            ILetletmeBotCommandService letletmeBotService = app.getBean(ILetletmeBotCommandService.class);
            botsApi.registerBot(new LetletmeBot(letletmeBotService));
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

}
