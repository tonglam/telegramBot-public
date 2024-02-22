package com.tong.telegramBot.domain.telegram.availableTypes;

import com.tong.telegramBot.domain.telegram.User;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Represents a chat member that is under certain restrictions in the chat. Supergroups only.
 * <p>
 * Created by tong on 2022/08/24
 */
@Data
@Accessors(chain = true)
public class ChatMemberRestricted {

    private String status; // The member's status in the chat, always “restricted”
    private User user; // Information about the user
    private Boolean isMember; // True, if the user is a member of the chat at the moment of the request
    private Boolean canChangeInfo; // True, if the user is allowed to change the chat title, photo and other settings
    private Boolean canInviteUsers; // True, if the user is allowed to invite new users to the chat
    private Boolean canPinMessages; // True, if the user is allowed to pin messages
    private Boolean canSendMessages; // True, if the user is allowed to send text messages, contacts, locations and venues
    private Boolean canSendMediaMessages; // True, if the user is allowed to send audios, documents, photos, videos, video notes and voice notes
    private Boolean canSendPolls; // True, if the user is allowed to send polls
    private Boolean canSendOtherMessages; // True, if the user is allowed to send animations, games, stickers and use inline bots
    private Boolean canAddWebPagePreviews; // True, if the user is allowed to add web page previews to their messages
    private Integer untilDate; // Date when restrictions will be lifted for this user; unix time. If 0, then the user is restricted forever

}
