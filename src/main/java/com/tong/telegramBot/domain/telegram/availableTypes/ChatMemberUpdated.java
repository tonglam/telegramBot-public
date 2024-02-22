package com.tong.telegramBot.domain.telegram.availableTypes;

import com.tong.telegramBot.domain.telegram.Chat;
import com.tong.telegramBot.domain.telegram.User;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * This object represents changes in the status of a chat member.
 * <p>
 * Created by tong on 2022/08/24
 */
@Data
@Accessors(chain = true)
public class ChatMemberUpdated {

    private Chat chat;
    private User from;
    private Integer date;
    private ChatMember oldChatMember;
    private ChatMember newChatMember;
    private ChatInviteLink inviteLink;

}
