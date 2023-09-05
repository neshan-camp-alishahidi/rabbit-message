package com.neshan.rabbitmessage.component;

import com.neshan.rabbitmessage.message.CustomMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SmsListener {
    @RabbitListener(queues = "q.send-sms")
    public String listenSms(CustomMessage message) {
        log.info("Message to sms {}", message);

        return message.getMessage() + " Sms ed.";

    }
}
