package com.tong.telegramBot.domain.telegram.inlineMode;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tong.telegramBot.domain.telegram.InlineKeyboardMarkup;
import com.tong.telegramBot.domain.telegram.MessageEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * Represents a link to a file. By default, this file will be sent by the user with an optional caption. Alternatively, you can use input_message_content to send a message with the specified content instead of the file. Currently, only .PDF and .ZIP files can be sent using this method.
 * <p>
 * Created by tong on 2022/08/24
 */
@Getter
@Setter
@Accessors(chain = true)
public class InlineQueryResultDocument extends InlineQueryResult {

    private String type; // Type of the result, must be document
    private String id; // Unique identifier for this result, 1-64 bytes
    private String title; // Title for the result
    private String caption; // Optional. Caption of the document to be sent, 0-1024 characters after entities parsing
    @JsonProperty("parse_mode")
    private String parseMode; // Optional. Mode for parsing entities in the document caption. See formatting options for more details.
    @JsonProperty("caption_entities")
    private List<MessageEntity> captionEntities; // Optional. List of special entities that appear in the caption, which can be specified instead of parse_mode
    @JsonProperty("document_url")
    private String documentUrl; // A valid URL for the file
    @JsonProperty("mime_type")
    private String mimeType; // MIME type of the content of the file, either “application/pdf” or “application/zip”
    private String description; // Optional. Short description of the result
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup; // Optional. Inline keyboard attached to the message
    @JsonProperty("input_message_content")
    private InputMessageContent inputMessageContent; // Optional. Content of the message to be sent instead of the file
    @JsonProperty("thumb_url")
    private String thumbUrl; // Optional. URL of the thumbnail (JPEG only) for the file
    @JsonProperty("thumb_width")
    private Integer thumbWidth; // Optional. Thumbnail width
    @JsonProperty("thumb_height")
    private Integer thumbHeight; // Optional. Thumbnail height

}
