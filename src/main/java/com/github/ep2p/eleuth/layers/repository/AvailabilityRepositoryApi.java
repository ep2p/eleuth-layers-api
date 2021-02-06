package com.github.ep2p.eleuth.layers.repository;

import com.github.ep2p.eleuth.model.entity.Availability;

import java.math.BigInteger;

public interface AvailabilityRepositoryApi {
    void available(Availability availability);
    Availability getAvailableRoutes(BigInteger nodeId);
    boolean contains(BigInteger nodeId);
}
