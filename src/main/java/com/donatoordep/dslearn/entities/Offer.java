package com.donatoordep.dslearn.entities;

import com.donatoordep.dslearn.builders.OfferAbstractBuilder;
import jakarta.persistence.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tb_offer")
public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String edition;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant startMoment;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant endMoment;

    @OneToMany(mappedBy = "offer")
    private List<Topic> topics = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @OneToMany(mappedBy = "offer")
    private List<Resource> resources = new ArrayList<>();

    protected Offer() {
    }

    public static class OfferBuilder implements OfferAbstractBuilder {
        private Offer entity;

        private OfferBuilder() {
            this.reset();
        }

        public static OfferBuilder builder() {
            return new OfferBuilder();
        }

        @Override
        public Offer build() {
            return this.entity;
        }

        @Override
        public OfferAbstractBuilder id(Long id) {
            this.entity.setId(id);
            return this;
        }

        @Override
        public OfferAbstractBuilder edition(String edition) {
            this.entity.setEdition(edition);
            return this;
        }

        @Override
        public OfferAbstractBuilder startMoment(Instant startMoment) {
            this.entity.setStartMoment(startMoment);
            return this;
        }

        @Override
        public OfferAbstractBuilder endMoment(Instant endMoment) {
            this.entity.setEndMoment(endMoment);
            return this;
        }

        @Override
        public void reset() {
            this.entity = new Offer();
        }
    }

    public List<Resource> getResources() {
        return resources;
    }

    public void addResource(Resource resource) {
        this.resources.add(resource);
    }

    public Long getId() {
        return id;
    }

    public List<Topic> getTopics() {
        return topics;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public Instant getStartMoment() {
        return startMoment;
    }

    public void setStartMoment(Instant startMoment) {
        this.startMoment = startMoment;
    }

    public Instant getEndMoment() {
        return endMoment;
    }

    public void setEndMoment(Instant endMoment) {
        this.endMoment = endMoment;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Offer offer = (Offer) o;
        return Objects.equals(id, offer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
