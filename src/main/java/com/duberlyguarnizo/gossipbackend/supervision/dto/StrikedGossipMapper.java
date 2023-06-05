package com.duberlyguarnizo.gossipbackend.supervision.dto;

import com.duberlyguarnizo.gossipbackend.supervision.models.StrikedGossip;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface StrikedGossipMapper {

    StrikedGossipDetailDto toDetailDto(StrikedGossip strikedGossip);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    StrikedGossip partialUpdate(StrikedGossipDetailDto strikedGossipDetailDto, @MappingTarget StrikedGossip strikedGossip);

    StrikedGossip toEntity(StrikedGossipCreationDto strikedGossipCreationDto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    StrikedGossip partialUpdate(StrikedGossipCreationDto strikedGossipCreationDto, @MappingTarget StrikedGossip strikedGossip);
}