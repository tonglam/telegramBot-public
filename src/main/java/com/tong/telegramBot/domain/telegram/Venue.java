package com.tong.telegramBot.domain.telegram;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * This object represents a venue.
 * <p>
 * Created by tong on 2022/08/23
 */
@Data
@Accessors(chain = true)
public class Venue {

    private Location location; // Venue location. Can't be a live location
    private String title; // Name of the venue
    private String address; // Address of the venue
    @JsonProperty("foursquare_id")
    private String foursquareId; // Optional. Foursquare identifier of the venue
    @JsonProperty("foursquare_type")
    private String foursquareType; // Optional. Foursquare type of the venue. (For example, “arts_entertainment/default”, “arts_entertainment/aquarium” or “food/icecream”.)
    @JsonProperty("google_place_id")
    private String googlePlaceId; // Optional. Google Places identifier of the venue
    @JsonProperty("google_place_type")
    private String googlePlaceType; // Optional. Google Places type of the venue. (See supported types.)

}
