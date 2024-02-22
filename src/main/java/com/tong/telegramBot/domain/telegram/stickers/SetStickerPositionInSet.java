package com.tong.telegramBot.domain.telegram.stickers;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Use this method to move a sticker in a set created by the bot to a specific position. Returns True on success.
 * <p>
 * Created by tong on 2022/08/25
 */
@Data
@Accessors(chain = true)
public class SetStickerPositionInSet {

    @NotNull
    private String sticker; // File identifier of the sticker
    @NotNull
    private Integer position; // New sticker position in the set, zero-based

}
