package com.tong.telegramBot.domain.telegram.inlineMode;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tong.telegramBot.domain.telegram.InlineKeyboardMarkup;
import com.tong.telegramBot.domain.telegram.MessageEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * Represents a link to a photo. By default, this photo will be sent by the user with optional caption. Alternatively, you can use input_message_content to send a message with the specified content instead of the photo.
 * <p>
 * Created by tong on 2022/08/24
 */
@Getter
@Setter
@Accessors(chain = true)
public class InlineQueryResultPhoto extends InlineQueryResult {

    private String type; // Type of the result, must be photo
    private String id; // Unique identifier for this result, 1-64 bytes
    @JsonProperty("photo_url")
    private String photoUrl; // A valid URL of the photo. Photo must be in JPEG format. Photo size must not exceed 5MB
    @JsonProperty("thumb_url")
    private String thumbUrl; // URL of the thumbnail for the photo
    @JsonProperty("photo_width")
    private Integer photoWidth; // Optional. Width of the photo
    @JsonProperty("photo_height")
    private Integer photoHeight; // Optional. Height of the photo
    private String title; // Optional. Title for the result
    private String description; // Optional. Short description of the result
    private String caption; // Optional. Caption of the photo to be sent, 0-1024 characters after entities parsing
    @JsonProperty("parse_mode")
    private String parseMode; // Optional. Mode for parsing entities in the photo caption. See formatting options for more details.
    @JsonProperty("caption_entities")
    private List<MessageEntity> captionEntities; // Optional. List of special entities that appear in the caption, which can be specified instead of parse_mode
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup; // Optional. Inline keyboard attached to the message
    @JsonProperty("input_message_content")
    private InputMessageContent inputMessageContent; // Optional. Content of the message to be sent instead of the photo

}