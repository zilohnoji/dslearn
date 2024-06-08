package com.donatoordep.dslearn.builders;

import com.donatoordep.dslearn.entities.Offer;
import com.donatoordep.dslearn.entities.User;
import com.donatoordep.dslearn.entities.pk.EnrollmentPk;

public interface EnrollmentPkAbstractBuilder extends Builder<EnrollmentPk> {

    EnrollmentPkAbstractBuilder user(User user);

    EnrollmentPkAbstractBuilder offer(Offer offer);
}