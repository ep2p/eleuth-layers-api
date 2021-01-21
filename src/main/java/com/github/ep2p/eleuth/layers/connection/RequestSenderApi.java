package com.github.ep2p.eleuth.layers.connection;


import com.github.ep2p.eleuth.model.ConnectionInfo;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public interface RequestSenderApi {
    <Q, B, RB> void sendRequest(BigInteger nodeId, ConnectionInfo connectionInfo, Request<Q, B> request, ResponseListener<RB> responseListener, Class<RB> rbClass);

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
        @Builder.Default
        private Map<String, String> headers = new HashMap<>();
    }

    @Getter
    @Setter
    @Builder
    class Request<Q, B> {
        private Method method;
        private String address;
        private Q query;
        private B body;
        @Builder.Default
        private Map<String, String> headers = new HashMap<>();
    }

    enum Method {
        GET, POST, FETCH, PUT, PATCH, DELETE
    }
}
