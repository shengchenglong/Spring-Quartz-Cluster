package com.scl.cluster.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shengchenglong
 * @version 1.0
 * @since 17/7/4 09:43 JDK} 1.8
 */
public class Application {

    public static void main(String[] args) {
        ApplicationContext springContext = new ClassPathXmlApplicationContext(new String[]{"classpath:applicationContext.xml", "classpath:applicationContext-quartz.xml"});
    }

}
