package com.donatoordep.dslearn.entities;

import com.donatoordep.dslearn.builders.ContentAbstractBuilder;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_content")
public class Content extends Lesson {

    private String textContent;
    private String videoUri;

    protected Content() {
    }

    public static class ContentBuilder implements ContentAbstractBuilder {
        private Content entity;

        private ContentBuilder() {
            this.reset();
        }

        @Override
        public Content build() {
            return this.entity;
        }

        public static ContentBuilder builder() {
            return new ContentBuilder();
        }

        @Override
        public ContentAbstractBuilder id(Long id) {
            this.entity.setId(id);
            return this;
        }

        @Override
        public ContentAbstractBuilder textContent(String textContent) {
            this.entity.setTextContent(textContent);
            return this;
        }

        @Override
        public ContentAbstractBuilder videoUri(String videoUri) {
            this.entity.setVideoUri(videoUri);
            return this;
        }

        @Override
        public ContentAbstractBuilder lessonTitle(String title) {
            this.entity.setTitle(title);
            return this;
        }

        @Override
        public ContentAbstractBuilder lessonPosition(Integer position) {
            this.entity.setPosition(position);
            return this;
        }

        @Override
        public ContentAbstractBuilder lessonSection(Section section) {
            this.entity.setSection(section);
            return this;
        }

        @Override
        public void reset() {
            this.entity = new Content();
        }
    }

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    public String getVideoUri() {
        return videoUri;
    }

    public void setVideoUri(String videoUri) {
        this.videoUri = videoUri;
    }
}