package com.tong.telegramBot.domain.telegram;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * This object represents a Telegram user or bot.
 * <p>
 * Created by tong on 2022/08/22
 */
@Data
@Accessors(chain = true)
public class User {

    private Integer id; // Unique identifier for this user or bot. This number may have more than 32 significant bits and some programming languages may have difficulty/silent defects in interpreting it. But it has at most 52 significant bits, so a 64-bit integer or double-precision float type are safe for storing this identifier.
    @JsonProperty("is_bot")
    private Boolean isBot ; // True, if this user is a bot
    @JsonProperty("first_name")
    private String firstName; // User's or bot's first name
    @JsonProperty("last_name")
    private String lastName; // Optional. User's or bot's last name
    private String username; // Optional. User's or bot's username
    @JsonProperty("language_code")
    private String languageCode; // Optional. IETF language tag of the user's language
    @JsonProperty("is_premium")
    private Boolean isPremium ; // Optional. True, if this user is a Telegram Premium user
    @JsonProperty("added_to_attachment_menu")
    private Boolean addedToAttachmentMenu; // Optional. True, if this user added the bot to the attachment menu
    @JsonProperty("can_join_groups")
    private Boolean canJoinGroups; // Optional. True, if the bot can be invited to groups. Returned only in getMe.
    @JsonProperty("can_read_all_group_messages")
    private Boolean canReadAllGroupMessages; // Optional. True, if privacy mode is disabled for the bot. Returned only in getMe.
    @JsonProperty("supports_inline_queries")
    private Boolean supportsInlineQueries; // Optional. True, if the bot supports inline queries. Returned only in getMe.

}
