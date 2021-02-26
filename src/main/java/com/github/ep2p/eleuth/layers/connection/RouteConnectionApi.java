package com.github.ep2p.eleuth.layers.connection;

import com.github.ep2p.eleuth.model.route.AvailabilityMessage;
import com.github.ep2p.eleuth.model.route.AvailabilityReply;
import com.github.ep2p.eleuth.model.route.DataMessage;
import com.github.ep2p.eleuth.model.route.DataReply;

public interface RouteConnectionApi {
    AvailabilityReply available(AvailabilityMessage availabilityMessage);
    DataReply data(DataMessage dataMessage);
}
