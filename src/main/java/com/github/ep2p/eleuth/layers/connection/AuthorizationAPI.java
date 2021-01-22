package com.github.ep2p.eleuth.layers.connection;

import com.github.ep2p.eleuth.model.Authorization;
import com.github.ep2p.eleuth.model.AuthorizationResponse;

public interface AuthorizationAPI {
    AuthorizationResponse authorize(Authorization authorization);
}
