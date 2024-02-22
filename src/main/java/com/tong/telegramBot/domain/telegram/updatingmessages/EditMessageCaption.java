package com.tong.telegramBot.domain.telegram.updatingmessages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tong.telegramBot.domain.telegram.InlineKeyboardMarkup;
import com.tong.telegramBot.domain.telegram.MessageEntity;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * Use this method to edit captions of messages. On success, if the edited message is not an inline message, the edited Message is returned, otherwise True is returned.
 * <p>
 * Created by tong on 2022/08/25
 */
@Data
@Accessors(chain = true)
public class EditMessageCaption {

    @JsonProperty("chat_id")
    private String chatId; // Required if inline_message_id is not specified. Unique identifier for the target chat or username of the target channel (in the format @channelusername)
    @JsonProperty("message_id")
    private Integer messageId; // Required if inline_message_id is not specified. Identifier of the message to edit
    @JsonProperty("inline_message_id")
    private String inlineMessageId; // Required if chat_id and message_id are not specified. Identifier of the inline message
    private String caption; // New caption of the message, 0-1024 characters after entities parsing
    @JsonProperty("parse_mode")
    private String parseMode; // Mode for parsing entities in the message caption. See formatting options for more details.
    private List<MessageEntity> entities; // A JSON-serialized list of special entities that appear in the caption, which can be specified instead of parse_mode
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup; // A JSON-serialized object for an inline keyboard.

}
