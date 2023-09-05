package com.neshan.rabbitmessage.component;

import com.neshan.rabbitmessage.message.CustomMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EmailListener {
    @RabbitListener(queues = "q.send-email")
    public String listenEmail(CustomMessage message) {
        log.info("Message to email {}", message);

        return message.getMessage() + " Emailed.";
    }
}
