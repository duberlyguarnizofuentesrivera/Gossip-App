package com.duberlyguarnizo.gossipbackend.location.dto;

import com.duberlyguarnizo.gossipbackend.location.Location;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface LocationMapper {
    Location toEntity(LocationDetailDto locationDetailDto);

    LocationDetailDto toDetailDto(Location location);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Location partialUpdate(LocationDetailDto locationDetailDto, @MappingTarget Location location);
}