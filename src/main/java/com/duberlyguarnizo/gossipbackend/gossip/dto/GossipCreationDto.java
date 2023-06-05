package com.duberlyguarnizo.gossipbackend.gossip.dto;

import com.duberlyguarnizo.gossipbackend.gossip.Gossip;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link Gossip}
 */
@Value
public class GossipCreationDto implements Serializable {
    String notes;
    Long id;
    String text;
    Long locationId;
    String neighborhood;
}