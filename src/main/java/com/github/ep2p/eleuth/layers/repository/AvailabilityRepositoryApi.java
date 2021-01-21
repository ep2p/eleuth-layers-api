package com.github.ep2p.eleuth.layers.repository;

import java.math.BigInteger;
import java.util.List;

public interface AvailabilityRepositoryApi {
    void available(BigInteger nodeId, List<BigInteger> routeId);
}
