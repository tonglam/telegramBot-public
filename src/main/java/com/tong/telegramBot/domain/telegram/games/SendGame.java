package com.tong.telegramBot.domain.telegram.games;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tong.telegramBot.domain.telegram.InlineKeyboardMarkup;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Use this method to send a game. On success, the sent Message is returned.
 * <p>
 * Created by tong on 2022/08/23
 */
@Data
@Accessors(chain = true)
public class SendGame {

    @NotNull
    @JsonProperty("chat_id")
    private Integer chatId; // Unique identifier for the target chat
    @NotNull
    @JsonProperty("game_short_name")
    private String gameShortName; // Short name of the game, serves as the unique identifier for the game. Set up your games via @BotFather.
    @JsonProperty("disable_notification")
    private Boolean disableNotification; // Sends the message silently. Users will receive a notification with no sound.
    @JsonProperty("protect_content")
    private Boolean protectContent; // Protects the contents of the sent message from forwarding and saving
    @JsonProperty("reply_to_message_id")
    private Integer replyToMessageId; // If the message is a reply, ID of the original message
    @JsonProperty("allow_sending_without_reply")
    private Boolean allowSendingWithoutReply; // Pass True if the message should be sent even if the specified replied-to message is not found
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup; // A JSON-serialized object for an inline keyboard. If empty, one 'Play game_title' button will be shown. If not empty, the first button must launch the game.

}
