package com.tong.telegramBot.domain.telegram.inlineMode;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tong.telegramBot.domain.telegram.InlineKeyboardMarkup;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Represents a contact with a phone number. By default, this contact will be sent by the user. Alternatively, you can use input_message_content to send a message with the specified content instead of the contact.
 * <p>
 * Created by tong on 2022/08/24
 */
@Getter
@Setter
@Accessors(chain = true)
public class InlineQueryResultContact extends InlineQueryResult {

    private String type; // Type of the result, must be contact
    private String id; // Unique identifier for this result, 1-64 Bytes
    @JsonProperty("phone_number")
    private String phoneNumber; // Contact's phone number
    @JsonProperty("first_name")
    private String firstName; // Contact's first name
    @JsonProperty("last_name")
    private String lastName; // Optional. Contact's last name
    private String vcard; // Optional. Additional data about the contact in the form of a vCard, 0-2048 bytes
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup; // Optional. Inline keyboard attached to the message
    @JsonProperty("input_message_content")
    private InputMessageContent inputMessageContent; // Optional. Content of the message to be sent instead of the venue
    @JsonProperty("thumb_url")
    private String thumbUrl; // Optional. Url of the thumbnail for the result
    @JsonProperty("thumb_width")
    private Integer thumbWidth; // Optional. Thumbnail width
    @JsonProperty("thumb_height")
    private Integer thumbHeight; // Optional. Thumbnail height

}
