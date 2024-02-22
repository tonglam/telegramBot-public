package com.tong.telegramBot.domain.telegram;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * This object represents an inline keyboard that appears right next to the message it belongs to.
 * <p>
 * Created by tong on 2022/08/23
 */
@Data
@Accessors(chain = true)
public class InlineKeyboardMarkup {

    @JsonProperty("inline_keyboard")
    private List<InlineKeyboardButton> inlineKeyboard; // Array of button rows, each represented by an Array of InlineKeyboardButton objects

}
