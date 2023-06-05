package com.duberlyguarnizo.gossipbackend.gossip;

import com.duberlyguarnizo.gossipbackend.exceptions.NonExistentEntityException;
import com.duberlyguarnizo.gossipbackend.gossip.dto.GossipDetailDto;
import com.duberlyguarnizo.gossipbackend.gossip.dto.GossipMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GossipService {
    private final GossipRepository repository;
    private final GossipMapper mapper;

    public GossipService(GossipRepository repository, GossipMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public GossipDetailDto getGossipById(Long id) throws IllegalArgumentException {
        if (id == null) {
            throw new IllegalArgumentException("The id cannot be null");
        } else {
            Optional<Gossip> gossip = repository.findById(id);
            if (gossip.isPresent()) {
                return mapper.toDetailDto(gossip.get());
            } else {
                throw new NonExistentEntityException("No gossip with id " + id + " found.");
            }
        }
    }
}
