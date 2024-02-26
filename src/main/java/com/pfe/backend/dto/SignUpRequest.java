package com.pfe.backend.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SignUpRequest {

        private String username ;
        private String email;
        private String password;

        // Getters and setters
    }


