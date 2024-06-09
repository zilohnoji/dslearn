package com.donatoordep.dslearn.builders;

import com.donatoordep.dslearn.entities.Notification;
import com.donatoordep.dslearn.entities.User;

import java.time.Instant;

public interface NotificationAbstractBuilder extends Builder<Notification> {

    NotificationAbstractBuilder id(Long id);

    NotificationAbstractBuilder text(String text);

    NotificationAbstractBuilder moment(Instant moment);

    NotificationAbstractBuilder read(boolean read);

    NotificationAbstractBuilder route(String route);

    NotificationAbstractBuilder user(User user);
}