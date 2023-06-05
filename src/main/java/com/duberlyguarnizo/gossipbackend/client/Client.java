package com.duberlyguarnizo.gossipbackend.client;

import com.duberlyguarnizo.gossipbackend.auditing.AuditableEntity;
import com.duberlyguarnizo.gossipbackend.gossip.Gossip;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Client extends AuditableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String email;
    String names;

    Long locationId;
    @OneToMany
    Set<Gossip> gossipsId;

    /**
     * Indicates whether the client has the ability to <b>create gossips</b>.
     * If false, it means that a supervisor or an automatic system has
     * deactivated it because of strikes.
     */
    boolean active;
    int strikes;
}
