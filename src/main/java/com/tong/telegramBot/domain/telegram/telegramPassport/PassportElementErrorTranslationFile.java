package com.tong.telegramBot.domain.telegram.telegramPassport;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Represents an issue with one of the files that constitute the translation of a document. The error is considered resolved when the file changes.
 * <p>
 * Created by tong on 2022/08/23
 */
@Getter
@Setter
@Accessors(chain = true)
public class PassportElementErrorTranslationFile extends PassportElementError {

    private String source; // Error source, must be translation_file
    private String type; // Type of element of the user's Telegram Passport which has the issue, one of “passport”, “driver_license”, “identity_card”, “internal_passport”, “utility_bill”, “bank_statement”, “rental_agreement”, “passport_registration”, “temporary_registration”
    @JsonProperty("file_hash")
    private String fileHash; // Base64-encoded file hash
    private String message; // Error message

}
