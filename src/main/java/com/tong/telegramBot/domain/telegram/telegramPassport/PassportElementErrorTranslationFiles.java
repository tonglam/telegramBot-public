package com.tong.telegramBot.domain.telegram.telegramPassport;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * Represents an issue with the translated version of a document. The error is considered resolved when a file with the document translation change.
 * <p>
 * Created by tong on 2022/08/23
 */
@Getter
@Setter
@Accessors(chain = true)
public class PassportElementErrorTranslationFiles extends PassportElementError {

    private String source; // Error source, must be translation_files
    private String type; // Type of element of the user's Telegram Passport which has the issue, one of “passport”, “driver_license”, “identity_card”, “internal_passport”, “utility_bill”, “bank_statement”, “rental_agreement”, “passport_registration”, “temporary_registration”
    @JsonProperty("file_hashes")
    private List<String> fileHashes; // List of base64-encoded file hashes
    private String message; // Error message

}
