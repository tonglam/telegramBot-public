package com.tong.telegramBot.domain.telegram;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * This object represents the content of a service message, sent whenever a user in the chat triggers a proximity alert set by another user.
 * <p>
 * Created by tong on 2022/08/23
 */
@Data
@Accessors(chain = true)
public class ProximityAlertTriggered {

    private User traveler; // User that triggered the alert
    private User watcher; // User that set the alert
    private Integer distance; // The distance between the users

}
