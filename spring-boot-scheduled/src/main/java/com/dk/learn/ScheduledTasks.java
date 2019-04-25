package com.dk.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @title: ScheduledTasks
 * @projectName spring-boot-learnning
 * @Description: TODO
 * @Auther: Cheri
 * @Date: 2019/4/24 23:02
 */
@Component
public class ScheduledTasks {

    private Logger logger = LoggerFactory.getLogger(ScheduledTasks.class);

    // cron接受cron表达式，根据cron表达式确定定时规则
    @Scheduled(cron="0/5 * * * * ? ")   //每5秒执行一次
    public void testCron() {
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        logger.info(sdf.format(new Date())+"*********每5秒执行一次");
    }

    @Scheduled(cron="0/1 * * * * ? ")   //每1秒执行一次
    public void testCron1() {
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        logger.info(sdf.format(new Date())+"*********每1秒执行一次");
    }

    @Scheduled(cron="0/2 * * * * ? ")   //每2秒执行一次
    public void testCron2() {
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        logger.info(sdf.format(new Date())+"*********每2秒执行一次");
    }

    @Scheduled(cron="0/3 * * * * ? ")   //每3秒执行一次
    public void testCron3() {
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        logger.info(sdf.format(new Date())+"*********每3秒执行一次");
    }

    @Scheduled(cron="0/4 * * * * ? ")   //每4秒执行一次
    public void testCron4() {
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        logger.info(sdf.format(new Date())+"*********每4秒执行一次");
    }

}