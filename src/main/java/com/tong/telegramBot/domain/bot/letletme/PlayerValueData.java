package com.tong.telegramBot.domain.bot.letletme;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Create by tong on 2023/1/2
 */
@Data
@Accessors(chain = true)
public class PlayerValueData {

    private int element;
    private int code;
    private int price;
    private int startPrice;
    private int elementType;
    private String firstName;
    private String secondName;
    private String webName;
    private int teamId;

}
