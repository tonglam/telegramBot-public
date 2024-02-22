package com.tong.telegramBot.domain.telegram.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * This object contains basic information about a successful payment.
 * <p>
 * Created by tong on 2022/08/23
 */
@Data
@Accessors(chain = true)
public class SuccessfulPayment {

    private String currency; // Three-letter ISO 4217 currency code
    @JsonProperty("total_amount")
    private Integer totalAmount; // Total price in the smallest units of the currency (integer, not float/double). For example, for a price of US$ 1.45 pass amount = 145. See the exp parameter in currencies.json, it shows the number of digits past the decimal point for each currency (2 for the majority of currencies).
    @JsonProperty("invoice_payload")
    private String invoicePayload; // Bot specified invoice payload
    @JsonProperty("shipping_option_id")
    private String shippingOptionId; // Optional. Identifier of the shipping option chosen by the user
    @JsonProperty("orderInfo")
    private OrderInfo orderInfo; // Optional. Order information provided by the user
    @JsonProperty("telegram_payment_charge_id")
    private String telegramPaymentChargeId; // Telegram payment identifier
    @JsonProperty("provider_payment_charge_id")
    private String providerPaymentChargeId; // Provider payment identifier

}
