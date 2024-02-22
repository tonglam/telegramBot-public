package com.tong.telegramBot.domain.telegram;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * This object represents an animated emoji that displays a random value.
 * <p>
 * Created by tong on 2022/08/22
 */
@Data
@Accessors(chain = true)
public class Dice {

    private String emoji; // Emoji on which the dice throw animation is based
    private Integer value; // Value of the dice, 1-6 for “🎲”, “🎯” and “🎳” base emoji, 1-5 for “🏀” and “⚽” base emoji, 1-64 for “🎰” base emoji

}
