package com.tong.telegramBot.domain.telegram.inlineMode;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Represents the content of a text message to be sent as the result of an inline query.
 * <p>
 * Created by tong on 2022/08/24
 */
@Getter
@Setter
@Accessors(chain = true)
public class InputTextMessageContent extends InputMessageContent {

    @JsonProperty("message_text")
    private String messageText; // Text of the message to be sent, 1-4096 characters
    @JsonProperty("parse_mode")
    private String parseMode; // Optional. Mode for parsing entities in the message text. See formatting options for more details.
    private String entities; // Optional. List of special entities that appear in message text, which can be specified instead of parse_mode
    @JsonProperty("disable_web_page_preview")
    private Boolean disableWebPagePreview; // Optional. Disables link previews for links in the sent message

}
