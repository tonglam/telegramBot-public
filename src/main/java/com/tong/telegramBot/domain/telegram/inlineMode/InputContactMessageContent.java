package com.tong.telegramBot.domain.telegram.inlineMode;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Represents the content of a contact message to be sent as the result of an inline query.
 * <p>
 * Created by tong on 2022/08/24
 */
@Getter
@Setter
@Accessors(chain = true)
public class InputContactMessageContent extends InputMessageContent {

    @JsonProperty("phone_number")
    private String phoneNumber; // Contact's phone number
    @JsonProperty("first_name")
    private String firstName; // Contact's first name
    @JsonProperty("last_name")
    private String lastName; // Optional. Contact's last name
    private String vcard; // Optional. Additional data about the contact in the form of a vCard, 0-2048 bytes

}
