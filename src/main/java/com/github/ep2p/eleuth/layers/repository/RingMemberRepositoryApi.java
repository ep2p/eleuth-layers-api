package com.github.ep2p.eleuth.layers.repository;

import com.github.ep2p.eleuth.model.entity.RingMember;

public interface RingMemberRepositoryApi {
    void save(RingMember ringMember);
    RingMember get();
}
