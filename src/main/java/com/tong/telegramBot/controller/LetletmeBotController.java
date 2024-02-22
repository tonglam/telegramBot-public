package com.tong.telegramBot.controller;

import com.tong.telegramBot.api.ILetletmeBotApi;
import com.tong.telegramBot.domain.bot.common.NoticeData;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by tong on 2023/1/7
 */
@Slf4j
@RestController
@RequestMapping("/telegramBot/letletme")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class LetletmeBotController {

    private final ILetletmeBotApi letletmeBotApi;

    @PostMapping("/textNotification")
    @ResponseBody
    public void textNotification(@RequestBody NoticeData noticeData) {
        if (StringUtils.isEmpty(noticeData.getText())) {
            return;
        }
        this.letletmeBotApi.textNotification(noticeData.getText(), noticeData.getUserList());
    }

    @PostMapping("/imageNotification")
    @ResponseBody
    public void imageNotification(@RequestBody NoticeData noticeData) {
        if (StringUtils.isEmpty(noticeData.getImgUrl())) {
            return;
        }
        this.letletmeBotApi.imageNotification(noticeData.getImgUrl(), noticeData.getImgCaption(), noticeData.getUserList());
    }

}
