package com.github.ep2p.eleuth.layers.encryption;

import com.github.ep2p.eleuth.model.NodeDto;
import com.github.ep2p.eleuth.model.NodeType;
import com.github.ep2p.eleuth.model.RingMemberProofDto;
import com.github.ep2p.eleuth.model.SignedData;

public interface ValidatorApi {
    boolean isValidNode(SignedData<NodeDto> signedNodeDto);
    boolean isValidRing(SignedData<NodeDto> signedNodeDto, SignedData<RingMemberProofDto> ringMemberProofDtoSignedData);
}
