package com.duberlyguarnizo.gossipbackend.supervision.repository;

import com.duberlyguarnizo.gossipbackend.supervision.models.DeletedGossip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeletedGossipRepository extends JpaRepository<DeletedGossip, Long> {
}
