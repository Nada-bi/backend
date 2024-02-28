package com.pfe.backend.controller;


import com.pfe.backend.dto.auth.AuthService;
import com.pfe.backend.dto.auth.AuthenticationRequest;
import com.pfe.backend.dto.auth.AuthenticationResponse;
import com.pfe.backend.dto.SignUpRequest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService service;


    @PostMapping("/signup")
    public ResponseEntity<AuthenticationResponse> signup
            (@RequestBody SignUpRequest request) {
        return ResponseEntity.ok(service.signup(request));
    }


    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponse> login
            (@RequestBody AuthenticationRequest request, @RequestParam String jwtToken) {
        return ResponseEntity.ok(service.login(request, jwtToken));
    }}

