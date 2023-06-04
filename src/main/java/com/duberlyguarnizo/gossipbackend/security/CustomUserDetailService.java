package com.duberlyguarnizo.gossipbackend.security;

import com.duberlyguarnizo.gossipbackend.employee.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    private final EmployeeRepository employeeRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        var possibleEmployee = employeeRepository.findByUsernameIgnoreCase(username);
        if (possibleEmployee.isEmpty()) {
            throw new UsernameNotFoundException("The user with the name " + username + " could not be found!");
        } else {
            return possibleEmployee.get();
        }
    }
}
