package com.github.ep2p.eleuth.layers.repository;

import com.github.ep2p.eleuth.model.entity.NodeConnection;

import java.math.BigInteger;

public interface NodeConnectionRepositoryApi {
    void save(NodeConnection nodeConnection);
    NodeConnection getNodeConnection(BigInteger nodeId);
    boolean exists(BigInteger nodeId);
    void delete(BigInteger bigInteger);
}
