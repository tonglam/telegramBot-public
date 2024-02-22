package com.tong.telegramBot.domain.telegram.inlineMode;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tong.telegramBot.domain.telegram.InlineKeyboardMarkup;
import com.tong.telegramBot.domain.telegram.MessageEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * Represents a link to a page containing an embedded video player or a video file. By default, this video file will be sent by the user with an optional caption. Alternatively, you can use input_message_content to send a message with the specified content instead of the video.
 * <p>
 * Created by tong on 2022/08/24
 */
@Getter
@Setter
@Accessors(chain = true)
public class InlineQueryResultVideo extends InlineQueryResult {

    private String type; // Type of the result, must be video
    private String id; // Unique identifier for this result, 1-64 bytes
    @JsonProperty("video_url")
    private String videoUrl; // A valid URL for the embedded video player or video file
    @JsonProperty("mime_type")
    private String mimeType; // MIME type of the content of the video URL, “text/html” or “video/mp4”
    @JsonProperty("thumb_url")
    private String thumbUrl; // URL of the thumbnail (JPEG only) for the video
    private String title; // Title for the result
    private String caption; // Optional. Caption of the video to be sent, 0-1024 characters after entities parsing
    @JsonProperty("parse_mode")
    private String parseMode; // Optional. Mode for parsing entities in the video caption. See formatting options for more details.
    @JsonProperty("caption_entities")
    private List<MessageEntity> captionEntities; // Optional. List of special entities that appear in the caption, which can be specified instead of parse_mode
    @JsonProperty("video_width")
    private Integer videoWidth; // Optional. Video width
    @JsonProperty("video_height")
    private Integer videoHeight; // Optional. Video height
    @JsonProperty("video_duration")
    private Integer videoDuration; // Optional. Video duration in seconds
    private String description; // Optional. Title for the result
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup; // Optional. Inline keyboard attached to the message
    @JsonProperty("input_message_content")
    private InputMessageContent inputMessageContent; // Optional. Content of the message to be sent instead of the video. This field is required if InlineQueryResultVideo is used to send an HTML-page as a result (e.g., a YouTube video).

}
