package dev.software_development.application.endpoint.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dev.software_development.domain.auth.dto.TokenResponse;
import dev.software_development.domain.auth.dto.request.LoginRequest;
import dev.software_development.domain.auth.service.AuthenticationService;


@RestController
@Slf4j
public class AuthController {

    @Autowired
    AuthenticationService authenticationService;

    @PostMapping("/login")
    public TokenResponse login(@RequestBody LoginRequest request) {
        return authenticationService.authenticate(request);
    }
}
