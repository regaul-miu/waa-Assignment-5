package com.miu.waa.assignment5.service;

import com.miu.waa.assignment5.domain.dto.request.LoginRequest;
import com.miu.waa.assignment5.domain.dto.request.RefreshTokenRequest;
import com.miu.waa.assignment5.domain.dto.response.LoginResponse;

public interface AuthService {
    LoginResponse login(LoginRequest loginRequest);
    LoginResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
