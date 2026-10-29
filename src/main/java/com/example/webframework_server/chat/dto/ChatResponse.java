package com.example.webframework_server.chat.dto;

import java.time.Instant;

public record ChatResponse(
        String content,
        Instant sentAt
) {
}
