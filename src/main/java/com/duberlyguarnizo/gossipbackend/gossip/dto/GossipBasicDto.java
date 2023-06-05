package com.duberlyguarnizo.gossipbackend.gossip.dto;

import com.duberlyguarnizo.gossipbackend.gossip.Gossip;
import lombok.Value;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link Gossip}
 */
@Value
public class GossipBasicDto implements Serializable {
    LocalDateTime createdDate;
    Long id;
    String text;
    Long locationId;
    Long positives;
}