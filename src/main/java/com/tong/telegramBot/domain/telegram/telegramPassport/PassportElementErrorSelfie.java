package com.tong.telegramBot.domain.telegram.telegramPassport;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Represents an issue with the selfie with a document. The error is considered resolved when the file with the selfie changes.
 * <p>
 * Created by tong on 2022/08/23
 */
@Getter
@Setter
@Accessors(chain = true)
public class PassportElementErrorSelfie extends PassportElementError {

    private String source; // Error source, must be selfie
    private String type; // The section of the user's Telegram Passport which has the issue, one of “passport”, “driver_license”, “identity_card”, “internal_passport”
    @JsonProperty("file_hash")
    private String fileHash; // Base64-encoded hash of the file with the selfie
    private String message; // Error message

}
