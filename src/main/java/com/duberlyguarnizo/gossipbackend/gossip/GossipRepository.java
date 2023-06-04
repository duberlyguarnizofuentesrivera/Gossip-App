package com.duberlyguarnizo.gossipbackend.gossip;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GossipRepository extends JpaRepository<Gossip, Long> {

}
