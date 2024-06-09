package com.donatoordep.dslearn.entities;

import com.donatoordep.dslearn.builders.NotificationAbstractBuilder;
import jakarta.persistence.*;

import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "tb_notification")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant moment;
    private boolean read;
    private String route;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    protected Notification() {
    }

    public static class NotificationBuilder implements NotificationAbstractBuilder {

        private Notification entity;

        private NotificationBuilder() {
            this.reset();
        }

        public static NotificationBuilder builder() {
            return new NotificationBuilder();
        }

        @Override
        public Notification build() {
            return this.entity;
        }

        @Override
        public NotificationAbstractBuilder id(Long id) {
            this.entity.setId(id);
            return this;
        }

        @Override
        public NotificationAbstractBuilder text(String text) {
            this.entity.setText(text);
            return this;
        }

        @Override
        public NotificationAbstractBuilder moment(Instant moment) {
            this.entity.setMoment(moment);
            return this;
        }

        @Override
        public NotificationAbstractBuilder read(boolean read) {
            this.entity.setRead(read);
            return this;
        }

        @Override
        public NotificationAbstractBuilder route(String route) {
            this.entity.setRoute(route);
            return this;
        }

        @Override
        public NotificationAbstractBuilder user(User user) {
            this.entity.setUser(user);
            return this;
        }

        @Override
        public void reset() {
            this.entity = new Notification();
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notification that = (Notification) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}