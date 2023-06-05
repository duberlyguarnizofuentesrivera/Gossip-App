package com.duberlyguarnizo.gossipbackend.supervision.dto;

import com.duberlyguarnizo.gossipbackend.supervision.models.DeletedGossip;
import lombok.Value;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link DeletedGossip}
 */
@Value
public class DeletedGossipDetailDto implements Serializable {
    boolean deleted;
    Long createdBy;
    LocalDateTime createdDate;
    Long lastModifiedBy;
    LocalDateTime lastModifiedDate;
    String notes;
    Long id;
    Long gossipId;
    boolean deletedByEngine;
}