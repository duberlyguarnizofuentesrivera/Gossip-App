package com.duberlyguarnizo.gossipbackend.gossip.dto;

import com.duberlyguarnizo.gossipbackend.gossip.Gossip;
import lombok.Value;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link Gossip}
 */
@Value
public class GossipDetailDto implements Serializable {
    boolean deleted;
    Long createdBy;
    LocalDateTime createdDate;
    Long lastModifiedBy;
    LocalDateTime lastModifiedDate;
    String notes;
    Long id;
    String text;
    Long locationId;
    String neighborhood;
    int strikes;
    boolean revisited;
    Long positives;
    Long negatives;
    Long neutral;
}