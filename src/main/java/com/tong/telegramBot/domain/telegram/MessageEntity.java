package com.tong.telegramBot.domain.telegram;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * This object represents one special entity in a text message. For example, hashtags, usernames, URLs, etc.
 * <p>
 * Created by tong on 2022/08/22
 */
@Data
@Accessors(chain = true)
public class MessageEntity {

    private String type; // Type of the entity. Currently, can be “mention” (@username), “hashtag” (#hashtag), “cashtag” ($USD), “bot_command” (/start@jobs_bot), “url” (https://telegram.org), “email” (do-not-reply@telegram.org), “phone_number” (+1-212-555-0123), “bold” (bold text), “italic” (italic text), “underline” (underlined text), “strikethrough” (strikethrough text), “spoiler” (spoiler message), “code” (monowidth string), “pre” (monowidth block), “text_link” (for clickable text URLs), “text_mention” (for users without usernames), “custom_emoji” (for inline custom emoji stickers)
    private Integer offset; // Offset in UTF-16 code units to the start of the entity
    private Integer length; // Length of the entity in UTF-16 code units
    private String url; // Optional. For “text_link” only, URL that will be opened after user taps on the text
    private User user; // Optional. For “text_mention” only, the mentioned user
    private String language; // Optional. For “pre” only, the programming language of the entity text
    @JsonProperty("message_id")
    private String customEmojiId; // Optional. For “custom_emoji” only, unique identifier of the custom emoji. Use getCustomEmojiStickers to get full information about the sticker

}
