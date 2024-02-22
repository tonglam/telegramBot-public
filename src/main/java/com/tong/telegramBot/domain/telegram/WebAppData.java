package com.tong.telegramBot.domain.telegram;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Describes data sent from a Web App to the bot.
 * <p>
 * Created by tong on 2022/08/23
 */
@Data
@Accessors(chain = true)
public class WebAppData {

    private String data; // The data. Be aware that a bad client can send arbitrary data in this field.
    @JsonProperty("button_text")
    private String buttonText; // Text of the web_app keyboard button from which the Web App was opened. Be aware that a bad client can send arbitrary data in this field.

}
