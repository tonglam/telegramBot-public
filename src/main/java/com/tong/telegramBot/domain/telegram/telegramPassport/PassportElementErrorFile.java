package com.tong.telegramBot.domain.telegram.telegramPassport;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Represents an issue with a document scan. The error is considered resolved when the file with the document scan changes.
 * <p>
 * Created by tong on 2022/08/23
 */
@Getter
@Setter
@Accessors(chain = true)
public class PassportElementErrorFile extends PassportElementError {

    private String source; // Error source, must be file
    private String type; // The section of the user's Telegram Passport which has the issue, one of “utility_bill”, “bank_statement”, “rental_agreement”, “passport_registration”, “temporary_registration”
    @JsonProperty("file_hash")
    private String fileHash; // Base64-encoded file hash
    private String message; // Error message

}
