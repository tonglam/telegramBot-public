package com.tong.telegramBot.domain.telegram.availableTypes;

import com.tong.telegramBot.domain.telegram.Location;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Represents a location to which a chat is connected.
 * <p>
 * Created by tong on 2022/08/23
 */
@Data
@Accessors(chain = true)
public class ChatLocation {

    private Location location; // The location to which the supergroup is connected. Can't be a live location.
    private String address; // Location address; 1-64 characters, as defined by the chat owner

}
