package com.github.ep2p.eleuth.layers.logic;

import com.github.ep2p.eleuth.model.BaseResponse;
import com.github.ep2p.eleuth.model.NodeDto;
import com.github.ep2p.eleuth.model.route.AvailabilityMessage;
import com.github.ep2p.eleuth.model.route.AvailabilityReply;
import com.github.ep2p.eleuth.model.route.DataMessage;

public interface RouteApi {
    BaseResponse onAvailabilityMessage(NodeDto route, AvailabilityMessage availabilityMessage);
    BaseResponse onAvailabilityReply(NodeDto route, AvailabilityReply availabilityReply);
    BaseResponse onDataMessage(NodeDto route, DataMessage dataMessage);
}
