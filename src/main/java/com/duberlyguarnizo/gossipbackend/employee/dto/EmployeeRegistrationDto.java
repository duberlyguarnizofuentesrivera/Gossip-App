package com.duberlyguarnizo.gossipbackend.employee.dto;

import com.duberlyguarnizo.gossipbackend.enums.EmployeeRole;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmployeeRegistrationDto {
    @NotBlank
    private String names;
    @NotBlank
    private String username;
    @NotBlank
    private String password;
    private String email;
    @NotBlank
    private String idCard;
    @NotNull
    private EmployeeRole role;
}
