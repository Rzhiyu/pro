package com.example.demo3.service;

import com.example.demo3.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import java.io.Serializable;

@Service
public class JmsOrderMessagingService implements UserMessagingService {

    private JmsTemplate jms;
    @Autowired
    public JmsOrderMessagingService(JmsTemplate jms) {
        this.jms = jms;
    }
    @Override
    public void sendOrder(User user) {
        jms.send(session -> session.createObjectMessage(user));
    }
}
