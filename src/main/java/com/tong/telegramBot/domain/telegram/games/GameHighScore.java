package com.tong.telegramBot.domain.telegram.games;

import com.tong.telegramBot.domain.telegram.User;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * This object represents one row of the high scores table for a game.
 * <p>
 * Created by tong on 2022/08/23
 */
@Data
@Accessors(chain = true)
public class GameHighScore {

    private Integer position; // Position in high score table for the game
    private User user; // User
    private Integer score; // Score

}
