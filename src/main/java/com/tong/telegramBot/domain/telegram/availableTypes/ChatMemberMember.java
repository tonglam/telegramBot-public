package com.tong.telegramBot.domain.telegram.availableTypes;

import com.tong.telegramBot.domain.telegram.User;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Represents a chat member that has no additional privileges or restrictions.
 * <p>
 * Created by tong on 2022/08/24
 */
@Data
@Accessors(chain = true)
public class ChatMemberMember {

    private String status; // The member's status in the chat, always “member”
    private User user; // Information about the user

}
