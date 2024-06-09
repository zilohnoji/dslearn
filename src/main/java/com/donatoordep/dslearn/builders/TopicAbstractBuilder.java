package com.donatoordep.dslearn.builders;

import com.donatoordep.dslearn.entities.*;

import java.time.Instant;

public interface TopicAbstractBuilder extends Builder<Topic> {

    TopicAbstractBuilder id(Long id);

    TopicAbstractBuilder title(String title);

    TopicAbstractBuilder body(String body);

    TopicAbstractBuilder moment(Instant moment);

    TopicAbstractBuilder author(User author);

    TopicAbstractBuilder offer(Offer offer);

    TopicAbstractBuilder lesson(Lesson lesson);

    TopicAbstractBuilder answer(Reply answer);
}