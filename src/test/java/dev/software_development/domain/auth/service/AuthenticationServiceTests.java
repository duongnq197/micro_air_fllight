package dev.software_development.domain.auth.service;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import dev.software_development.application.constant.ResponseCode;
import dev.software_development.application.dto.exception.BusinessException;
import dev.software_development.domain.auth.dto.TokenResponse;
import dev.software_development.domain.auth.dto.request.LoginRequest;
import dev.software_development.domain.auth.entity.User;
import dev.software_development.domain.auth.repository.UserRepository;
import dev.software_development.domain.auth.service.AuthenticationService;


@ExtendWith(MockitoExtension.class)
public class AuthenticationServiceTests {

    @InjectMocks
    AuthenticationService service;

    @Mock
    UserRepository userRepository;

    public static User defaultUser;

    @BeforeAll
    public void init() {
        defaultUser = new User("test", "Pass_test", "test");
    }


    @Test
    public void authenticate_RightUser_ReturnToken() {
        // 1. Arrange
        LoginRequest request = new LoginRequest("test", "Pass_test");

        when(userRepository.findByUsername(request.getUsername()))
                .thenReturn(defaultUser);

        // 2. Action
        TokenResponse response = service.authenticate(request);


        // 3. Assert
        assertNotNull(response);
        assertNotEquals("", response.getAccessToken());
    }

    @Test
    public void authenticate_UserNotFound_ReturnException() {
        // 1. Arrange
        LoginRequest request = new LoginRequest("ict_engineer", "pass34");
        when(userRepository.findByUsername(request.getUsername()))
                .thenReturn(null);

        // 2. Action
        BusinessException exception = assertThrows(
                BusinessException.class,
                () -> service.authenticate(request)
        );

        // 3. Assert
        assertEquals(ResponseCode.USERNAME_OR_PASSWORD_INVALID, exception.getResponseCode());
    }




    // negative, 0, positive
    // method()
    // test 2
    // test 0
    // testNonNegative
    // int[] a = [0, 2, 999999]
    // for (int test: a)
    // {...}













}
