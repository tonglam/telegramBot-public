package com.tong.telegramBot.domain.telegram.telegramPassport;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * Represents an issue with a list of scans. The error is considered resolved when the list of files containing the scans changes.
 * <p>
 * Created by tong on 2022/08/23
 */
@Getter
@Setter
@Accessors(chain = true)
public class PassportElementErrorFiles extends PassportElementError {

    private String source; // Error source, must be files
    private String type; // The section of the user's Telegram Passport which has the issue, one of “utility_bill”, “bank_statement”, “rental_agreement”, “passport_registration”, “temporary_registration”
    @JsonProperty("file_hashes")
    private List<String> fileHashes; // List of base64-encoded file hashes
    private String message; // Error message

}
