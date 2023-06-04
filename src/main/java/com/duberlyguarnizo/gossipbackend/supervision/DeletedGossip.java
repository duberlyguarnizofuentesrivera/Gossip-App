package com.duberlyguarnizo.gossipbackend.supervision;

import com.duberlyguarnizo.gossipbackend.auditing.AuditableEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DeletedGossip extends AuditableEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    Long gossipId;
    boolean deletedByEngine;
}
