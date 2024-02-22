package com.tong.telegramBot.domain.telegram;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * This object contains information about a poll.
 * <p>
 * Created by tong on 2022/08/22
 */
@Data
@Accessors(chain = true)
public class Poll {

    private String id; // Unique poll identifier
    private String question; // Poll question, 1-300 characters
    private List<PollOption> options; // List of poll options
    @JsonProperty("total_voter_count")
    private Integer totalVoterCount; // Total number of users that voted in the poll
    @JsonProperty("is_closed")
    private Boolean isClosed; // True, if the poll is closed
    @JsonProperty("is_anonymous")
    private Boolean isAnonymous; // True, if the poll is anonymous
    private String type; // Poll type, currently can be “regular” or “quiz”
    @JsonProperty("allows_multiple_answers")
    private Boolean allowsMultipleAnswers; // True, if the poll allows multiple answers
    @JsonProperty("correct_option_id")
    private Integer correctOptionId; // Optional. 0-based identifier of the correct answer option. Available only for polls in the quiz mode, which are closed, or was sent (not forwarded) by the bot or to the private chat with the bot.
    private String explanation; // Optional. Text that is shown when a user chooses an incorrect answer or taps on the lamp icon in a quiz-style poll, 0-200 characters
    @JsonProperty("explanation_entities")
    private List<MessageEntity> explanationEntities; // Optional. Special entities like usernames, URLs, bot commands, etc. that appear in the explanation
    @JsonProperty("open_period")
    private String openPeriod; // Optional. Amount of time in seconds the poll will be active after creation
    @JsonProperty("close_date")
    private String closeDate; // Optional. Point in time (Unix timestamp) when the poll will be automatically closed

}
