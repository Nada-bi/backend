package com.pfe.backend.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SignUpRequest {

        private String username ;
        private String email;
        private String password;

        // Getters and setters
    }


