package com.donatoordep.dslearn.entities;

import com.donatoordep.dslearn.builders.DeliverAbstractBuilder;
import com.donatoordep.dslearn.enums.DeliverStatus;
import jakarta.persistence.*;

import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "tb_deliver")
public class Deliver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String uri;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant moment;

    private DeliverStatus status;
    private String feedback;
    private Integer correctCount;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "offer_id"),
            @JoinColumn(name = "user_id")
    })
    private Enrollment enrollment;

    @ManyToOne
    @JoinColumn(name = "lesson_id")
    private Lesson lesson;

    protected Deliver() {
    }

    public static class DeliverBuilder implements DeliverAbstractBuilder {

        private Deliver entity;

        private DeliverBuilder() {
            this.reset();
        }

        public static DeliverBuilder builder() {
            return new DeliverBuilder();
        }

        @Override
        public Deliver build() {
            return this.entity;
        }

        @Override
        public DeliverAbstractBuilder id(Long id) {
            this.entity.setId(id);
            return this;
        }

        @Override
        public DeliverAbstractBuilder uri(String uri) {
            this.entity.setUri(uri);
            return this;
        }

        @Override
        public DeliverAbstractBuilder moment(Instant moment) {
            this.entity.setMoment(moment);
            return this;
        }

        @Override
        public DeliverAbstractBuilder status(DeliverStatus status) {
            this.entity.setStatus(status);
            return this;
        }

        @Override
        public DeliverAbstractBuilder feedback(String feedback) {
            this.entity.setFeedback(feedback);
            return this;
        }

        @Override
        public DeliverAbstractBuilder correctCount(Integer correctCount) {
            this.entity.setCorrectCount(correctCount);
            return this;
        }

        @Override
        public DeliverAbstractBuilder enrollment(Enrollment enrollment) {
            this.entity.setEnrollment(enrollment);
            return this;
        }

        @Override
        public DeliverAbstractBuilder lesson(Lesson lesson) {
            this.entity.setLesson(lesson);
            return this;
        }

        @Override
        public void reset() {
            this.entity = new Deliver();
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public DeliverStatus getStatus() {
        return status;
    }

    public void setStatus(DeliverStatus status) {
        this.status = status;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public Integer getCorrectCount() {
        return correctCount;
    }

    public void setCorrectCount(Integer correctCount) {
        this.correctCount = correctCount;
    }

    public Enrollment getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(Enrollment enrollment) {
        this.enrollment = enrollment;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deliver deliver = (Deliver) o;
        return Objects.equals(id, deliver.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}