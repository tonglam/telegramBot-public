package com.tong.telegramBot.domain.telegram.telegramPassport;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Represents an issue with the reverse side of a document. The error is considered resolved when the file with reverse side of the document changes.
 * <p>
 * Created by tong on 2022/08/23
 */
@Getter
@Setter
@Accessors(chain = true)
public class PassportElementErrorReverseSide extends PassportElementError {

    private String source; // Error source, must be reverse_side
    private String type; // The section of the user's Telegram Passport which has the issue, one of “driver_license”, “identity_card”
    @JsonProperty("file_hash")
    private String fileHash; // Base64-encoded hash of the file with the reverse side of the document
    private String message; // Error message

}
