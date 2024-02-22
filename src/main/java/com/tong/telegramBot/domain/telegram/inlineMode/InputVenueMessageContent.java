package com.tong.telegramBot.domain.telegram.inlineMode;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Represents the content of a venue message to be sent as the result of an inline query.
 * <p>
 * Created by tong on 2022/08/24
 */
@Getter
@Setter
@Accessors(chain = true)
public class InputVenueMessageContent extends InputMessageContent {

    private Float latitude; // Latitude of the location in degrees
    private Float longitude; // Longitude of the location in degrees
    private String title; // Name of the venue
    private String address; // Address of the venue
    @JsonProperty("foursquare_id")
    private String foursquareId; // Optional. Foursquare identifier of the venue, if known
    @JsonProperty("foursquare_type")
    private String foursquareType; // Optional. Foursquare type of the venue, if known. (For example, “arts_entertainment/default”, “arts_entertainment/aquarium” or “food/icecream”.)
    @JsonProperty("google_place_id")
    private String googlePlaceId; // Optional. Google Places identifier of the venue
    @JsonProperty("google_place_type")
    private String googlePlaceType; // Optional. Google Places type of the venue. (See supported types.)

}
