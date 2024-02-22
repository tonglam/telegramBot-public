package com.tong.telegramBot.domain.bot.common;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * Create by tong on 2023/1/7
 */
@Data
@Accessors(chain = true)
public class NoticeData {

    private List<String> userList;
    private String text;
    private String imgUrl;
    private String imgCaption;
    private boolean newEntry;

}
