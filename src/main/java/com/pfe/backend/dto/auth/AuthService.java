package com.pfe.backend.dto.auth;

import com.pfe.backend.config.JwtService;
import com.pfe.backend.dto.SignUpRequest;
import com.pfe.backend.entity.Role;
import com.pfe.backend.entity.User;
import com.pfe.backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

        private final UserRepository repository ;
        private final PasswordEncoder passwordEncoder;
        private final JwtService jwtService;
        private final AuthenticationManager authenticationManager;
        public AuthenticationResponse signup(SignUpRequest request){
            var user = User.builder()
                    .username(request.getUsername())
                    .email(request.getEmail())
                    .password(passwordEncoder.encode(request.getPassword()))
                    .role(Role.USER)
                    .build();
            repository.save(user);
            var jwtToken = jwtService.generateToken(user);
            return AuthenticationResponse.builder()
                    .token(jwtToken)
                    .build();
        }
        public AuthenticationResponse login(AuthenticationRequest request, String jwtToken){
            authenticationManager.authenticate(
                 new UsernamePasswordAuthenticationToken(
                         request.getEmail(),
                         request.getPassword()
                 )
            );
var user =repository.findByEmail(request.getEmail());
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build() ;
        }

}








