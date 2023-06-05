package com.duberlyguarnizo.gossipbackend.location.dto;

import com.duberlyguarnizo.gossipbackend.enums.LocationType;
import com.duberlyguarnizo.gossipbackend.location.Location;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link Location}
 */
@Value
public class LocationDetailDto implements Serializable {
    Long id;
    String country;
    String state;
    String county;
    String city;
    LocationType type;
}