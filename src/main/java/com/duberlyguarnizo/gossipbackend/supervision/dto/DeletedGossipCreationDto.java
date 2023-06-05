package com.duberlyguarnizo.gossipbackend.supervision.dto;

import com.duberlyguarnizo.gossipbackend.supervision.models.DeletedGossip;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link DeletedGossip}
 */
@Value
public class DeletedGossipCreationDto implements Serializable {
    String notes;
    Long id;
    Long gossipId;
    boolean deletedByEngine;
}