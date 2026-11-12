package com.example.webframework_server.user.dto;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record UpdataAvatarRequest(
        @NotNull @Positive Long avatarId
) {
}
