package com.duberlyguarnizo.gossipbackend.location;

import com.duberlyguarnizo.gossipbackend.enums.LocationType;
import jakarta.persistence.*;

@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String country;
    String state;
    String county;
    String city;
    @Enumerated(EnumType.STRING)
    LocationType type;
}
