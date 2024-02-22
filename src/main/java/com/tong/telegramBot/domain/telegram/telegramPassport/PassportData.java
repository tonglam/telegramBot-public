package com.tong.telegramBot.domain.telegram.telegramPassport;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * Describes Telegram Passport data shared with the bot by the user.
 * <p>
 * Created by tong on 2022/08/23
 */
@Data
@Accessors(chain = true)
public class PassportData {

    private List<EncryptedPassportElement> data; // Array with information about documents and other Telegram Passport elements that was shared with the bot
    private EncryptedCredentials credentials; // Encrypted credentials required to decrypt the data

}
