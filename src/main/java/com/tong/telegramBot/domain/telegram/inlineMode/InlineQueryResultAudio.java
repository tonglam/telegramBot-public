package com.tong.telegramBot.domain.telegram.inlineMode;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tong.telegramBot.domain.telegram.InlineKeyboardMarkup;
import com.tong.telegramBot.domain.telegram.MessageEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * Represents a link to an MP3 audio file. By default, this audio file will be sent by the user. Alternatively, you can use input_message_content to send a message with the specified content instead of the audio.
 * <p>
 * Created by tong on 2022/08/24
 */
@Getter
@Setter
@Accessors(chain = true)
public class InlineQueryResultAudio extends InlineQueryResult {

    private String type; // Type of the result, must be audio
    private String id; // Unique identifier for this result, 1-64 bytes
    @JsonProperty("audio_url")
    private String audioUrl; // A valid URL for the audio file
    private String title; // Title
    private String caption; // Optional. Caption, 0-1024 characters after entities parsing
    @JsonProperty("parse_mode")
    private String parseMode; // Optional. Mode for parsing entities in the audio caption. See formatting options for more details.
    @JsonProperty("caption_entities")
    private List<MessageEntity> captionEntities; // Optional. List of special entities that appear in the caption, which can be specified instead of parse_mode
    private String performer; // Optional. Performer
    @JsonProperty("audio_duration")
    private Integer audioDuration; // Optional. Audio duration in seconds
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup; // Optional. Inline keyboard attached to the message
    @JsonProperty("input_message_content")
    private InputMessageContent inputMessageContent; // Optional. Content of the message to be sent instead of the video. This field is required if InlineQueryResultVideo is used to send an HTML-page as a result (e.g., a YouTube video).

}
