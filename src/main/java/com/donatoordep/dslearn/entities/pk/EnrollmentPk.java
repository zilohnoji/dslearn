package com.donatoordep.dslearn.entities.pk;

import com.donatoordep.dslearn.builders.EnrollmentPkAbstractBuilder;
import com.donatoordep.dslearn.entities.Offer;
import com.donatoordep.dslearn.entities.User;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class EnrollmentPk {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User student;

    @ManyToOne
    @JoinColumn(name = "offer_id")
    private Offer offer;

    protected EnrollmentPk() {

    }

    public static class EnrollmentPkBuilder implements EnrollmentPkAbstractBuilder {

        private EnrollmentPk entity;

        private EnrollmentPkBuilder() {
            this.reset();
        }

        public static EnrollmentPkBuilder builder() {
            return new EnrollmentPkBuilder();
        }

        @Override
        public EnrollmentPk build() {
            return this.entity;
        }

        @Override
        public EnrollmentPkAbstractBuilder user(User user) {
            this.entity.setStudent(user);
            return this;
        }

        @Override
        public EnrollmentPkAbstractBuilder offer(Offer offer) {
            this.entity.setOffer(offer);
            return this;
        }

        @Override
        public void reset() {
            this.entity = new EnrollmentPk();
        }
    }

    public User getStudent() {
        return student;
    }

    public Offer getOffer() {
        return offer;
    }

    public void setStudent(User student) {
        this.student = student;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnrollmentPk that = (EnrollmentPk) o;
        return Objects.equals(student, that.student) && Objects.equals(offer, that.offer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student, offer);
    }
}