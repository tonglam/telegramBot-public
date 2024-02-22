package com.tong.telegramBot.domain.telegram;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by tong on 2022/08/23
 */
@Data
@Accessors(chain = true)
public class MessageAutoDeleteTimerChanged {

    @JsonProperty("message_id")
    private Integer messageAutoDeleteTime; // New auto-delete time for messages in the chat; in seconds

}
