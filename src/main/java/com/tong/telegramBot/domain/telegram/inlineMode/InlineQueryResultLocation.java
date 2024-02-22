package com.tong.telegramBot.domain.telegram.inlineMode;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tong.telegramBot.domain.telegram.InlineKeyboardMarkup;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Represents a location on a map. By default, the location will be sent by the user. Alternatively, you can use input_message_content to send a message with the specified content instead of the location.
 * <p>
 * Created by tong on 2022/08/24
 */
@Getter
@Setter
@Accessors(chain = true)
public class InlineQueryResultLocation extends InlineQueryResult {

    private String type; // Type of the result, must be location
    private String id; // Unique identifier for this result, 1-64 bytes
    private Float latitude; // Location latitude in degrees
    private Float longitude; // Location longitude in degrees
    private String title; // Location title
    @JsonProperty("horizontal_accuracy")
    private Float horizontalAccuracy; // Optional. The radius of uncertainty for the location, measured in meters; 0-1500
    @JsonProperty("live_period")
    private Integer livePeriod; // Optional. Period in seconds for which the location can be updated, should be between 60 and 86400.
    private Integer heading; // Optional. For live locations, a direction in which the user is moving, in degrees. Must be between 1 and 360 if specified.
    @JsonProperty("proximity_alert_radius")
    private Integer proximityAlertRadius; // Optional. For live locations, a maximum distance for proximity alerts about approaching another chat member, in meters. Must be between 1 and 100000 if specified.
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup; // Optional. Inline keyboard attached to the message
    @JsonProperty("input_message_content")
    private InputMessageContent inputMessageContent; // Optional. Content of the message to be sent instead of the file
    @JsonProperty("thumb_url")
    private String thumbUrl; // Optional. Url of the thumbnail for the result
    @JsonProperty("thumb_width")
    private Integer thumbWidth; // Optional. Thumbnail width
    @JsonProperty("thumb_height")
    private Integer thumbHeight; // Optional. Thumbnail height

}
