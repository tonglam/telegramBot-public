package com.tong.telegramBot.domain.telegram.inlineMode;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Describes an inline message sent by a Web App on behalf of a user.
 * <p>
 * Created by tong on 2022/08/24
 */
@Data
@Accessors(chain = true)
public class SentWebAppMessage {

    @JsonProperty("inline_message_id")
    private String inlineMessageId; // Optional. Identifier of the sent inline message. Available only if there is an inline keyboard attached to the message.

}
