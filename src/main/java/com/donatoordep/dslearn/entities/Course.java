package com.donatoordep.dslearn.entities;

import com.donatoordep.dslearn.builders.CourseAbstractBuilder;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tb_course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(columnDefinition = "TEXT")
    private String imgUri;

    @Column(columnDefinition = "TEXT")
    private String imgGrayUri;

    @OneToMany(mappedBy = "course")
    private List<Offer> offers = new ArrayList<>();

    protected Course() {
    }

    public static class CourseBuilder implements CourseAbstractBuilder {

        private Course entity;

        private CourseBuilder() {
            this.reset();
        }

        public static CourseBuilder builder() {
            return new CourseBuilder();
        }

        @Override
        public Course build() {
            return this.entity;
        }

        @Override
        public CourseAbstractBuilder id(Long id) {
            this.entity.setId(id);
            return this;
        }

        @Override
        public CourseAbstractBuilder name(String name) {
            this.entity.setName(name);
            return this;
        }

        @Override
        public CourseAbstractBuilder imgUri(String imgUri) {
            this.entity.setImgUri(imgUri);
            return this;
        }

        @Override
        public CourseAbstractBuilder imgGrayUri(String imgGrayUri) {
            this.entity.setImgGrayUri(imgGrayUri);
            return this;
        }

        @Override
        public void reset() {
            this.entity = new Course();
        }
    }

    public void addOffer(Offer offer) {
        this.offers.add(offer);
    }

    public List<Offer> getOffers() {
        return offers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgUri() {
        return imgUri;
    }

    public void setImgUri(String imgUri) {
        this.imgUri = imgUri;
    }

    public String getImgGrayUri() {
        return imgGrayUri;
    }

    public void setImgGrayUri(String imgGrayUri) {
        this.imgGrayUri = imgGrayUri;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(id, course.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
