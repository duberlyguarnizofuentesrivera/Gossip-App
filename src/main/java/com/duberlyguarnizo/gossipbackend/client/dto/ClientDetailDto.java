package com.duberlyguarnizo.gossipbackend.client.dto;

import com.duberlyguarnizo.gossipbackend.client.Client;
import com.duberlyguarnizo.gossipbackend.gossip.dto.GossipBasicDto;
import lombok.Value;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

/**
 * DTO for {@link Client}
 */
@Value
public class ClientDetailDto implements Serializable {
    boolean deleted;
    Long createdBy;
    LocalDateTime createdDate;
    Long lastModifiedBy;
    LocalDateTime lastModifiedDate;
    String notes;
    Long id;
    String email;
    String names;
    Long locationId;
    Set<GossipBasicDto> gossipsId;
    boolean active;
    int strikes;
}