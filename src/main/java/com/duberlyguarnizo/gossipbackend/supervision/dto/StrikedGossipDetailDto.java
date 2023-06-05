package com.duberlyguarnizo.gossipbackend.supervision.dto;

import com.duberlyguarnizo.gossipbackend.enums.StrikeReason;
import com.duberlyguarnizo.gossipbackend.supervision.models.StrikedGossip;
import lombok.Value;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link StrikedGossip}
 */
@Value
public class StrikedGossipDetailDto implements Serializable {
    boolean deleted;
    Long createdBy;
    LocalDateTime createdDate;
    Long lastModifiedBy;
    LocalDateTime lastModifiedDate;
    String notes;
    Long id;
    Long gossipId;
    StrikeReason reason;
    boolean strikedByEngine;
}