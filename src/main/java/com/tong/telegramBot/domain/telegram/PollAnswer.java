package com.tong.telegramBot.domain.telegram;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * This object represents an answer of a user in a non-anonymous poll.
 * <p>
 * Created by tong on 2022/08/22
 */
@Data
@Accessors(chain = true)
public class PollAnswer {

    @JsonProperty("poll_id")
    private String pollId; // Unique poll identifier
    private User user; // The user, who changed the answer to the poll
    @JsonProperty("option_ids")
    private List<Integer> optionIds; // 0-based identifiers of answer options, chosen by the user. May be empty if the user retracted their vote.

}
