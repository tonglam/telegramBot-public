package com.tong.telegramBot.domain.telegram;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * This object represents a service message about new members invited to a video chat.
 * <p>
 * Created by tong on 2022/08/23
 */
@Data
@Accessors(chain = true)
public class VideoChatParticipantsInvited {

    private List<User> users; // New members that were invited to the video chat

}
