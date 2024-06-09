package com.donatoordep.dslearn.builders;

import com.donatoordep.dslearn.entities.Reply;
import com.donatoordep.dslearn.entities.Topic;
import com.donatoordep.dslearn.entities.User;

import java.time.Instant;

public interface ReplyAbstractBuilder extends Builder<Reply> {

    ReplyAbstractBuilder id(Long id);

    ReplyAbstractBuilder body(String body);

    ReplyAbstractBuilder moment(Instant moment);

    ReplyAbstractBuilder topic(Topic topic);

    ReplyAbstractBuilder author(User author);
}