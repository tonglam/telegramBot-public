package com.tong.telegramBot.domain.telegram.games;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Use this method to get data for high score tables. Will return the score of the specified user and several of their neighbors in a game. Returns an Array of GameHighScore objects.
 * <p>
 * Created by tong on 2022/08/23
 */
@Data
@Accessors(chain = true)
public class GetGameHighScores {

    @NotNull
    @JsonProperty("user_id")
    private Integer userId; // Target user id
    @JsonProperty("chat_id")
    private Integer chatId; // Required if inline_message_id is not specified. Unique identifier for the target chat
    @JsonProperty("message_id")
    private Integer messageId; // Required if inline_message_id is not specified. Identifier of the sent message
    @JsonProperty("inline_message_id")
    private String inlineMessageId; // Required if chat_id and message_id are not specified. Identifier of the inline message

}
