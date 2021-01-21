package com.github.ep2p.eleuth.layers.logic;

import com.github.ep2p.eleuth.model.BaseResponse;
import com.github.ep2p.eleuth.model.general.NodeInformationDto;

public interface GeneralApi {
    NodeInformationDto getNodeInformation();
    BaseResponse addNodeInformation(NodeInformationDto nodeInformationDto);
}
