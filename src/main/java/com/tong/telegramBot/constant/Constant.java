package com.tong.telegramBot.constant;

/**
 * Created by tong on 2022/08/22
 */
public class Constant {

    // bot-letletme
    public static final String BOT_TOKEN = "";
    public static final String BOT_USERNAME = "";
    public static final String BOT_USER_INFO_KEY = "letletmeBot::userInfo";
    public static final String BOT_NOTIFICATION_KEY = "letletmeBot::notification";

    // date_format
    public static final String DATETIME = "yyyy-MM-dd HH:mm:ss";
    public static final String DATE = "yyyy-MM-dd";
    public static final String SHORTDAY = "yyyyMMdd";
    // hermes
    public static final String HERMES_KEY = "hermes_bags";
    // fpl
    private static final String FPL_PREFIX = "https://xxx/api/";
    public static final String FPL_PLAYER_VALUE_BY_DATE = FPL_PREFIX + "stat/qryPlayerValueByDate?date=%s";
    public static final String FPL_CURRENT_EVENT_AND_NEXT_UTC_DEADLINE = FPL_PREFIX + "common/qryCurrentEventAndNextUtcDeadline";
    public static final String FPL_LIVE_ENTRY_POINTS = FPL_PREFIX + "live/calcLivePointsByEntry?event=%s&&entry=%s";
    private static final String HERMES_PREFIX = "https://xxx/notice/hermes/";
    public static final String HERMES_GET_ALL = HERMES_PREFIX + "queryHermesInfoList";

}
