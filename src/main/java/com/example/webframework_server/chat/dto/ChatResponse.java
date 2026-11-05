package com.example.webframework_server.chat.dto;

import java.time.Instant;

public record ChatResponse(
        Long userAccountId,
        String nickname,
        String content,
        Instant sentAt
) {
}
