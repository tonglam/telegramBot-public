package com.tong.telegramBot;

import com.tong.telegramBot.constant.Constant;
import com.tong.telegramBot.utils.HttpUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

/**
 * Create by tong on 2023/1/2
 */
public class HttpTest extends TelegramBotApplicationTests {

    @Test
    void get() throws IOException {
        String date = LocalDate.now().plusDays(1).format(DateTimeFormatter.ofPattern(Constant.SHORTDAY));
        Optional<String> result = HttpUtils.httpGet(String.format(Constant.FPL_PLAYER_VALUE_BY_DATE, "20240224"));
        System.out.println(1);
    }

}
