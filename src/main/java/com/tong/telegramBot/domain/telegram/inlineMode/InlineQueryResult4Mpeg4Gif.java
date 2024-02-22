package com.tong.telegramBot.domain.telegram.inlineMode;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tong.telegramBot.domain.telegram.InlineKeyboardMarkup;
import com.tong.telegramBot.domain.telegram.MessageEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * Represents a link to a video animation (H.264/MPEG-4 AVC video without sound). By default, this animated MPEG-4 file will be sent by the user with optional caption. Alternatively, you can use input_message_content to send a message with the specified content instead of the animation.
 * <p>
 * Created by tong on 2022/08/24
 */
@Getter
@Setter
@Accessors(chain = true)
public class InlineQueryResult4Mpeg4Gif extends InlineQueryResult {

    private String type; // Type of the result, must be mpeg4_gif
    private String id; // Unique identifier for this result, 1-64 bytes
    @JsonProperty("mpeg4_url")
    private String mpeg4Url; // A valid URL for the MPEG4 file. File size must not exceed 1MB
    @JsonProperty("mpeg4_width")
    private Integer mpeg4Width; // Optional. Video width
    @JsonProperty("mpeg4_height")
    private Integer mpeg4Height; // Optional. Video height
    @JsonProperty("mpeg4_duration")
    private Integer mpeg4Duration; // Optional. Video duration in seconds
    @JsonProperty("thumb_url")
    private String thumbUrl; // URL of the static (JPEG or GIF) or animated (MPEG4) thumbnail for the result
    @JsonProperty("thumb_mime_type")
    private String thumbMimeType; // Optional. MIME type of the thumbnail, must be one of “image/jpeg”, “image/gif”, or “video/mp4”. Defaults to “image/jpeg”
    private String title; // Optional. Title for the result
    private String caption; // Optional. Caption of the MPEG-4 file to be sent, 0-1024 characters after entities parsing
    @JsonProperty("parse_mode")
    private String parseMode; // Optional. Mode for parsing entities in the caption. See formatting options for more details.
    @JsonProperty("caption_entities")
    private List<MessageEntity> captionEntities; // Optional. List of special entities that appear in the caption, which can be specified instead of parse_mode
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup; // Optional. Inline keyboard attached to the message
    @JsonProperty("input_message_content")
    private InputMessageContent inputMessageContent; // Optional. Content of the message to be sent instead of the GIF animation

}
