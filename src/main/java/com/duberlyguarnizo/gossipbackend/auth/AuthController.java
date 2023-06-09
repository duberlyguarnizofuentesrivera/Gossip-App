package com.duberlyguarnizo.gossipbackend.auth;

import com.duberlyguarnizo.gossipbackend.employee.Employee;
import com.duberlyguarnizo.gossipbackend.security.CustomUserDetailService;
import com.duberlyguarnizo.gossipbackend.security.JwtUtil;
import lombok.extern.java.Log;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@Log
public class AuthController {
    private final AuthenticationManager authenticationManager;
    private final CustomUserDetailService userDetailService;
    private final JwtUtil jwtUtil;

    public AuthController(AuthenticationManager authenticationManager, CustomUserDetailService userDetailService, JwtUtil jwtUtil) {
        this.authenticationManager = authenticationManager;
        this.userDetailService = userDetailService;
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("authenticate")
    public ResponseEntity<AuthResponse> doAuthenticate(@RequestBody AuthRequest request) throws AuthenticationException {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getUsername(),
                        request.getPassword()));
        final Employee employee = (Employee) userDetailService.loadUserByUsername(request.getUsername());
        final String jwt = jwtUtil.generateToken(employee);
        AuthResponse response = new AuthResponse(jwt);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
