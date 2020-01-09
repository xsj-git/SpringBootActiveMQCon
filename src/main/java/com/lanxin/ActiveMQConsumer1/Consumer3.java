package com.lanxin.ActiveMQConsumer1;


import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;


@Component
public class Consumer3 {

    @JmsListener(destination = "lanxin_topic",containerFactory = "jmsListenerContainerTopic")
    public void Text(String sas){
        System.out.println("Topic Consumer3 "+sas);
    }
}
