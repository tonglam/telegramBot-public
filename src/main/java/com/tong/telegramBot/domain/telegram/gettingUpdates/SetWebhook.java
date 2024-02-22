package com.tong.telegramBot.domain.telegram.gettingUpdates;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * Use this method to specify a URL and receive incoming updates via an outgoing webhook. Whenever there is an update for the bot, we will send an HTTPS POST request to the specified URL, containing a JSON-serialized Update. In case of an unsuccessful request, we will give up after a reasonable amount of attempts. Returns True on success.
 * <p>
 * Created by tong on 2022/08/25
 */
@Data
@Accessors(chain = true)
public class SetWebhook {

    @NotNull
    private String url; // HTTPS URL to send updates to. Use an empty string to remove webhook integration
    private String certificate; // Upload your public key certificate so that the root certificate in use can be checked. See our self-signed guide for details.
    @JsonProperty("ip_address")
    private String ipAddress; // The fixed IP address which will be used to send webhook requests instead of the IP address resolved through DNS
    @JsonProperty("max_connections")
    private Integer maxConnections; // The maximum allowed number of simultaneous HTTPS connections to the webhook for update delivery, 1-100. Defaults to 40. Use lower values to limit the load on your bot's server, and higher values to increase your bot's throughput.
    @JsonProperty("allowed_updates")
    private List<String> allowedUpdates; // A JSON-serialized list of the update types you want your bot to receive. For example, specify [“message”, “edited_channel_post”, “callback_query”] to only receive updates of these types. See Update for a complete list of available update types. Specify an empty list to receive all update types except chat_member (default). If not specified, the previous setting will be used. Please note that this parameter doesn't affect updates created before the call to the setWebhook, so unwanted updates may be received for a short period of time.
    @JsonProperty("drop_pending_updates")
    private Boolean dropPendingUpdates; // Pass True to drop all pending updates
    @JsonProperty("secret_token")
    private String secretToken; // A secret token to be sent in a header “X-Telegram-Bot-Api-Secret-Token” in every webhook request, 1-256 characters. Only characters A-Z, a-z, 0-9, _ and - are allowed. The header is useful to ensure that the request comes from a webhook set by you.

}
