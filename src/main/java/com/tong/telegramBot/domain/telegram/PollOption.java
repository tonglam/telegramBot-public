package com.tong.telegramBot.domain.telegram;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * This object contains information about one answer option in a poll.
 * <p>
 * Created by tong on 2022/08/22
 */
@Data
@Accessors(chain = true)
public class PollOption {

    private String text; // Option text, 1-100 characters
    @JsonProperty("voter_count")
    private Integer voterCount; // Number of users that voted for this option

}
