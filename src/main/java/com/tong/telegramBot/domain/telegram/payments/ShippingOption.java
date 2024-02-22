package com.tong.telegramBot.domain.telegram.payments;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * This object represents one shipping option.
 * <p>
 * Created by tong on 2022/08/24
 */
@Data
@Accessors(chain = true)
public class ShippingOption {

    private String id; // Shipping option identifier
    private String title; // Option title
    private List<LabeledPrice> prices; // List of price portions

}
