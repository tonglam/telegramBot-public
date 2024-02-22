package com.tong.telegramBot.domain.telegram.gettingUpdates;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * Describes the current status of a webhook.
 * <p>
 * Created by tong on 2022/08/25
 */
@Data
@Accessors(chain = true)
public class WebhookInfo {

    private String url; // Webhook URL, may be empty if webhook is not set up
    @JsonProperty("has_custom_certificate")
    private Boolean hasCustomCertificate; // True, if a custom certificate was provided for webhook certificate checks
    @JsonProperty("pending_update_count")
    private Integer pendingUpdateCount; // Number of updates awaiting delivery
    @JsonProperty("ip_address")
    private String ipAddress; // Optional. Currently used webhook IP address
    @JsonProperty("last_error_date")
    private Integer lastErrorDate; // Optional. Unix time for the most recent error that happened when trying to deliver an update via webhook
    @JsonProperty("last_error_message")
    private String lastErrorMessage; // Optional. Error message in human-readable format for the most recent error that happened when trying to deliver an update via webhook
    @JsonProperty("last_synchronization_error_date")
    private Integer lastSynchronizationErrorDate; // Optional. Unix time of the most recent error that happened when trying to synchronize available updates with Telegram datacenters
    @JsonProperty("max_connections")
    private Integer maxConnections; // Optional. The maximum allowed number of simultaneous HTTPS connections to the webhook for update delivery
    @JsonProperty("allowed_updates")
    private List<String> allowedUpdates; // Optional. A list of update types the bot is subscribed to. Defaults to all update types except chat_member

}
