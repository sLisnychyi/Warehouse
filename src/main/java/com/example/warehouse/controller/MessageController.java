package com.example.warehouse.controller;

import com.example.warehouse.model.RequestMessage;
import com.example.warehouse.model.ResponseMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Slf4j
@Controller
@RequiredArgsConstructor
public class MessageController {
    private final SimpMessagingTemplate template;

    @MessageMapping("/message")
    public void messageProcess(RequestMessage message) {
        log.info("message recieved {}", message);
        template.convertAndSend("/topic", message.getPayload());
    }

//    @MessageMapping("/message")
//    @SendTo("/topic")
//    public ResponseMessage messageProcessViaSendTo(RequestMessage message) {
//        log.info("message recieved {}", message);
//        return new ResponseMessage(message.getPayload());
//    }
}
