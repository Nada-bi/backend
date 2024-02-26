package com.pfe.backend.dto.auth;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AuthenticationRequest {
    // Getters and setters
    private String email;
    private String password;



}
