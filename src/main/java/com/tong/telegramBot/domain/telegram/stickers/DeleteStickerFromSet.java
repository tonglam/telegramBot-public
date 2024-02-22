package com.tong.telegramBot.domain.telegram.stickers;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Use this method to delete a sticker from a set created by the bot. Returns True on success.
 * <p>
 * Created by tong on 2022/08/25
 */
@Data
@Accessors(chain = true)
public class DeleteStickerFromSet {

    @NotNull
    private String sticker; // File identifier of the sticker

}
