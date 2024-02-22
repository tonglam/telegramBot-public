package com.tong.telegramBot.domain.telegram.inlineMode;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tong.telegramBot.domain.telegram.Location;
import com.tong.telegramBot.domain.telegram.User;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * This object represents an incoming inline query. When the user sends an empty query, your bot could return some default or trending results.
 * <p>
 * Created by tong on 2022/08/24
 */
@Data
@Accessors(chain = true)
public class InlineQuery {

    private String id; // Unique identifier for this query
    private User user; // Sender
    private String query; // Text of the query (up to 256 characters)
    private String offset; // Offset of the results to be returned, can be controlled by the bot
    @JsonProperty("chat_type")
    private String chatType; // Optional. Type of the chat from which the inline query was sent. Can be either “sender” for a private chat with the inline query sender, “private”, “group”, “supergroup”, or “channel”. The chat type should be always known for requests sent from official clients and most third-party clients, unless the request was sent from a secret chat
    private Location location; // Optional. Sender location, only for bots that request user location

}
