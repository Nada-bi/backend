package com.pfe.backend.dto.auth;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationRequest {

    // Getters and setters
    private String email;
    private String password;



}
