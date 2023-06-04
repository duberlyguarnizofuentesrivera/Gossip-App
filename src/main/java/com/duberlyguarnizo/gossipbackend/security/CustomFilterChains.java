package com.duberlyguarnizo.gossipbackend.security;

import com.duberlyguarnizo.gossipbackend.enums.EmployeeRole;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.stereotype.Component;

@Component
@EnableWebSecurity
public class CustomFilterChains {
    private final JwtRequestFilter jwtRequestFilter;

    public CustomFilterChains(JwtRequestFilter jwtRequestFilter) {
        this.jwtRequestFilter = jwtRequestFilter;
    }

    @Bean
    SecurityFilterChain apiFilterChain(HttpSecurity http) throws Exception {
        http.cors(Customizer.withDefaults());
        http.csrf(csrf -> csrf.disable());
        http.authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/v1/public/**", "/api/v1/auth/authenticate", "/api/v1/employees")
                .permitAll().requestMatchers("/api/v1/hello-admin").hasAuthority(EmployeeRole.ADMIN.name())
                .requestMatchers("/api/v1/hello-super").hasAuthority(EmployeeRole.SUPERVISOR.name())
                .anyRequest()
                .authenticated());
        http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
        http.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }
}
