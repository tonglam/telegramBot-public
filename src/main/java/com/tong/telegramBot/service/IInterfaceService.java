package com.tong.telegramBot.service;

import java.util.Optional;

/**
 * Create by tong on 2023/1/2
 */
public interface IInterfaceService {

    Optional<String> qryPlayerValueByDate(String date);

    Optional<String> qryCurrentEventAndNextUtcDeadline();

    Optional<String> calcLivePointsByEntry(int event, int entry);

    Optional<String> queryHermesInfoList();

}
