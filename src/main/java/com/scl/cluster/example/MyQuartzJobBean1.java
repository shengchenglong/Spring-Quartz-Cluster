package com.scl.cluster.example;

import org.quartz.*;

/**
 * @author shengchenglong
 * @version 1.0
 * @since 17/7/3 14:15 JDK} 1.8
 */
@PersistJobDataAfterExecution
@DisallowConcurrentExecution
public class MyQuartzJobBean1 implements Job {


    @Override
    public void execute(JobExecutionContext jobExecutionContext) {
        try {
            Long threadId = Thread.currentThread().getId();
            String scheculerInstanceId = jobExecutionContext.getScheduler().getSchedulerInstanceId();
            System.out.println("线程Id:" + threadId + ", 任务调度实例Id: " + scheculerInstanceId + " aaaaaaaaaaaaaaaaaa");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
