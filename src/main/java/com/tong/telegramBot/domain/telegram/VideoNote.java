package com.tong.telegramBot.domain.telegram;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * This object represents a video message (available in Telegram apps as of v.4.0).
 * <p>
 * Created by tong on 2022/08/22
 */
@Data
@Accessors(chain = true)
public class VideoNote {

    @JsonProperty("file_id")
    private String fileId; // Identifier for this file, which can be used to download or reuse the file
    @JsonProperty("file_unique_id")
    private String fileUniqueId; // Unique identifier for this file, which is supposed to be the same over time and for different bots. Can't be used to download or reuse the file.
    private Integer length; // Video width and height (diameter of the video message) as defined by sender
    private Integer duration; // Duration of the video in seconds as defined by sender
    private PhotoSize thumb; // Optional. Video thumbnail
    @JsonProperty("file_size")
    private Integer fileSize; // Optional. File size in bytes

}
