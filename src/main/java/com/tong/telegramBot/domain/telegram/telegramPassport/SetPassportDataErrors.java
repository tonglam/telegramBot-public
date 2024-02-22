package com.tong.telegramBot.domain.telegram.telegramPassport;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * Informs a user that some of the Telegram Passport elements they provided contains errors. The user will not be able to re-submit their Passport to you until the errors are fixed (the contents of the field for which you returned the error must change). Returns True on success.
 * <p>
 * Use this if the data submitted by the user doesn't satisfy the standards your service requires for any reason. For example, if a birthday date seems invalid, a submitted document is blurry, a scan shows evidence of tampering, etc. Supply some details in the error message to make sure the user knows how to correct the issues.
 * <p>
 * Created by tong on 2022/08/23
 */
@Data
@Accessors(chain = true)
public class SetPassportDataErrors {

    @JsonProperty("user_id")
    private Integer userId; // User identifier
    private List<PassportElementError> errors; // A JSON-serialized array describing the errors

}
