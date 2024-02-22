package com.tong.telegramBot.domain.telegram.inlineMode;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tong.telegramBot.domain.telegram.InlineKeyboardMarkup;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Represents a venue. By default, the venue will be sent by the user. Alternatively, you can use input_message_content to send a message with the specified content instead of the venue.
 * <p>
 * Created by tong on 2022/08/24
 */
@Getter
@Setter
@Accessors(chain = true)
public class InlineQueryResultVenue extends InlineQueryResult {

    private String type; // Type of the result, must be venue
    private String id; // Unique identifier for this result, 1-64 Bytes
    private Float latitude; // Latitude of the venue location in degrees
    private Float longitude; // Longitude of the venue location in degrees
    private String title; // Title of the venue
    private String address; // Address of the venue
    @JsonProperty("foursquare_id")
    private String foursquareId; // Optional. Foursquare identifier of the venue if known
    @JsonProperty("foursquare_type")
    private String foursquareType; // Optional. Foursquare type of the venue, if known. (For example, “arts_entertainment/default”, “arts_entertainment/aquarium” or “food/icecream”.)
    @JsonProperty("google_place_id")
    private String googlePlaceId; // Optional. Google Places identifier of the venue
    @JsonProperty("google_place_type")
    private String googlePlaceType; // Optional. Google Places type of the venue. (See supported types.)
    @JsonProperty("reply_markup")
    private InlineKeyboardMarkup replyMarkup; // Optional. Inline keyboard attached to the message
    @JsonProperty("input_message_content")
    private InputMessageContent inputMessageContent; // Optional. Content of the message to be sent instead of the venue
    @JsonProperty("thumb_url")
    private String thumbUrl; // Optional. Url of the thumbnail for the result
    @JsonProperty("thumb_width")
    private Integer thumbWidth; // Optional. Thumbnail width
    @JsonProperty("thumb_height")
    private Integer thumbHeight; // Optional. Thumbnail height

}
