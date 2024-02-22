package com.tong.telegramBot.domain.telegram.games;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tong.telegramBot.domain.telegram.Animation;
import com.tong.telegramBot.domain.telegram.MessageEntity;
import com.tong.telegramBot.domain.telegram.PhotoSize;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * This object represents a game. Use BotFather to create and edit games, their short names will act as unique identifiers.
 * <p>
 * Created by tong on 2022/08/23
 */
@Data
@Accessors(chain = true)
public class Game {

    private String title; // Title of the game
    private String description; // Description of the game
    private List<PhotoSize> photo; // Photo that will be displayed in the game message in chats.
    private String text; // Optional. Brief description of the game or high scores included in the game message. Can be automatically edited to include current high scores for the game when the bot calls setGameScore, or manually edited using editMessageText. 0-4096 characters.
    @JsonProperty("text_entities")
    private List<MessageEntity> textEntities; // Optional. Special entities that appear in text, such as usernames, URLs, bot commands, etc.
    private Animation animation; // Optional. Animation that will be displayed in the game message in chats. Upload via BotFather

}
