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

        public static <Q,B> RequestBuilder<Q,B> endpoint(Endpoint endpoint){
            return Request.<Q,B>builder()
                    .address(endpoint.address)
                    .method(endpoint.method);
        }
    }

    enum Method {
        GET, POST, FETCH, PUT, PATCH, DELETE
    }

    @Getter
    enum Endpoint {
        RING_PING("/ring/ping", Method.PUT),
        RING_SHUTDOWN_SIG("/ring/shutdown-signal", Method.POST),
        RING_FIND("/ring/find", Method.POST),
        RING_STORE("/ring/store", Method.POST),
        RING_GET("/ring/get", Method.POST),
        RING_GET_RESULT("/ring/get/result", Method.POST),
        RING_STORE_RESULT("/ring/store/result", Method.POST),

        ROUTE_REQ_AV("/route/request/availability", Method.POST)
        ;
        private final String address;
        private final Method method;

        Endpoint(String address, Method method) {
            this.address = address;
            this.method = method;
        }
    }
}
