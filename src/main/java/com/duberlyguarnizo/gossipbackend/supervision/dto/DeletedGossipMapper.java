package com.duberlyguarnizo.gossipbackend.supervision.dto;

import com.duberlyguarnizo.gossipbackend.supervision.models.DeletedGossip;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface DeletedGossipMapper {
    DeletedGossip toEntity(DeletedGossipCreationDto deletedGossipCreationDto);

    DeletedGossipDetailDto toDetailDto(DeletedGossip deletedGossip);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    DeletedGossip partialUpdate(DeletedGossipDetailDto deletedGossipDetailDto, @MappingTarget DeletedGossip deletedGossip);
}