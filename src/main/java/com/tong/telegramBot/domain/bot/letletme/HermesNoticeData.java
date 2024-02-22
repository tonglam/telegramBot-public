package com.tong.telegramBot.domain.bot.letletme;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Create by tong on 2023/1/6
 */
@Data
@Accessors(chain = true)
public class HermesNoticeData {

    private String id;
    private String name;
    private String img;
    private String href;
    private String price;
    private boolean newEntry;
    private String updateTime;

}
