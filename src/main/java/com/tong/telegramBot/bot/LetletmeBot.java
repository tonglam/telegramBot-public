package com.tong.telegramBot.bot;

import com.google.common.base.CaseFormat;
import com.tong.telegramBot.constant.Constant;
import com.tong.telegramBot.constant.SpecialCommandType;
import com.tong.telegramBot.domain.bot.common.NoticeData;
import com.tong.telegramBot.domain.bot.common.UserInfoData;
import com.tong.telegramBot.service.ILetletmeBotCommandService;
import com.tong.telegramBot.utils.CommonUtils;
import com.tong.telegramBot.utils.RedisUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.telegram.telegrambots.meta.api.objects.Chat;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.List;

/**
 * Create by tong on 2023/1/2
 */
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class LetletmeBot extends BaseBot {

    private final ILetletmeBotCommandService letletmeBotCommandService;

    @Override
    public String getBotUsername() {
        return Constant.BOT_USERNAME;
    }

    @Override
    public String getBotToken() {
        return Constant.BOT_TOKEN;
    }

    @Override
    public void onUpdateReceived(Update update) {
        this.saveUserInfo(update);
        String text = update.getMessage().getText();
        if (StringUtils.isBlank(text)) {
            return;
        }
        Object result = null;
        boolean isCommand = false;
        if (text.contains("/")) {
            isCommand = true;
        }
        if (isCommand) {
            result = this.processCommand(text);
        }
        if (result == null) {
            return;
        }
        String type = this.getCommandType(StringUtils.substringAfter(text, "/"));
        switch (type) {
            case "message": {
                String message = (String) result;
                if (StringUtils.isEmpty(message)) {
                    return;
                }
                this.sendTextNotification(message, update.getMessage().getChatId());
                break;
            }
            case "photo": {
                List<NoticeData> list = this.letletmeBotCommandService.hermesAll();
                if (CollectionUtils.isEmpty(list)) {
                    return;
                }
                list.forEach(o -> this.sendImageNotification(o.getImgUrl(), o.getImgCaption(), update.getMessage().getChatId()));
                break;
            }
        }
    }

    // save telegram user_info
    private void saveUserInfo(Update update) {
        Chat chat = update.getMessage().getChat();
        if (chat == null) {
            return;
        }
        UserInfoData userInfoData = new UserInfoData().setChatId(chat.getId()).setType(chat.getType());
        if (StringUtils.equals("supergroup", chat.getType()) || StringUtils.equals("group", chat.getType())) {
            userInfoData.setTitle(chat.getTitle()).setHashKey(chat.getTitle());
        } else if (StringUtils.equals("private", chat.getType())) {
            userInfoData.setFirstName(chat.getFirstName()).setLastName(chat.getLastName()).setUserName(chat.getUserName()).setHashKey(chat.getUserName());
        }
        RedisUtils.setHashValue(Constant.BOT_USER_INFO_KEY, userInfoData.getHashKey(), userInfoData);
    }

    // get command type
    private String getCommandType(String text) {
        String type = SpecialCommandType.getSpecialCommandType(text);
        if (StringUtils.isEmpty(type)) {
            return "message";
        }
        return type;
    }

    // process bot command
    private Object processCommand(String text) {
        if (text.contains("@")) {
            text = StringUtils.substringBefore(text, "@");
        }
        Object result;
        // parse command
        String methodName;
        String args;
        if (!text.contains(" ")) {
            methodName = StringUtils.substringAfter(text, "/");
            args = null;
        } else {
            methodName = StringUtils.substringBetween(text, "/", " ");
            args = StringUtils.substringAfter(text, " ");
        }
        if (methodName.contains("_")) {
            methodName = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, methodName);
        }
        result = CommonUtils.invokeBotCommandService(methodName, args);
        return result;
    }

}
