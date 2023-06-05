package com.duberlyguarnizo.gossipbackend.supervision.repository;

import com.duberlyguarnizo.gossipbackend.supervision.models.StrikedGossip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StrikedGossipRepository extends JpaRepository<StrikedGossip, Long> {
}
