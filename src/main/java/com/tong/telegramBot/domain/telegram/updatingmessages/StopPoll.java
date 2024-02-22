package com.tong.telegramBot.domain.telegram.updatingmessages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tong.telegramBot.domain.telegram.InlineKeyboardMarkup;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Use this method to stop a poll which was sent by the bot. On success, the stopped Poll is returned.
 * <p>
 * Created by tong on 2022/08/25
 */
@Data
@Accessors(chain = true)
public class StopPoll {

    @JsonProperty("chat_id")
    private String chatId; // Required if inline_message_id is not specified. Unique identifier for the target chat or username of the target channel (in the format @channelusername)
    @JsonProperty("message_id")
    private Integer messageId; // Required if inline_message_id is not specified. Identifier of the message to edit
    @JsonProperty("inline_message_id")
    private String inlineMessageId; // Required if chat_id and message_id are not specified. Identifier of the inline message
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup; // A JSON-serialized object for an inline keyboard.

}
