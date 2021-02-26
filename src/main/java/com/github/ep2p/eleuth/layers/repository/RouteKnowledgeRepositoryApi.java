package com.github.ep2p.eleuth.layers.repository;

import com.github.ep2p.eleuth.model.entity.RouteKnowledge;

import java.math.BigInteger;
import java.util.Optional;

public interface RouteKnowledgeRepositoryApi {
    void add(RouteKnowledge routeKnowledge);
    Optional<RouteKnowledge> getKnowledge(BigInteger nodeId);
    void unlink(BigInteger nodeId, BigInteger routeId);
}
