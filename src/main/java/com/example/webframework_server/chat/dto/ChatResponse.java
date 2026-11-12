package com.example.webframework_server.chat.dto;

import com.example.webframework_server.user.Avatar;
import com.example.webframework_server.user.dto.AvatarResponse;

import java.time.Instant;

public record ChatResponse(
        Long userAccountId,
        String nickname,
        String content,
        Instant sentAt,
        AvatarResponse avatar
) {
}
