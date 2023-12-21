package dev.software_development.domain.auth.service;

import dev.software_development.domain.auth.dto.TokenResponse;
import dev.software_development.domain.auth.entity.User;

public class TokenService {


    public static TokenResponse generateToken(User user) {
        return TokenResponse.builder()
                .accessToken("testAccessToken")
                .expiresIn(1000L)
                .build();
    }
}
