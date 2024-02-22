package com.tong.telegramBot.bot;

import com.tong.telegramBot.domain.bot.common.UserInfoData;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

/**
 * Create by tong on 2023/1/6
 */
public class BaseBot extends TelegramLongPollingBot {

    public void sendTextNotification(String text, Long chatId) {
        SendMessage message = new SendMessage();
        message.setText(text);
        message.setChatId(chatId);
        try {
            this.execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public void sendTextNotification(String text, UserInfoData userInfo) {
        SendMessage message = new SendMessage();
        message.setText(text);
        message.setChatId(userInfo.getChatId());
        try {
            this.execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public void sendImageNotification(String url, String caption, Long chatId) {
        SendPhoto photo = new SendPhoto();
        photo.setPhoto(new InputFile(url));
        photo.setCaption(caption);
        photo.setChatId(chatId);
        try {
            this.execute(photo);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    public void sendImageNotification(String url, String caption, UserInfoData userInfo) {
        SendPhoto photo = new SendPhoto();
        photo.setPhoto(new InputFile(url));
        photo.setCaption(caption);
        photo.setChatId(userInfo.getChatId());
        try {
            this.execute(photo);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getBotUsername() {
        return null;
    }

    @Override
    public String getBotToken() {
        return null;
    }

    @Override
    public void onUpdateReceived(Update update) {

    }

}
