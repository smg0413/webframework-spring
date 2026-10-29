package com.example.webframework_server.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker   // STOMP 메세지 처리와 브로커 기능 활성화
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    // STOMP : simple Text Oriented Messaging Protocol
    // 메세지를 주고받는 규칙

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws-chat")    // 브라우저 WebSocket 연결 맺는 주소
                .setAllowedOrigins("http://localhost:3000");
    }

    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.setApplicationDestinationPrefixes("/app"); // Controller가 처리할 메세지 목적지의 접두사
        registry.enableSimpleBroker("/topic");  // 내장 브로커가 구독자들에게 전달할 메세지 목적지의 접두사
    }

}
