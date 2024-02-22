package com.tong.telegramBot.domain.telegram;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * This object represents a service message about a video chat ended in the chat.
 * <p>
 * Created by tong on 2022/08/23
 */
@Data
@Accessors(chain = true)
public class VideoChatEnded {

    private Integer duration; // Video chat duration in seconds

}
