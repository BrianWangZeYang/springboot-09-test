package com.kuang.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author xxx
 * @version 1.0
 * @Description
 * @date 2022/8/19 10:48
 */
@Service
public class ScheduledService {
    //在一个特定的事件执行这个方法~Timer
    @Scheduled(cron = "0 * * * * 0-7")
    public void hello(){
        System.out.println("hello,你被执行了~");
    }
}
