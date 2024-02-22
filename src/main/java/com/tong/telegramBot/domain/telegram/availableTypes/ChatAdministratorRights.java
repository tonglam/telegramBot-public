package com.tong.telegramBot.domain.telegram.availableTypes;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Represents the rights of an administrator in a chat.
 * <p>
 * Created by tong on 2022/08/24
 */
@Data
@Accessors(chain = true)
public class ChatAdministratorRights {

    private Boolean isAnonymous; // True, if the user's presence in the chat is hidden
    private Boolean canManageChat; // True, if the administrator can access the chat event log, chat statistics, message statistics in channels, see channel members, see anonymous administrators in supergroups and ignore slow mode. Implied by any other administrator privilege
    private Boolean canDeleteMessages; // True, if the administrator can delete messages of other users
    private Boolean canManageVideoChats; // True, if the administrator can manage video chats
    private Boolean canRestrictMembers; // True, if the administrator can restrict, ban or unban chat members
    private Boolean canPromoteMembers; // True, if the administrator can add new administrators with a subset of their own privileges or demote administrators that he has promoted, directly or indirectly (promoted by administrators that were appointed by the user)
    private Boolean canChangeInfo; // True, if the user is allowed to change the chat title, photo and other settings
    private Boolean canInviteUsers; // True, if the user is allowed to invite new users to the chat
    private Boolean canPostMessages; // Optional. True, if the administrator can post in the channel; channels only
    private Boolean canEditMessages; // Optional. True, if the administrator can edit messages of other users and can pin messages; channels only
    private Boolean canPinMessages; // Optional. True, if the user is allowed to pin messages; groups and supergroups only

}
