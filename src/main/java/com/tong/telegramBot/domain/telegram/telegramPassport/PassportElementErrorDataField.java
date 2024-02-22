package com.tong.telegramBot.domain.telegram.telegramPassport;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Represents an issue in one of the data fields that was provided by the user. The error is considered resolved when the field's value changes.
 * <p>
 * Created by tong on 2022/08/23
 */
@Getter
@Setter
@Accessors(chain = true)
public class PassportElementErrorDataField extends PassportElementError {

    private String source; // Error source, must be data
    private String type; // The section of the user's Telegram Passport which has the error, one of “personal_details”, “passport”, “driver_license”, “identity_card”, “internal_passport”, “address”
    @JsonProperty("field_name")
    private String fieldName; // Name of the data field which has the error
    @JsonProperty("data_hash")
    private String dataHash; // Base64-encoded data hash
    private String message; // Error message

}
