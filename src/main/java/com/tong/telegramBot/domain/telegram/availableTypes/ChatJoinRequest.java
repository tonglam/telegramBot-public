package com.tong.telegramBot.domain.telegram.availableTypes;

import com.tong.telegramBot.domain.telegram.Chat;
import com.tong.telegramBot.domain.telegram.User;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Represents a join request sent to a chat.
 * <p>
 * Created by tong on 2022/08/24
 */
@Data
@Accessors(chain = true)
public class ChatJoinRequest {

    private Chat chat; // Chat to which the request was sent
    private User from; // User that sent the join request
    private Integer date; // Date the request was sent in Unix time
    private String bio; // Optional. Bio of the user.
    private ChatInviteLink inviteLink; // Optional. Chat invite link that was used by the user to send the join request

}
