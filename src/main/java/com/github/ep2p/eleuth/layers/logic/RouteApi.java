package com.github.ep2p.eleuth.layers.logic;

import com.github.ep2p.eleuth.model.BaseResponse;
import com.github.ep2p.eleuth.model.route.AvailabilityMessage;
import com.github.ep2p.eleuth.model.route.AvailabilityReply;
import com.github.ep2p.eleuth.model.route.DataMessage;

import java.math.BigInteger;

public interface RouteApi {
    BaseResponse onAvailabilityMessage(BigInteger route, AvailabilityMessage availabilityMessage);
    BaseResponse onAvailabilityReply(BigInteger route, AvailabilityReply availabilityReply);
    BaseResponse onDataMessage(BigInteger route, DataMessage dataMessage);
}
