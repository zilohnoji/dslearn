package com.donatoordep.dslearn.builders;

import com.donatoordep.dslearn.entities.User;

public interface UserAbstractBuilder extends Builder<User> {

    UserAbstractBuilder name(String name);
    UserAbstractBuilder email(String email);
    UserAbstractBuilder password(String password);
    UserAbstractBuilder id(Long id);
}