package com.tong.telegramBot.domain.telegram;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * This object represents a service message about a video chat scheduled in the chat.
 * <p>
 * Created by tong on 2022/08/23
 */
@Data
@Accessors(chain = true)
public class VideoChatScheduled {

    @JsonProperty("start_date")
    private Integer startDate; // Point in time (Unix timestamp) when the video chat is supposed to be started by a chat administrator

}
