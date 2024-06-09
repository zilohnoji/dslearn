package com.donatoordep.dslearn.builders;

import com.donatoordep.dslearn.entities.Deliver;
import com.donatoordep.dslearn.entities.Enrollment;
import com.donatoordep.dslearn.entities.Lesson;
import com.donatoordep.dslearn.enums.DeliverStatus;

import java.time.Instant;

public interface DeliverAbstractBuilder extends Builder<Deliver> {

    DeliverAbstractBuilder id(Long id);

    DeliverAbstractBuilder uri(String uri);

    DeliverAbstractBuilder moment(Instant moment);

    DeliverAbstractBuilder status(DeliverStatus status);

    DeliverAbstractBuilder feedback(String feedback);

    DeliverAbstractBuilder correctCount(Integer correctCount);

    DeliverAbstractBuilder enrollment(Enrollment enrollment);

    DeliverAbstractBuilder lesson(Lesson lesson);
}