package com.tong.telegramBot.domain.telegram.gettingUpdates;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Use this method to remove webhook integration if you decide to switch back to getUpdates. Returns True on success.
 * <p>
 * Created by tong on 2022/08/25
 */
@Data
@Accessors(chain = true)
public class DeleteWebhook {

    @JsonProperty("drop_pending_updates")
    private Boolean dropPendingUpdates; // Pass True to drop all pending updates

}
