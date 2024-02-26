package com.pfe.backend.service;

import com.pfe.backend.dto.auth.AuthenticationRequest;
import com.pfe.backend.dto.auth.AuthenticationResponse;
import com.pfe.backend.dto.SignUpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface AuthService {


     ResponseEntity<AuthenticationResponse> signUp(SignUpRequest signUpRequest) ;
     ResponseEntity<AuthenticationResponse> login(AuthenticationRequest authenticationRequest) ;


}