package com.tong.telegramBot.domain.telegram.telegramPassport;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * This object represents a file uploaded to Telegram Passport. Currently all Telegram Passport files are in JPEG format when decrypted and don't exceed 10MB.
 * <p>
 * Created by tong on 2022/08/23
 */
@Data
@Accessors(chain = true)
public class PassportFile {

    @JsonProperty("file_id")
    private String fileId; // Identifier for this file, which can be used to download or reuse the file
    @JsonProperty("file_unique_id")
    private String fileUniqueId; // Unique identifier for this file, which is supposed to be the same over time and for different bots. Can't be used to download or reuse the file.
    @JsonProperty("file_size")
    private Integer fileSize; // File size in bytes
    @JsonProperty("file_date")
    private Integer fileDate; // Unix time when the file was uploaded

}
