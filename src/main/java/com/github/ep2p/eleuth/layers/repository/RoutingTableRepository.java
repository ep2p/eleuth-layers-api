package com.github.ep2p.eleuth.layers.repository;

import com.github.ep2p.eleuth.model.ConnectionInfo;
import com.github.ep2p.kademlia.table.BigIntegerRoutingTable;

public interface RoutingTableRepository {
    void store(BigIntegerRoutingTable<ConnectionInfo> routingTable);
    BigIntegerRoutingTable<ConnectionInfo> load();
}
