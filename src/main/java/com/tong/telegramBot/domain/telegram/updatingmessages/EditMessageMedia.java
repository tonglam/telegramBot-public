package com.tong.telegramBot.domain.telegram.updatingmessages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tong.telegramBot.domain.telegram.InlineKeyboardMarkup;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Use this method to edit animation, audio, document, photo, or video messages. If a message is part of a message album, then it can be edited only to an audio for audio albums, only to a document for document albums and to a photo or a video otherwise. When an inline message is edited, a new file can't be uploaded; use a previously uploaded file via its file_id or specify a URL. On success, if the edited message is not an inline message, the edited Message is returned, otherwise True is returned.
 * <p>
 * Created by tong on 2022/08/25
 */
@Data
@Accessors(chain = true)
public class EditMessageMedia {

    @JsonProperty("chat_id")
    private String chatId; // Required if inline_message_id is not specified. Unique identifier for the target chat or username of the target channel (in the format @channelusername)
    @JsonProperty("message_id")
    private Integer messageId; // Identifier of the original message with the poll
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup; // A JSON-serialized object for a new message inline keyboard.

}
