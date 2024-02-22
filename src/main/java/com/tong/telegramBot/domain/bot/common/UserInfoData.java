package com.tong.telegramBot.domain.bot.common;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Create by tong on 2023/1/5
 */
@Data
@Accessors(chain = true)
public class UserInfoData {

    private long chatId;
    private String type;
    private String firstName;
    private String lastName;
    private String userName;
    private String title;
    private String hashKey;
    private int entry;

}
