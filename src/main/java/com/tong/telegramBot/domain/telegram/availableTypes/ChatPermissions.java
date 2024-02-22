package com.tong.telegramBot.domain.telegram.availableTypes;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Describes actions that a non-administrator user is allowed to take in a chat.
 * <p>
 * Created by tong on 2022/08/23
 */
@Data
@Accessors(chain = true)
public class ChatPermissions {

    private Boolean canSendMessages; // Optional. True, if the user is allowed to send text messages, contacts, locations and venues
    private Boolean canSendMediaMessages; // Optional. True, if the user is allowed to send audios, documents, photos, videos, video notes and voice notes, implies can_send_messages
    private Boolean canSendPolls; // Optional. True, if the user is allowed to send polls, implies can_send_messages
    private Boolean canSendOtherMessages; // Optional. True, if the user is allowed to send animations, games, stickers and use inline bots, implies can_send_media_messages
    private Boolean canAddWebPagePreviews; // Optional. True, if the user is allowed to add web page previews to their messages, implies can_send_media_messages
    private Boolean canChangeInfo; // Optional. True, if the user is allowed to change the chat title, photo and other settings. Ignored in public supergroups
    private Boolean canInviteUsers; // Optional. True, if the user is allowed to invite new users to the chat
    private Boolean canPinMessages; // Optional. True, if the user is allowed to pin messages. Ignored in public supergroups

}
