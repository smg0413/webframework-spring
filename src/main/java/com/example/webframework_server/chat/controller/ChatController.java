package com.example.webframework_server.chat.controller;

import com.example.webframework_server.chat.dto.ChatRequest;
import com.example.webframework_server.chat.dto.ChatResponse;
import jakarta.validation.Valid;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.time.Instant;

@Controller
public class ChatController {

    @MessageMapping("/chat.send")   // 클라이언트가 chat.send로 보낸 매세지
    @SendTo("/topic/chat")  // /topic/chat을 구독한 모든 클라이언트에게 전달
    public ChatResponse send(@Valid ChatRequest request) {
        return new ChatResponse(
                request.content(), Instant.now()
        );
    }

}
