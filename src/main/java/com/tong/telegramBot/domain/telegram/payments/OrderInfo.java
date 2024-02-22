package com.tong.telegramBot.domain.telegram.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * This object represents information about an order.
 * <p>
 * Created by tong on 2022/08/23
 */
@Data
@Accessors(chain = true)
public class OrderInfo {

    private String name; // Optional. User name
    @JsonProperty("phone_number")
    private String phoneNumber; // Optional. User's phone number
    private String email; // Optional. User email
    @JsonProperty("shipping_address")
    private ShippingAddress shippingAddress; // Optional. User shipping address

}
