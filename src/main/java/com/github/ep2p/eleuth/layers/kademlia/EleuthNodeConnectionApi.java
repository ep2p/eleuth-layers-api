package com.github.ep2p.eleuth.layers.kademlia;

import com.github.ep2p.eleuth.model.ConnectionInfo;
import com.github.ep2p.kademlia.connection.NodeConnectionApi;

import java.math.BigInteger;

public interface EleuthNodeConnectionApi extends NodeConnectionApi<BigInteger, ConnectionInfo> {
}
