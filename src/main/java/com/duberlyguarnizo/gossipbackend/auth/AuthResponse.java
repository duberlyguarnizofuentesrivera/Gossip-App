package com.duberlyguarnizo.gossipbackend.auth;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class AuthResponse {
    private final String jwt;
}
