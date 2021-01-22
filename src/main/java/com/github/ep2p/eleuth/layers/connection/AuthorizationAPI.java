package com.github.ep2p.eleuth.layers.connection;

import com.github.ep2p.eleuth.model.Authorization;
import com.github.ep2p.eleuth.model.BaseResponse;

public interface AuthorizationAPI {
    BaseResponse authorize(Authorization authorization);
}
