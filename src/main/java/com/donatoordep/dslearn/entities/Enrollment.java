package com.donatoordep.dslearn.entities;

import com.donatoordep.dslearn.builders.EnrollmentAbstractBuilder;
import com.donatoordep.dslearn.entities.pk.EnrollmentPk;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "tb_enrollment")
public class Enrollment {

    @EmbeddedId
    private EnrollmentPk id;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant enrollMoment;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant refundMoment;
    private boolean available;
    private boolean onlyUpdate;

    protected Enrollment() {
    }

    public static class EnrollmentBuilder implements EnrollmentAbstractBuilder {

        private Enrollment entity;

        private EnrollmentBuilder() {
            this.reset();
        }

        public static EnrollmentBuilder builder() {
            return new EnrollmentBuilder();
        }

        @Override
        public Enrollment build() {
            return this.entity;
        }

        @Override
        public EnrollmentAbstractBuilder student(User student) {
            this.entity.id.setStudent(student);
            return this;
        }

        @Override
        public EnrollmentAbstractBuilder offer(Offer offer) {
            this.entity.id.setOffer(offer);
            return this;
        }

        @Override
        public EnrollmentAbstractBuilder enrollMoment(Instant enrollMoment) {
            this.entity.setEnrollMoment(enrollMoment);
            return this;
        }

        @Override
        public EnrollmentAbstractBuilder refundMoment(Instant refundMoment) {
            this.entity.setRefundMoment(refundMoment);
            return this;
        }

        @Override
        public EnrollmentAbstractBuilder available(boolean available) {
            this.entity.setAvailable(available);
            return this;
        }

        @Override
        public EnrollmentAbstractBuilder onlyUpdate(boolean onlyUpdate) {
            this.entity.setOnlyUpdate(onlyUpdate);
            return this;
        }

        @Override
        public void reset() {
            this.entity = new Enrollment();
        }
    }

    public User getStudent() {
        return id.getStudent();
    }

    public Offer getOffer() {
        return id.getOffer();
    }

    public void setStudent(User student) {
        this.id.setStudent(student);
    }

    public void setOffer(Offer offer) {
        this.id.setOffer(offer);
    }

    public Instant getEnrollMoment() {
        return enrollMoment;
    }

    public void setEnrollMoment(Instant enrollMoment) {
        this.enrollMoment = enrollMoment;
    }

    public Instant getRefundMoment() {
        return refundMoment;
    }

    public void setRefundMoment(Instant refundMoment) {
        this.refundMoment = refundMoment;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isOnlyUpdate() {
        return onlyUpdate;
    }

    public void setOnlyUpdate(boolean onlyUpdate) {
        this.onlyUpdate = onlyUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Enrollment that = (Enrollment) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}