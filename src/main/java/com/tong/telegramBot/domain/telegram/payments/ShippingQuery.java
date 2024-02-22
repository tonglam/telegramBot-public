package com.tong.telegramBot.domain.telegram.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tong.telegramBot.domain.telegram.User;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * This object contains information about an incoming shipping query.
 * <p>
 * Created by tong on 2022/08/24
 */
@Data
@Accessors(chain = true)
public class ShippingQuery {

    private String id; // Unique query identifier
    private User from; // User who sent the query
    @JsonProperty("invoice_payload")
    private String invoicePayload; // Bot specified invoice payload
    @JsonProperty("shipping_address")
    private ShippingAddress shippingAddress; // User specified shipping address

}
