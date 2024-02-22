package com.tong.telegramBot.domain.telegram.stickers;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Use this method to create a new sticker set owned by a user. The bot will be able to edit the sticker set thus created. You must use exactly one of the fields png_sticker, tgs_sticker, or webm_sticker. Returns True on success.
 * <p>
 * Created by tong on 2022/08/25
 */
@Data
@Accessors(chain = true)
public class CreateNewStickerSet {

    @NotNull
    @JsonProperty("user_id")
    private Integer userId; // User identifier of created sticker set owner
    @NotNull
    private String name; // Short name of sticker set, to be used in t.me/addstickers/ URLs (e.g., animals). Can contain only English letters, digits and underscores. Must begin with a letter, can't contain consecutive underscores and must end in "_by_<bot_username>". <bot_username> is case insensitive. 1-64 characters.
    @NotNull
    private String title; // Sticker set title, 1-64 characters
    @JsonProperty("png_sticker")
    private String pngSticker; // PNG image with the sticker, must be up to 512 kilobytes in size, dimensions must not exceed 512px, and either width or height must be exactly 512px. Pass a file_id as a String to send a file that already exists on the Telegram servers, pass an HTTP URL as a String for Telegram to get a file from the Internet, or upload a new one using multipart/form-data. More information on Sending Files »
    @JsonProperty("tgs_sticker")
    private String tgsSticker; // TGS animation with the sticker, uploaded using multipart/form-data. See https://core.telegram.org/stickers#animated-sticker-requirements for technical requirements
    @JsonProperty("webm_sticker")
    private String webmSticker; // WEBM video with the sticker, uploaded using multipart/form-data. See https://core.telegram.org/stickers#video-sticker-requirements for technical requirements
    @JsonProperty("sticker_type")
    private String stickerType; // Type of stickers in the set, pass “regular” or “mask”. Custom emoji sticker sets can't be created via the Bot API at the moment. By default, a regular sticker set is created.
    @NotNull
    private String emojis; // One or more emoji corresponding to the sticker
    @JsonProperty("mask_position")
    private MaskPosition maskPosition; // A JSON-serialized object for position where the mask should be placed on faces

}
