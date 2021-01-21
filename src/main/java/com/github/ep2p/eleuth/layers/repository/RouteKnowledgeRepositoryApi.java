package com.github.ep2p.eleuth.layers.repository;

import com.github.ep2p.eleuth.model.entity.RouteKnowledge;

import java.math.BigInteger;

public interface RouteKnowledgeRepositoryApi {
    void add(RouteKnowledge routeKnowledge);
    RouteKnowledge getKnowledge(BigInteger nodeId);
    void unlink(BigInteger nodeId, BigInteger routeId);
}
