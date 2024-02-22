package com.tong.telegramBot.domain.telegram.stickers;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * Use this method to get information about custom emoji stickers by their identifiers. Returns an Array of Sticker objects.
 * <p>
 * Created by tong on 2022/08/25
 */
@Data
@Accessors(chain = true)
public class GetCustomEmojiStickers {

    @NotNull
    @JsonProperty("custom_emoji_ids")
    private List<String> customEmojiIds; // List of custom emoji identifiers. At most 200 custom emoji identifiers can be specified.

}
