package com.tong.telegramBot.domain.telegram.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * This object represents a shipping address.
 * <p>
 * Created by tong on 2022/08/23
 */
@Data
@Accessors(chain = true)
public class ShippingAddress {

    @JsonProperty("country_code")
    private String countryCode; // Two-letter ISO 3166-1 alpha-2 country code
    private String state; // State, if applicable
    private String city; // City
    @JsonProperty("street_line_1")
    private String streetLine1; // private String street_line1
    @JsonProperty("street_line_2")
    private String streetLine2; // Second line for the address
    @JsonProperty("post_code")
    private String postCode; // Address post code

}
