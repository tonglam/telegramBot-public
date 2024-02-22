package com.tong.telegramBot.domain.telegram.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * If you sent an invoice requesting a shipping address and the parameter is_flexible was specified, the Bot API will send an Update with a shipping_query field to the bot. Use this method to reply to shipping queries. On success, True is returned.
 * <p>
 * Created by tong on 2022/08/24
 */
@Data
@Accessors(chain = true)
public class AnswerShippingQuery {

    @NotNull
    @JsonProperty("shipping_query_id")
    private String shippingQueryId; // Unique identifier for the query to be answered
    @NotNull
    private Boolean ok; // Pass True if delivery to the specified address is possible and False if there are any problems (for example, if delivery to the specified address is not possible)
    @JsonProperty("shipping_options")
    private List<ShippingOption> shippingOptions; // Required if ok is True. A JSON-serialized array of available shipping options.
    @JsonProperty("error_message")
    private String errorMessage; // Required if ok is False. Error message in human readable form that explains why it is impossible to complete the order (e.g. "Sorry, delivery to your desired address is unavailable'). Telegram will display this message to the user.

}
