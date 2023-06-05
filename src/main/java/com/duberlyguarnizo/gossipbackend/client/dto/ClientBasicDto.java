package com.duberlyguarnizo.gossipbackend.client.dto;

import com.duberlyguarnizo.gossipbackend.client.Client;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link Client}
 */
@Value
public class ClientBasicDto implements Serializable {
    String notes;
    Long id;
    String email;
    String names;
}