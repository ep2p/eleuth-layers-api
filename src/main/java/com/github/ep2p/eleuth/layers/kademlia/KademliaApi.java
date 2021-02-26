package com.github.ep2p.eleuth.layers.kademlia;

import com.github.ep2p.eleuth.model.kad.*;

public interface KademliaApi {
    PingResponse onPing(BasicRequest basicRequest);
    BasicResponse store(StoreRequest storeRequest);
    BasicResponse onShutdownSignal(BasicRequest basicRequest);
    FindNodeResponse findNode(FindNodeRequest findNodeRequest);
    BasicResponse get(GetRequest getRequest);
    BasicResponse onGetResult(GetResultRequest getResultRequest);
    BasicResponse onStoreResult(StoreResultRequest storeResultRequest);
}
