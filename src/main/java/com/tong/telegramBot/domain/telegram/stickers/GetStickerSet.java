package com.tong.telegramBot.domain.telegram.stickers;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Use this method to get a sticker set. On success, a StickerSet object is returned.
 * <p>
 * Created by tong on 2022/08/25
 */
@Data
@Accessors(chain = true)
public class GetStickerSet {

    @NotNull
    private String name; // Name of the sticker set

}
