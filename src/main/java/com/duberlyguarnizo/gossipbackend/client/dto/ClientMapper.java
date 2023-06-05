package com.duberlyguarnizo.gossipbackend.client.dto;

import com.duberlyguarnizo.gossipbackend.client.Client;
import com.duberlyguarnizo.gossipbackend.gossip.dto.GossipMapper;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING, uses = {GossipMapper.class})
public interface ClientMapper {

    ClientBasicDto toBasicDto(Client client);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Client partialUpdate(ClientBasicDto clientBasicDto, @MappingTarget Client client);

    ClientDetailDto toDetailDto(Client client);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Client partialUpdate(ClientDetailDto clientDetailDto, @MappingTarget Client client);

    Client toEntity(ClientCreationDto clientCreationDto);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Client partialUpdate(ClientCreationDto clientCreationDto, @MappingTarget Client client);
}