package com.lanxin.ActiveMQConsumer1;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer2 {

    @JmsListener(destination = "lanxin_queue",containerFactory = "jmsListenerContainerQueue")
    public void Text(String sas){
        System.out.println("Queue Consumer2 " + sas);
    }

}
