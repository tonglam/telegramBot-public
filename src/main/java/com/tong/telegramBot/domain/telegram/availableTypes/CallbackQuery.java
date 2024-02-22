package com.tong.telegramBot.domain.telegram.availableTypes;

import com.tong.telegramBot.domain.telegram.Message;
import com.tong.telegramBot.domain.telegram.User;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * This object represents an incoming callback query from a callback button in an inline keyboard. If the button that originated the query was attached to a message sent by the bot, the field message will be present. If the button was attached to a message sent via the bot (in inline mode), the field inline_message_id will be present. Exactly one of the fields data or game_short_name will be present.
 * <p>
 * Created by tong on 2022/08/24
 */
@Data
@Accessors(chain = true)
public class CallbackQuery {

    private String id; // Unique identifier for this query
    private User from; // Sender
    private Message message; // Optional. Message with the callback button that originated the query. Note that message content and message date will not be available if the message is too old
    private String inlineMessageId; // Optional. Identifier of the message sent via the bot in inline mode, that originated the query.
    private String chatInstance; // Global identifier, uniquely corresponding to the chat to which the message with the callback button was sent. Useful for high scores in games.
    private String data; // Optional. Data associated with the callback button. Be aware that the message originated the query can contain no callback buttons with this data.
    private String gameShortName; // Optional. Short name of a Game to be returned, serves as the unique identifier for the game

}
