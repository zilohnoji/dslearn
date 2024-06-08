package com.donatoordep.dslearn.entities;

import com.donatoordep.dslearn.builders.SectionAbstractBuilder;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_section")
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    private Integer position;

    @Column(columnDefinition = "TEXT")
    private String imgUri;

    @ManyToOne
    @JoinColumn(name = "resource_id")
    private Resource resource;

    @ManyToOne
    @JoinColumn(name = "prerequisite_id")
    private Section prerequisite;

    protected Section() {
    }

    public static class SectionBuilder implements SectionAbstractBuilder {

        private Section entity;

        private SectionBuilder() {
            this.reset();
        }

        public static SectionBuilder builder() {
            return new SectionBuilder();
        }

        @Override
        public Section build() {
            return this.entity;
        }

        @Override
        public SectionAbstractBuilder id(Long id) {
            this.entity.setId(id);
            return this;
        }

        @Override
        public SectionAbstractBuilder title(String title) {
            this.entity.setTitle(title);
            return this;
        }

        @Override
        public SectionAbstractBuilder description(String description) {
            this.entity.setDescription(description);
            return this;
        }

        @Override
        public SectionAbstractBuilder position(Integer position) {
            this.entity.setPosition(position);
            return this;
        }

        @Override
        public SectionAbstractBuilder resource(Resource resource) {
            this.entity.setResource(resource);
            return this;
        }

        @Override
        public SectionAbstractBuilder prerequisite(Section prerequisite) {
            this.entity.setPreRequisite(prerequisite);
            return this;
        }

        @Override
        public void reset() {
            this.entity = new Section();
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getImgUri() {
        return imgUri;
    }

    public void setImgUri(String imgUri) {
        this.imgUri = imgUri;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public Section getPreRequisite() {
        return prerequisite;
    }

    public void setPreRequisite(Section preRequisite) {
        this.prerequisite = preRequisite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Section section = (Section) o;
        return Objects.equals(id, section.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}