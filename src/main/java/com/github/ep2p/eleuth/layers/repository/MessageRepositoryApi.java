package com.github.ep2p.eleuth.layers.repository;

import com.github.ep2p.eleuth.model.entity.Message;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

public interface MessageRepositoryApi {
    void save(Message message);
    boolean containsByNode(BigInteger node);
    List<Message> getMessagesForNode(BigInteger node);
    List<Message> getMessagesForNode(BigInteger node, Date after);
    Message getMessage(BigInteger messageId);
    void deleteAllByCreationDateBefore(Date date);
}
