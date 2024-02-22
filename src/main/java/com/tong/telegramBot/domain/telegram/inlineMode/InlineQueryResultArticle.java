package com.tong.telegramBot.domain.telegram.inlineMode;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tong.telegramBot.domain.telegram.InlineKeyboardMarkup;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Represents a link to an article or web page.
 * <p>
 * Created by tong on 2022/08/24
 */
@Getter
@Setter
@Accessors(chain = true)
public class InlineQueryResultArticle extends InlineQueryResult {

    private String type; // Type of the result, must be article
    private String id; // Unique identifier for this result, 1-64 Bytes
    private String title; // Title of the result
    @JsonProperty("input_message_content")
    private InputMessageContent inputMessageContent; // Content of the message to be sent
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup; // Optional. Inline keyboard attached to the message
    private String url; // Optional. URL of the result
    @JsonProperty("hide_url")
    private Boolean hideUrl; // Optional. Pass True if you don't want the URL to be shown in the message
    private String description; // Optional. Short description of the result
    @JsonProperty("thumb_url")
    private String thumbUrl; // Optional. Url of the thumbnail for the result
    @JsonProperty("thumb_width")
    private Integer thumbWidth; // Optional. Thumbnail width
    @JsonProperty("thumb_height")
    private Integer thumbHeight; // Optional. Thumbnail height

}
