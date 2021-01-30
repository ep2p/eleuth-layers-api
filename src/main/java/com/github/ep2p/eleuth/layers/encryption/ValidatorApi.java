package com.github.ep2p.eleuth.layers.encryption;

import com.github.ep2p.eleuth.model.NodeDto;
import com.github.ep2p.eleuth.model.RingMemberProofDto;
import com.github.ep2p.eleuth.model.SignedData;

import java.math.BigInteger;
import java.security.PublicKey;

public interface ValidatorApi {
    boolean isValidId(BigInteger nodeId, String publicKey);
    boolean isValidId(BigInteger nodeId, PublicKey publicKey);
    boolean isValidNode(SignedData<NodeDto> signedNodeDto);
    boolean isValidRing(SignedData<NodeDto> signedNodeDto, SignedData<RingMemberProofDto> ringMemberProofDtoSignedData);
}
