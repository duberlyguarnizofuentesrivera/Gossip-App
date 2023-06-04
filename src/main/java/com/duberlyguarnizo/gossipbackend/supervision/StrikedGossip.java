package com.duberlyguarnizo.gossipbackend.supervision;

import com.duberlyguarnizo.gossipbackend.auditing.AuditableEntity;
import com.duberlyguarnizo.gossipbackend.enums.StrikeReason;
import jakarta.persistence.*;

@Entity
public class StrikedGossip extends AuditableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    Long gossipId;
    @Enumerated(EnumType.STRING)
    StrikeReason reason;
    boolean strikedByEngine;

}
