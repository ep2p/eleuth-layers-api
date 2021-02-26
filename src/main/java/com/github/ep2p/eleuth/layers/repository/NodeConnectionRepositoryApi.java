package com.github.ep2p.eleuth.layers.repository;

import com.github.ep2p.eleuth.model.entity.NodeConnection;

import java.math.BigInteger;
import java.util.List;

public interface NodeConnectionRepositoryApi {
    void save(NodeConnection nodeConnection);
    NodeConnection getNodeConnection(BigInteger nodeId);
    boolean exists(BigInteger nodeId);
    void delete(BigInteger bigInteger);
    List<NodeConnection> findAllByRing(String ringKey);
}
