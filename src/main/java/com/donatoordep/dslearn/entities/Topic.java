package com.donatoordep.dslearn.entities;

import com.donatoordep.dslearn.builders.TopicAbstractBuilder;
import jakarta.persistence.*;

import java.time.Instant;
import java.util.*;

@Entity
@Table(name = "tb_topic")
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    @Column(columnDefinition = "TEXT")
    private String body;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant moment;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;

    @ManyToOne
    @JoinColumn(name = "offer_id")
    private Offer offer;

    @ManyToOne
    @JoinColumn(name = "lesson_id")
    private Lesson lesson;

    @ManyToOne
    @JoinColumn(name = "reply_id")
    private Reply answer;

    @ManyToMany
    @JoinTable(name = "tb_topic_likes",
            joinColumns = @JoinColumn(name = "topic_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private Set<User> likes = new HashSet<>();

    @OneToMany(mappedBy = "topic")
    private List<Reply> replies = new ArrayList<>();

    protected Topic() {
    }

    public static class TopicBuilder implements TopicAbstractBuilder {

        private Topic entity;

        private TopicBuilder() {
            this.reset();
        }

        public static TopicBuilder builder() {
            return new TopicBuilder();
        }

        @Override
        public Topic build() {
            return this.entity;
        }

        @Override
        public TopicAbstractBuilder id(Long id) {
            this.entity.setId(id);
            return this;
        }

        @Override
        public TopicAbstractBuilder title(String title) {
            this.entity.setTitle(title);
            return this;
        }

        @Override
        public TopicAbstractBuilder body(String body) {
            this.entity.setBody(body);
            return this;
        }

        @Override
        public TopicAbstractBuilder moment(Instant moment) {
            this.entity.setMoment(moment);
            return this;
        }

        @Override
        public TopicAbstractBuilder author(User author) {
            this.entity.setAuthor(author);
            return this;
        }

        @Override
        public TopicAbstractBuilder offer(Offer offer) {
            this.entity.setOffer(offer);
            return this;
        }

        @Override
        public TopicAbstractBuilder lesson(Lesson lesson) {
            this.entity.setLesson(lesson);
            return this;
        }

        @Override
        public TopicAbstractBuilder answer(Reply answer) {
            this.entity.setAnswer(answer);
            return this;
        }

        @Override
        public void reset() {
            this.entity = new Topic();
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

    public void setAnswer(Reply answer) {
        this.answer = answer;
    }

    public Reply getAnswer() {
        return answer;
    }

    public List<Reply> getReplies() {
        return replies;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
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
        Topic topic = (Topic) o;
        return Objects.equals(id, topic.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}