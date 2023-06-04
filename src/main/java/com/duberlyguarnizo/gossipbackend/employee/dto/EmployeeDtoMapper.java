package com.duberlyguarnizo.gossipbackend.employee.dto;

import com.duberlyguarnizo.gossipbackend.employee.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeDtoMapper {
    EmployeeDtoMapper INSTANCE = Mappers.getMapper(EmployeeDtoMapper.class);

    Employee employeeRegistrationDtoToEmployee(EmployeeRegistrationDto registrationDto);

}
