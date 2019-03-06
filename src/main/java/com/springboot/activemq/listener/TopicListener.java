package com.springboot.activemq.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * 西安海汇防务科技有限公司
 * Copyright (c) 2018, tianta All Rights Reserved.
 * Created by xiejiayi on 2019/3/6.
 */
@Component
public class TopicListener {

    @JmsListener(destination = "publish.topic", containerFactory = "jmsListenerContainerTopic")
    public void receive(String text){
        System.out.println("TopicListener: consumer-a 收到一条信息: " + text);
    }
}
