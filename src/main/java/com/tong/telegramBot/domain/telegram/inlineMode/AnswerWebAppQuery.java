package com.tong.telegramBot.domain.telegram.inlineMode;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Use this method to set the result of an interaction with a Web App and send a corresponding message on behalf of the user to the chat from which the query originated. On success, a SentWebAppMessage object is returned.
 * <p>
 * Created by tong on 2022/08/24
 */
@Data
@Accessors(chain = true)
public class AnswerWebAppQuery {

    @JsonProperty("web_app_query_id")
    private String webAppQueryId; // Unique identifier for the query to be answered
    private InlineQueryResult result; // A JSON-serialized object describing the message to be sent

}
