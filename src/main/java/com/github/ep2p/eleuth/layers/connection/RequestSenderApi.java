package com.github.ep2p.eleuth.layers.connection;


import com.github.ep2p.eleuth.model.ConnectionInfo;
import com.github.ep2p.eleuth.model.NodeDto;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;
import java.util.Map;

public interface RequestSenderApi {
    <Q, B, RB> void sendRequest(BigInteger nodeId, Request<Q, B> request, ResponseListener<RB> responseListener, Class<RB> rbClass);
    <Q, B, RB> void sendRequest(BigInteger nodeId, ConnectionInfo connectionInfo, Request<Q, B> request, ResponseListener<RB> responseListener, Class<RB> rbClass);
    <Q, B, RB> void sendRequest(NodeDto nodeDto, Request<Q, B> request, ResponseListener<RB> responseListener, Class<RB> rbClass);

    interface ResponseListener<RB> {
        void onResponse(Response<RB> response);
        void onError(Throwable throwable);
    }

    @Getter
    @Setter
    @Builder
    class Response<RB>{
        private RB body;
        private int status;
        private Map<String, String> headers;
    }

    @Getter
    @Setter
    @Builder
    class Request<Q, B> {
        private Method method;
        private String address;
        private Q query;
        private B body;
        private Map<String, String> headers;
    }

    enum Method {
        GET, POST, FETCH, PUT, PATCH, DELETE
    }
}
