package com.duberlyguarnizo.gossipbackend.supervision.dto;

import com.duberlyguarnizo.gossipbackend.enums.StrikeReason;
import com.duberlyguarnizo.gossipbackend.supervision.models.StrikedGossip;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link StrikedGossip}
 */
@Value
public class StrikedGossipCreationDto implements Serializable {
    String notes;
    Long id;
    Long gossipId;
    StrikeReason reason;
    boolean strikedByEngine;
}