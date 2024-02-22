package com.tong.telegramBot.domain.telegram.payments;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tong.telegramBot.domain.telegram.InlineKeyboardMarkup;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * Use this method to send invoices. On success, the sent Message is returned.
 * <p>
 * Created by tong on 2022/08/23
 */
@Data
@Accessors(chain = true)
public class SendInvoice {

    @NotNull
    @JsonProperty("chat_id")
    private String chatId; // Unique identifier for the target chat or username of the target channel (in the format @channelusername)
    @NotNull
    private String title; // Product name, 1-32 characters
    @NotNull
    private String description; // Product description, 1-255 characters
    @NotNull
    private String payload; // Bot-defined invoice payload, 1-128 bytes. This will not be displayed to the user, use for your internal processes.
    @NotNull
    @JsonProperty("provider_token")
    private String providerToken; // Payment provider token, obtained via @BotFather
    @NotNull
    private String currency; // Three-letter ISO 4217 currency code, see more on currencies
    @NotNull
    private List<LabeledPrice> prices; // Price breakdown, a JSON-serialized list of components (e.g. product price, tax, discount, delivery cost, delivery tax, bonus, etc.)
    @JsonProperty("max_tip_amount")
    private String maxTipAmount; // The maximum accepted amount for tips in the smallest units of the currency (integer, not float/double). For example, for a maximum tip of US$ 1.45 pass max_tip_amount = 145. See the exp parameter in currencies.json, it shows the number of digits past the decimal point for each currency (2 for the majority of currencies). Defaults to 0
    @JsonProperty("suggested_tip_amounts")
    private List<Integer> suggestedTipAmounts; // A JSON-serialized array of suggested amounts of tips in the smallest units of the currency (integer, not float/double). At most 4 suggested tip amounts can be specified. The suggested tip amounts must be positive, passed in a strictly increased order and must not exceed max_tip_amount.
    @JsonProperty("start_parameter")
    private String startParameter; // Unique deep-linking parameter. If left empty, forwarded copies of the sent message will have a Pay button, allowing multiple users to pay directly from the forwarded message, using the same invoice. If non-empty, forwarded copies of the sent message will have a URL button with a deep link to the bot (instead of a Pay button), with the value used as the start parameter
    @JsonProperty("provider_data")
    private String providerData; // JSON-serialized data about the invoice, which will be shared with the payment provider. A detailed description of required fields should be provided by the payment provider.
    @JsonProperty("photo_url")
    private String photoUrl; // URL of the product photo for the invoice. Can be a photo of the goods or a marketing image for a service. People like it better when they see what they are paying for.
    @JsonProperty("photo_size")
    private Integer photoSize; // Photo size in bytes
    @JsonProperty("photo_width")
    private Integer photoWidth; // Photo width
    @JsonProperty("photo_height")
    private Integer photoHeight; // Photo height
    @JsonProperty("need_name")
    private Boolean needName; // Pass True if you require the user's full name to complete the order
    @JsonProperty("need_phone_number")
    private Boolean needPhoneNumber; // Pass True if you require the user's phone number to complete the order
    @JsonProperty("need_email")
    private Boolean needEmail; // Pass True if you require the user's email address to complete the order
    @JsonProperty("need_shipping_address")
    private Boolean needShippingAddress; // Pass True if you require the user's shipping address to complete the order
    @JsonProperty("send_phone_number_to_provider")
    private Boolean sendPhoneNumberToProvider; // Pass True if the user's phone number should be sent to provider
    @JsonProperty("send_email_to_provider")
    private Boolean sendEmailToProvider; // Pass True if the user's email address should be sent to provider
    @JsonProperty("is_flexible")
    private Boolean isFlexible; // Pass True if the final price depends on the shipping method
    @JsonProperty("disable_notification")
    private Boolean disableNotification; // Sends the message silently. Users will receive a notification with no sound.
    @JsonProperty("protect_content")
    private Boolean protectContent; // Protects the contents of the sent message from forwarding and saving
    @JsonProperty("reply_to_message_id")
    private Boolean replyToMessageId; // If the message is a reply, ID of the original message
    @JsonProperty("allow_sending_without_reply")
    private Integer allowSendingWithoutReply; // Pass True if the message should be sent even if the specified replied-to message is not found
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup; // A JSON-serialized object for an inline keyboard. If empty, one 'Pay total price' button will be shown. If not empty, the first button must be a Pay button.

}
