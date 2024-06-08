package com.donatoordep.dslearn.entities;

import com.donatoordep.dslearn.builders.ResourceAbstractBuilder;
import com.donatoordep.dslearn.enums.ResourceType;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_resource")
public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    private String position;

    @Column(columnDefinition = "TEXT")
    private String imgUri;

    @Enumerated(EnumType.STRING)
    private ResourceType type;

    @ManyToOne
    @JoinColumn(name = "offer_id")
    private Offer offer;

    protected Resource() {
    }

    public static class ResourceBuilder implements ResourceAbstractBuilder {

        private Resource entity;

        private ResourceBuilder() {
            this.reset();
        }

        public static ResourceBuilder builder() {
            return new ResourceBuilder();
        }

        @Override
        public Resource build() {
            return this.entity;
        }

        @Override
        public ResourceAbstractBuilder id(Long id) {
            this.entity.setId(id);
            return this;
        }

        @Override
        public ResourceAbstractBuilder title(String title) {
            this.entity.setTitle(title);
            return this;
        }

        @Override
        public ResourceAbstractBuilder description(String description) {
            this.entity.setDescription(description);
            return this;
        }

        @Override
        public ResourceAbstractBuilder position(String position) {
            this.entity.setPosition(position);
            return this;
        }

        @Override
        public ResourceAbstractBuilder imgUri(String imgUri) {
            this.entity.setImgUri(imgUri);
            return this;
        }

        @Override
        public ResourceAbstractBuilder type(ResourceType type) {
            this.entity.setType(type);
            return this;
        }

        @Override
        public ResourceAbstractBuilder offer(Offer offer) {
            this.entity.setOffer(offer);
            return this;
        }

        @Override
        public void reset() {
            this.entity = new Resource();
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getImgUri() {
        return imgUri;
    }

    public void setImgUri(String imgUri) {
        this.imgUri = imgUri;
    }

    public ResourceType getType() {
        return type;
    }

    public void setType(ResourceType type) {
        this.type = type;
    }

    public Offer getOffer() {
        return offer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resource resource = (Resource) o;
        return Objects.equals(id, resource.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }
}