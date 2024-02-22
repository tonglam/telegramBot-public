package com.tong.telegramBot.domain.telegram.availableTypes;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * This object represents a chat photo.
 * <p>
 * Created by tong on 2022/08/22
 */
@Data
@Accessors(chain = true)
public class ChatPhoto {

    private String smallFileId; // File identifier of small (160x160) chat photo. This file_id can be used only for photo download and only for as long as the photo is not changed.
    private String smallFileUniqueId; // Unique file identifier of small (160x160) chat photo, which is supposed to be the same over time and for different bots. Can't be used to download or reuse the file
    private String bigFileId; // Unique file identifier of small (160x160) chat photo, which is supposed to be the same over time and for different bots. Can't be used to download or reuse the file
    private String bigFileUniqueId; // Unique file identifier of big (640x640) chat photo, which is supposed to be the same over time and for different bots. Can't be used to download or reuse the file.

}
