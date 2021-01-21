package com.github.ep2p.eleuth.layers.connection;

import com.github.ep2p.eleuth.model.BaseResponse;
import com.github.ep2p.eleuth.model.route.AvailabilityMessage;
import com.github.ep2p.eleuth.model.route.AvailabilityReply;
import com.github.ep2p.eleuth.model.route.DataMessage;

public interface RouteConnectionApi {
    BaseResponse available(AvailabilityMessage availabilityMessage);
    BaseResponse availableReply(AvailabilityReply availabilityReply);
    BaseResponse data(DataMessage dataMessage);
}
