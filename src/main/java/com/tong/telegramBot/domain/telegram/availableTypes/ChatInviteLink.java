package com.tong.telegramBot.domain.telegram.availableTypes;

import com.tong.telegramBot.domain.telegram.User;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Represents an invite link for a chat.
 * <p>
 * Created by tong on 2022/08/24
 */
@Data
@Accessors(chain = true)
public class ChatInviteLink {

    private String inviteLink; // The invite link. If the link was created by another chat administrator, then the second part of the link will be replaced with “…”.
    private User creator; // Creator of the link
    private Boolean createsJoinRequest; // True, if users joining the chat via the link need to be approved by chat administrators
    private Boolean isPrimary; // True, if the link is primary
    private Boolean isRevoked; // True, if the link is revoked
    private String name; // Optional. Invite link name
    private Integer expireDate; // Optional. Point in time (Unix timestamp) when the link will expire or has been expired
    private Integer memberLimit; // Optional. The maximum number of users that can be members of the chat simultaneously after joining the chat via this invite link; 1-99999
    private Integer pendingJoinRequestCount; // Optional. Number of pending join requests created using this link

}
