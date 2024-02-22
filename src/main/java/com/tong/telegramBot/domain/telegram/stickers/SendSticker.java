package com.tong.telegramBot.domain.telegram.stickers;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tong.telegramBot.domain.telegram.InlineKeyboardMarkup;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Use this method to send static .WEBP, animated .TGS, or video .WEBM stickers. On success, the sent Message is returned.
 * <p>
 * Created by tong on 2022/08/25
 */
@Data
@Accessors(chain = true)
public class SendSticker {

    @NotNull
    @JsonProperty("chat_id")
    private String chatId; // Unique identifier for the target chat or username of the target channel (in the format @channelusername)
    @NotNull
    private String sticker; // Sticker to send. Pass a file_id as String to send a file that exists on the Telegram servers (recommended), pass an HTTP URL as a String for Telegram to get a .WEBP file from the Internet, or upload a new one using multipart/form-data. More information on Sending Files »
    @JsonProperty("disable_notification")
    private Boolean disableNotification; // Sends the message silently. Users will receive a notification with no sound.
    @JsonProperty("protect_content")
    private Boolean protectContent; // Protects the contents of the sent message from forwarding and saving
    @JsonProperty("reply_to_message_id")
    private Integer replyToMessageId; // If the message is a reply, ID of the original message
    @JsonProperty("allow_sending_without_reply")
    private Boolean allowSendingWithoutReply; // Pass True if the message should be sent even if the specified replied-to message is not found
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup; // Additional interface options. A JSON-serialized object for an inline keyboard, custom reply keyboard, instructions to remove reply keyboard or to force a reply from the user.

}
