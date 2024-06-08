package com.donatoordep.dslearn.builders;

import com.donatoordep.dslearn.entities.Enrollment;
import com.donatoordep.dslearn.entities.Offer;
import com.donatoordep.dslearn.entities.User;

import java.time.Instant;

public interface EnrollmentAbstractBuilder extends Builder<Enrollment> {

    EnrollmentAbstractBuilder student(User user);

    EnrollmentAbstractBuilder offer(Offer offer);

    EnrollmentAbstractBuilder enrollMoment(Instant enrollMoment);

    EnrollmentAbstractBuilder refundMoment(Instant refundMoment);

    EnrollmentAbstractBuilder available(boolean available);

    EnrollmentAbstractBuilder onlyUpdate(boolean onlyUpdate);
}