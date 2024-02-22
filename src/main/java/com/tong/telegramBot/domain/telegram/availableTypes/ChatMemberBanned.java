package com.tong.telegramBot.domain.telegram.availableTypes;

import com.tong.telegramBot.domain.telegram.User;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Represents a chat member that was banned in the chat and can't return to the chat or view chat messages.
 * <p>
 * Created by tong on 2022/08/24
 */
@Getter
@Setter
@Accessors(chain = true)
public class ChatMemberBanned extends ChatMember {

    private String status; // The member's status in the chat, always “kicked”
    private User user; // Information about the user
    private Integer untilDate; // Date when restrictions will be lifted for this user; unix time. If 0, then the user is banned forever

}
