package com.tong.telegramBot.domain.telegram.telegramPassport;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Represents an issue in an unspecified place. The error is considered resolved when new data is added.
 * <p>
 * Created by tong on 2022/08/23
 */
@Getter
@Setter
@Accessors(chain = true)
public class PassportElementErrorUnspecified extends PassportElementError {

    private String source; // Error source, must be unspecified
    private String type; // Type of element of the user's Telegram Passport which has the issue
    @JsonProperty("file_hash")
    private String fileHash; // Base64-encoded element hash
    private String message; // Error message

}
