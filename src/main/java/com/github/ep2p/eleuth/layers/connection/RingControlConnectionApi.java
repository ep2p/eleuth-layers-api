package com.github.ep2p.eleuth.layers.connection;

import com.github.ep2p.eleuth.model.BaseResponse;
import com.github.ep2p.eleuth.model.entity.RingMember;
import com.github.ep2p.eleuth.model.general.RingMemberResponse;

public interface RingControlConnectionApi {
    BaseResponse generateRingKey();
    RingMemberResponse exportRingMembership(boolean partial, int part);
    BaseResponse importRingMembership(RingMember ringMemberEntity);
}
