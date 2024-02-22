package com.tong.telegramBot.domain.telegram.stickers;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tong.telegramBot.domain.telegram.File;
import com.tong.telegramBot.domain.telegram.PhotoSize;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * This object represents a sticker.
 * <p>
 * Created by tong on 2022/08/22
 */
@Data
@Accessors(chain = true)
public class Sticker {

    @JsonProperty("file_id")
    private String fileId; // Identifier for this file, which can be used to download or reuse the file
    @JsonProperty("file_unique_id")
    private String fileUniqueId; // Unique identifier for this file, which is supposed to be the same over time and for different bots. Can't be used to download or reuse the file.
    private String type; // Type of the sticker, currently one of “regular”, “mask”, “custom_emoji”. The type of the sticker is independent from its format, which is determined by the fields is_animated and is_video.
    private Integer width; // Sticker width
    private Integer height; // Sticker height
    @JsonProperty("is_animated")
    private Boolean isAnimated; // True, if the sticker is animated
    @JsonProperty("is_video")
    private Boolean isVideo; // True, if the sticker is a video sticker
    private PhotoSize thumb; // Optional. Sticker thumbnail in the .WEBP or .JPG format
    private String emoji; // Optional. Emoji associated with the sticker
    @JsonProperty("set_name")
    private String setName; // Optional. Name of the sticker set to which the sticker belongs
    @JsonProperty("premium_animation")
    private File premiumAnimation; // Optional. For premium regular stickers, premium animation for the sticker
    @JsonProperty("mask_position")
    private MaskPosition maskPosition; // Optional. For mask stickers, the position where the mask should be placed
    @JsonProperty("custom_emoji_id")
    private String customEmojiId; // Optional. For custom emoji stickers, unique identifier of the custom emoji
    @JsonProperty("file_size")
    private Integer fileSize; // Optional. File size in bytes

}
