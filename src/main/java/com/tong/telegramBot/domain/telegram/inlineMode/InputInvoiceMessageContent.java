package com.tong.telegramBot.domain.telegram.inlineMode;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tong.telegramBot.domain.telegram.payments.LabeledPrice;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * Represents the content of an invoice message to be sent as the result of an inline query.
 * <p>
 * Created by tong on 2022/08/24
 */
@Getter
@Setter
@Accessors(chain = true)
public class InputInvoiceMessageContent extends InputMessageContent {

    private String title; // Product name, 1-32 characters
    private String description; // Product description, 1-255 characters
    private String payload; // Bot-defined invoice payload, 1-128 bytes. This will not be displayed to the user, use for your internal processes.
    @JsonProperty("provider_token")
    private String providerToken; // Payment provider token, obtained via @BotFather
    private String currency; // Three-letter ISO 4217 currency code, see more on currencies
    private List<LabeledPrice> prices; // Price breakdown, a JSON-serialized list of components (e.g. product price, tax, discount, delivery cost, delivery tax, bonus, etc.)
    @JsonProperty("max_tip_amount")
    private Integer maxTipAmount; // Optional. The maximum accepted amount for tips in the smallest units of the currency (integer, not float/double). For example, for a maximum tip of US$ 1.45 pass max_tip_amount = 145. See the exp parameter in currencies.json, it shows the number of digits past the decimal point for each currency (2 for the majority of currencies). Defaults to 0
    @JsonProperty("suggested_tip_amounts")
    private List<Integer> suggestedTipAmounts; // Optional. A JSON-serialized array of suggested amounts of tip in the smallest units of the currency (integer, not float/double). At most 4 suggested tip amounts can be specified. The suggested tip amounts must be positive, passed in a strictly increased order and must not exceed max_tip_amount.
    @JsonProperty("provider_data")
    private String providerData; // Optional. A JSON-serialized object for data about the invoice, which will be shared with the payment provider. A detailed description of the required fields should be provided by the payment provider.
    @JsonProperty("photo_url")
    private String photoUrl; // Optional. URL of the product photo for the invoice. Can be a photo of the goods or a marketing image for a service.
    @JsonProperty("photo_size")
    private Integer photoSize; // Optional. Photo size in bytes
    @JsonProperty("photo_width")
    private Integer photoWidth; // Optional. Photo width
    @JsonProperty("photo_height")
    private Integer photoHeight; // Optional. Photo height
    @JsonProperty("need_name")
    private Boolean needName; // Optional. Pass True if you require the user's full name to complete the order
    @JsonProperty("need_phone_number")
    private Boolean needPhoneNumber; // Optional. Pass True if you require the user's phone number to complete the order
    @JsonProperty("need_email")
    private Boolean needEmail; // Optional. Pass True if you require the user's email address to complete the order
    @JsonProperty("need_shipping_address")
    private Boolean needShippingAddress; // Optional. Pass True if you require the user's shipping address to complete the order
    @JsonProperty("send_phone_number_to_provider")
    private Boolean sendPhoneNumberToProvider; // Optional. Pass True if the user's phone number should be sent to provider
    @JsonProperty("send_email_to_provider")
    private Boolean sendEmailToProvider; // Optional. Pass True if the user's email address should be sent to provider
    @JsonProperty("is_flexible")
    private Boolean isFlexible; // Optional. Pass True if the final price depends on the shipping method

}
