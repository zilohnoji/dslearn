package com.donatoordep.dslearn.entities;

import com.donatoordep.dslearn.builders.ReplyAbstractBuilder;
import jakarta.persistence.*;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_reply")
public class Reply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String body;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant moment;

    @ManyToOne
    @JoinColumn(name = "topic_id")
    private Topic topic;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;

    @ManyToMany
    @JoinTable(name = "tb_reply_likes",
            joinColumns = @JoinColumn(name = "reply_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private Set<User> likes = new HashSet<>();

    protected Reply() {
    }

    public static class ReplyBuilder implements ReplyAbstractBuilder {

        private Reply entity;

        private ReplyBuilder() {
            this.reset();
        }

        public static ReplyBuilder builder() {
            return new ReplyBuilder();
        }

        @Override
        public Reply build() {
            return this.entity;
        }

        @Override
        public ReplyAbstractBuilder id(Long id) {
            this.entity.setId(id);
            return this;
        }

        @Override
        public ReplyAbstractBuilder body(String body) {
            this.entity.setBody(body);
            return this;
        }

        @Override
        public ReplyAbstractBuilder moment(Instant moment) {
            this.entity.setMoment(moment);
            return this;
        }

        @Override
        public ReplyAbstractBuilder topic(Topic topic) {
            this.entity.setTopic(topic);
            return this;
        }

        @Override
        public ReplyAbstractBuilder author(User author) {

            this.entity.setAuthor(author);
            return this;
        }

        @Override
        public void reset() {
            this.entity = new Reply();
        }
    }

    public Set<User> getLikes() {
        return likes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}
