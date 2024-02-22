package com.tong.telegramBot.domain.telegram;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * This object represents a point on the map.
 * <p>
 * Created by tong on 2022/08/23
 */
@Data
@Accessors(chain = true)
public class Location {

    private Float longitude; // Longitude as defined by sender
    private Float latitude; // Latitude as defined by sender
    @JsonProperty("horizontal_accuracy")
    private Float horizontalAccuracy; // Optional. The radius of uncertainty for the location, measured in meters; 0-1500
    @JsonProperty("live_period")
    private Integer livePeriod; // Optional. Time relative to the message sending date, during which the location can be updated; in seconds. For active live locations only.
    private Integer heading; // Optional. The direction in which user is moving, in degrees; 1-360. For active live locations only.
    @JsonProperty("proximity_alert_radius")
    private Integer proximityAlertRadius; // Optional. The maximum distance for proximity alerts about approaching another chat member, in meters. For sent live locations only.

}
