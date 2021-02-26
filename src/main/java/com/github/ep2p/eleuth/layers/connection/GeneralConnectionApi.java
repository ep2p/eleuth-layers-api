package com.github.ep2p.eleuth.layers.connection;


import com.github.ep2p.eleuth.model.BaseResponse;
import com.github.ep2p.eleuth.model.general.NodeInformationDto;

public interface GeneralConnectionApi {
    NodeInformationDto getNodeInformation();
    BaseResponse addNodeInformation(NodeInformationDto nodeInformationDto);
}
