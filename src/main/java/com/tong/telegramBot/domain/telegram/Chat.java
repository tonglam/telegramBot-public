package com.tong.telegramBot.domain.telegram;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tong.telegramBot.domain.telegram.availableTypes.ChatLocation;
import com.tong.telegramBot.domain.telegram.availableTypes.ChatPermissions;
import com.tong.telegramBot.domain.telegram.availableTypes.ChatPhoto;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * This object represents a chat.
 * <p>
 * Created by tong on 2022/08/22
 */
@Data
@Accessors(chain = true)
public class Chat {

    private Integer Id; // Unique identifier for this chat. This number may have more than 32 significant bits and some programming languages may have difficulty/silent defects in interpreting it. But it has at most 52 significant bits, so a signed 64-bit integer or double-precision float type are safe for storing this identifier.
    private String type; // Type of chat, can be either “private”, “group”, “supergroup” or “channel”
    private String title; // Optional. Title, for supergroups, channels and group chats
    private String username; // Optional. Username, for private chats, supergroups and channels if available
    @JsonProperty("first_name")
    private String firstName; // Optional. First name of the other party in a private chat
    @JsonProperty("last_name")
    private String lastName; // Optional. Last name of the other party in a private chat
    private ChatPhoto photo; // Optional. Chat photo. Returned only in getChat.
    private String bio; // Optional. Bio of the other party in a private chat. Returned only in getChat.
    @JsonProperty("has_private_forwards")
    private Boolean hasPrivateForwards; // Optional. True, if privacy settings of the other party in the private chat allows to use tg://user?id=<user_id> links only in chats with the user. Returned only in getChat.
    @JsonProperty("has_restricted_voice_and_video_messages")
    private Boolean hasRestrictedVoiceAndVideoMessages; // Optional. True, if the privacy settings of the other party restrict sending voice and video note messages in the private chat. Returned only in getChat.
    @JsonProperty("join_to_send_messages")
    private Boolean joinToSendMessages; // Optional. True, if users need to join the supergroup before they can send messages. Returned only in getChat.
    @JsonProperty("join_by_request")
    private Boolean joinByRequest; // Optional. True, if all users directly joining the supergroup need to be approved by supergroup administrators. Returned only in getChat.
    private String description; // Optional. Description, for groups, supergroups and channel chats. Returned only in getChat.
    @JsonProperty("invite_link")
    private String inviteLink; // Optional. Primary invite link, for groups, supergroups and channel chats. Returned only in getChat.
    @JsonProperty("pinned_message")
    private Message pinnedMessage; // Optional. The most recent pinned message (by sending date). Returned only in getChat.
    private ChatPermissions permissions; // Optional. Default chat member permissions, for groups and supergroups. Returned only in getChat.
    @JsonProperty("slow_mode_delay")
    private Integer slowModeDelay; // Optional. For supergroups, the minimum allowed delay between consecutive messages sent by each unpriviledged user; in seconds. Returned only in getChat.
    @JsonProperty("message_auto_delete_time")
    private Integer messageAutoDeleteTime; // Optional. The time after which all messages sent to the chat will be automatically deleted; in seconds. Returned only in getChat.
    @JsonProperty("has_protected_content")
    private Boolean hasProtectedContent; // Optional. True, if messages from the chat can't be forwarded to other chats. Returned only in getChat.
    @JsonProperty("sticker_set_name")
    private String stickerSetName; // Optional. For supergroups, name of group sticker set. Returned only in getChat.
    @JsonProperty("can_set_sticker_set")
    private Boolean canSetStickerSet; // Optional. True, if the bot can change the group sticker set. Returned only in getChat.
    @JsonProperty("linked_chat_id")
    private Integer linkedChatId; // Optional. Unique identifier for the linked chat, i.e. the discussion group identifier for a channel and vice versa; for supergroups and channel chats. This identifier may be greater than 32 bits and some programming languages may have difficulty/silent defects in interpreting it. But it is smaller than 52 bits, so a signed 64 bit integer or double-precision float type are safe for storing this identifier. Returned only in getChat.
    private ChatLocation location; // Optional. For supergroups, the location to which the supergroup is connected. Returned only in getChat.

}
