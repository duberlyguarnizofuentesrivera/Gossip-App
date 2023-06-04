package com.duberlyguarnizo.gossipbackend.gossip;

import ch.qos.logback.core.net.server.Client;
import com.duberlyguarnizo.gossipbackend.auditing.AuditableEntity;
import com.duberlyguarnizo.gossipbackend.location.Location;
import jakarta.persistence.*;

@Entity
public class Gossip extends AuditableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
