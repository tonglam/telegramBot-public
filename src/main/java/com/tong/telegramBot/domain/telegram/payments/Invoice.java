package com.tong.telegramBot.domain.telegram.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * This object contains basic information about an invoice.
 * <p>
 * Created by tong on 2022/08/23
 */
@Data
@Accessors(chain = true)
public class Invoice {

    private String title; // Product name
    private String description; // Product description
    @JsonProperty("start_parameter")
    private String startParameter; // Unique bot deep-linking parameter that can be used to generate this invoice
    private String currency; // Three-letter ISO 4217 currency code
    @JsonProperty("total_amount")
    private Integer totalAmount; // Total price in the smallest units of the currency (integer, not float/double). For example, for a price of US$ 1.45 pass amount = 145. See the exp parameter in currencies.json, it shows the number of digits past the decimal point for each currency (2 for the majority of currencies).

}
