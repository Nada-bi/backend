package com.pfe.backend.service.impl;

import com.pfe.backend.dto.auth.AuthenticationRequest;
import com.pfe.backend.dto.auth.AuthenticationResponse;
import com.pfe.backend.dto.SignUpRequest;
import com.pfe.backend.service.AuthService;
import org.springframework.http.ResponseEntity;

public class AuthSeviceImpl implements AuthService {
    @Override
    public ResponseEntity<AuthenticationResponse> signUp(SignUpRequest signUpRequest) {
        return null;
    }

    @Override
    public ResponseEntity<AuthenticationResponse> login(AuthenticationRequest authenticationRequest) {
        return null;
    }
}
