package com.tong.telegramBot.domain.telegram.availableTypes;

import com.tong.telegramBot.domain.telegram.User;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Represents a chat member that owns the chat and has all administrator privileges.
 * <p>
 * Created by tong on 2022/08/24
 */
@Getter
@Setter
@Accessors(chain = true)
public class ChatMemberOwner extends ChatMember {

    private String status; // The member's status in the chat, always “creator”
    private User user; // Information about the user
    private Boolean isAnonymous; // True, if the user's presence in the chat is hidden
    private String customTitle; // Optional. Custom title for this user

}
