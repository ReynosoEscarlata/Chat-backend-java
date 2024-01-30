package com.chat.socket.controller;

import com.chat.socket.dto.ChatMessage;
import com.chat.socket.helpers.FormatDateTime;

import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;


@Controller
@RequiredArgsConstructor
public class WebSocketController {
    FormatDateTime formatDateTime = new FormatDateTime();
    @MessageMapping("/chat/{roomId}")
    @SendTo("/topic/{roomId}")
    public ChatMessage chat(@DestinationVariable String roomId, ChatMessage message) {
        String[] dateTimeArray = formatDateTime.FormatDateTimeString(LocalDateTime.now());
        System.out.println(Arrays.toString(dateTimeArray));
        return new ChatMessage(message.getMessage(), message.getUser(),LocalDateTime.now());
    }
}
