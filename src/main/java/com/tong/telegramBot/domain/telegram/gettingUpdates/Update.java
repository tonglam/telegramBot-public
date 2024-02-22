package com.tong.telegramBot.domain.telegram.gettingUpdates;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tong.telegramBot.domain.telegram.Message;
import com.tong.telegramBot.domain.telegram.Poll;
import com.tong.telegramBot.domain.telegram.PollAnswer;
import com.tong.telegramBot.domain.telegram.availableTypes.CallbackQuery;
import com.tong.telegramBot.domain.telegram.availableTypes.ChatJoinRequest;
import com.tong.telegramBot.domain.telegram.availableTypes.ChatMemberUpdated;
import com.tong.telegramBot.domain.telegram.inlineMode.ChosenInlineResult;
import com.tong.telegramBot.domain.telegram.inlineMode.InlineQuery;
import com.tong.telegramBot.domain.telegram.payments.PreCheckoutQuery;
import com.tong.telegramBot.domain.telegram.payments.ShippingQuery;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * This object represents an incoming update.
 * At most one of the optional parameters can be present in any given update.
 * <p>
 * Created by tong on 2022/08/24
 */
@Data
@Accessors(chain = true)
public class Update {

    @JsonProperty("update_id")
    private Integer updateId; // The update's unique identifier. Update identifiers start from a certain positive number and increase sequentially. This ID becomes especially handy if you're using webhooks, since it allows you to ignore repeated updates or to restore the correct update sequence, should they get out of order. If there are no new updates for at least a week, then identifier of the next update will be chosen randomly instead of sequentially.
    private Message message; // Optional. New incoming message of any kind - text, photo, sticker, etc.
    @JsonProperty("edited_message")
    private Message editedMessage; // Optional. New version of a message that is known to the bot and was edited
    @JsonProperty("channel_post")
    private Message channelPost; // Optional. New incoming channel post of any kind - text, photo, sticker, etc.
    @JsonProperty("edited_channel_post")
    private Message editedChannelPost; // Optional. New version of a channel post that is known to the bot and was edited
    @JsonProperty("inline_query")
    private InlineQuery inlineQuery; // Optional. New incoming inline query
    @JsonProperty("chosen_inline_result")
    private ChosenInlineResult chosenInlineResult; // Optional. The result of an inline query that was chosen by a user and sent to their chat partner. Please see our documentation on the feedback collecting for details on how to enable these updates for your bot.
    @JsonProperty("callback_query")
    private CallbackQuery callbackQuery; // Optional. New incoming callback query
    @JsonProperty("shipping_query")
    private ShippingQuery shippingQuery; // Optional. New incoming shipping query. Only for invoices with flexible price
    @JsonProperty("pre_checkout_query")
    private PreCheckoutQuery preCheckoutQuery; // Optional. New incoming pre-checkout query. Contains full information about checkout
    private Poll poll; // Optional. New poll state. Bots receive only updates about stopped polls and polls, which are sent by the bot
    @JsonProperty("poll_answer")
    private PollAnswer pollAnswer; // Optional. A user changed their answer in a non-anonymous poll. Bots receive new votes only in polls that were sent by the bot itself.
    @JsonProperty("my_chat_member")
    private ChatMemberUpdated myChatMember; // Optional. The bot's chat member status was updated in a chat. For private chats, this update is received only when the bot is blocked or unblocked by the user.
    @JsonProperty("chat_member")
    private ChatMemberUpdated chatMember; // Optional. A chat member's status was updated in a chat. The bot must be an administrator in the chat and must explicitly specify “chat_member” in the list of allowed_updates to receive these updates.
    @JsonProperty("chat_join_request")
    private ChatJoinRequest chatJoinRequest; // Optional. A request to join the chat has been sent. The bot must have the can_invite_users administrator right in the chat to receive these updates.

}
