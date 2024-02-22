package com.tong.telegramBot.domain.telegram.games;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Use this method to set the score of the specified user in a game message. On success, if the message is not an inline message, the Message is returned, otherwise True is returned. Returns an error, if the new score is not greater than the user's current score in the chat and force is False.
 * <p>
 * Created by tong on 2022/08/23
 */
@Data
@Accessors(chain = true)
public class SetGameScore {

    @NotNull
    @JsonProperty("user_id")
    private Integer userId; // User identifier
    @NotNull
    private Integer score; // New score, must be non-negative
    private Boolean force; // Pass True if the high score is allowed to decrease. This can be useful when fixing mistakes or banning cheaters
    @JsonProperty("disable_edit_message")
    private Boolean disableEditMessage; // Pass True if the game message should not be automatically edited to include the current scoreboard
    @JsonProperty("chat_id")
    private Integer chatId; // Required if inline_message_id is not specified. Unique identifier for the target chat
    @JsonProperty("message_id")
    private Integer messageId; // Required if inline_message_id is not specified. Identifier of the sent message
    @JsonProperty("inline_message_id")
    private String inlineMessageId; // Required if chat_id and message_id are not specified. Identifier of the inline message

}
