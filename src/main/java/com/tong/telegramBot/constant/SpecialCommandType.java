package com.tong.telegramBot.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

/**
 * Create by tong on 2023/1/6
 */
@Getter
@AllArgsConstructor
public enum SpecialCommandType {

    HERMES_ALL("photo");

    private final String type;

    public static String getSpecialCommandType(String text) {
        return Arrays.stream(SpecialCommandType.values())
                .filter(o -> StringUtils.equalsIgnoreCase(o.name(), text))
                .map(SpecialCommandType::getType)
                .findFirst()
                .orElse(null);
    }

}
