package com.duberlyguarnizo.gossipbackend.gossip.dto;

import com.duberlyguarnizo.gossipbackend.gossip.Gossip;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface GossipMapper {

    GossipBasicDto toBasicDto(Gossip gossip);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Gossip partialUpdate(GossipBasicDto gossipBasicDto, @MappingTarget Gossip gossip);

    Gossip toEntity(GossipCreationDto gossipCreationDto);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Gossip partialUpdate(GossipCreationDto gossipCreationDto, @MappingTarget Gossip gossip);


    GossipDetailDto toDetailDto(Gossip gossip);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Gossip partialUpdate(GossipDetailDto gossipDetailDto, @MappingTarget Gossip gossip);
}