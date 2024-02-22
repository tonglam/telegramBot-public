package com.tong.telegramBot.domain.telegram.stickers;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by tong on 2022/08/25
 */
@Data
@Accessors(chain = true)
public class UploadStickerFile {

    @NotNull
    @JsonProperty("user_id")
    private Integer userId; // User identifier of sticker file owner
    @JsonProperty("png_sticker")
    private String pngSticker; // PNG image with the sticker, must be up to 512 kilobytes in size, dimensions must not exceed 512px, and either width or height must be exactly 512px. More information on Sending Files »

}
