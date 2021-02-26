package com.github.ep2p.eleuth.layers.encryption;

import com.github.ep2p.eleuth.model.NodeDto;
import com.github.ep2p.eleuth.model.RingMemberProofDto;
import com.github.ep2p.eleuth.model.SignedData;

public interface SignedDataProviderApi {
    SignedData<NodeDto> getNodeDtoWithPublicKey();
    SignedData<NodeDto> getNodeDtoWithCertificate();
    SignedData<RingMemberProofDto> getRingProof();
}
