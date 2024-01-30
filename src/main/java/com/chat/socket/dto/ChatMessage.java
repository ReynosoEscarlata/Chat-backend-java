package com.chat.socket.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChatMessage {
    
    String message;
    String user;
    LocalDateTime dateTimeSend;
    
}
