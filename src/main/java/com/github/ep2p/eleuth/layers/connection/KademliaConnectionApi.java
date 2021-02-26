package com.github.ep2p.eleuth.layers.connection;

import com.github.ep2p.eleuth.model.kad.*;

//used for kademlia API in ring nodes
public interface KademliaConnectionApi {
    PingResponse onPing(BasicRequest basicRequest);
    BasicResponse onShutdownSignal(BasicRequest basicRequest);
    FindNodeResponse findNode(FindNodeRequest findNodeRequest);
    BasicResponse store(StoreRequest storeRequest);
    BasicResponse get(GetRequest getRequest);
    BasicResponse onGetResult(GetResultRequest getResultRequest);
    BasicResponse onStoreResult(StoreResultRequest storeResultRequest);
}
