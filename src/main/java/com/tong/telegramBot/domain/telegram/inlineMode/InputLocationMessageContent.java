package com.tong.telegramBot.domain.telegram.inlineMode;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Represents the content of a location message to be sent as the result of an inline query.
 * <p>
 * Created by tong on 2022/08/24
 */
@Getter
@Setter
@Accessors(chain = true)
public class InputLocationMessageContent extends InputMessageContent {

    private Float latitude; // Latitude of the location in degrees
    private Float longitude; // Longitude of the location in degrees
    @JsonProperty("horizontal_accuracy")
    private Float horizontalAccuracy; // Optional. The radius of uncertainty for the location, measured in meters; 0-1500
    @JsonProperty("live_period")
    private Integer livePeriod; // Optional. Period in seconds for which the location can be updated, should be between 60 and 86400.
    private Integer heading; // Optional. For live locations, a direction in which the user is moving, in degrees. Must be between 1 and 360 if specified.
    @JsonProperty("proximity_alert_radius")
    private Integer proximityAlertRadius; // Optional. For live locations, a maximum distance for proximity alerts about approaching another chat member, in meters. Must be between 1 and 100000 if specified.

}
