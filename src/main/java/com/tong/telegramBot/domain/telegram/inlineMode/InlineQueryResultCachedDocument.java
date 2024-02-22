package com.tong.telegramBot.domain.telegram.inlineMode;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tong.telegramBot.domain.telegram.InlineKeyboardMarkup;
import com.tong.telegramBot.domain.telegram.MessageEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * Represents a link to a file stored on the Telegram servers. By default, this file will be sent by the user with an optional caption. Alternatively, you can use input_message_content to send a message with the specified content instead of the file.
 * <p>
 * Created by tong on 2022/08/24
 */
@Getter
@Setter
@Accessors(chain = true)
public class InlineQueryResultCachedDocument extends InputMessageContent {

    private String type; // Type of the result, must be document
    private String id; // Unique identifier for this result, 1-64 bytes
    private String title; // Title for the result
    @JsonProperty("document_file_id")
    private String documentFileId; // A valid file identifier for the file
    private String description; // Optional. Short description of the result
    private String caption; // Optional. Caption of the document to be sent, 0-1024 characters after entities parsing
    @JsonProperty("parse_mode")
    private String parseMode; // Optional. Mode for parsing entities in the caption. See formatting options for more details.
    @JsonProperty("caption_entities")
    private List<MessageEntity> captionEntities; // Optional. List of special entities that appear in the caption, which can be specified instead of parse_mode
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup; // Optional. Inline keyboard attached to the message
    @JsonProperty("input_message_content")
    private InputMessageContent inputMessageContent; // Optional. Content of the message to be sent instead of the photo

}
