package com.tong.telegramBot.domain.telegram.inlineMode;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tong.telegramBot.domain.telegram.Location;
import com.tong.telegramBot.domain.telegram.User;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Represents a result of an inline query that was chosen by the user and sent to their chat partner.
 * <p>
 * Created by tong on 2022/08/24
 */
@Data
@Accessors(chain = true)
public class ChosenInlineResult {

    @JsonProperty("result_id")
    private String resultId; // The unique identifier for the result that was chosen
    private User from; // The user that chose the result
    private Location location; // Optional. Sender location, only for bots that require user location
    @JsonProperty("inline_message_id")
    private String inlineMessageId; // Optional. Identifier of the sent inline message. Available only if there is an inline keyboard attached to the message. Will be also received in callback queries and can be used to edit the message.
    private String query; // The query that was used to obtain the result

}
