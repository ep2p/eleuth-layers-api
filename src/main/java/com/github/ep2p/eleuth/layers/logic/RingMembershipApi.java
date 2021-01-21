package com.github.ep2p.eleuth.layers.logic;

import com.github.ep2p.eleuth.model.entity.RingMember;

//generates, imports and exports partial keys for ring
public interface RingMembershipApi {
    void importMembership(RingMember ringMember);
    RingMember exportPart(int p);
    RingMember exportFullMembership();
    void generate();
}
