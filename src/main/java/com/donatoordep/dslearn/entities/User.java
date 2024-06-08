package com.donatoordep.dslearn.entities;

import com.donatoordep.dslearn.builders.UserAbstractBuilder;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;

    @ManyToMany
    @JoinTable(name = "tb_user_role",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
    private Set<Role> roles = new HashSet<>();

    protected User() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static class UserBuilder implements UserAbstractBuilder {

        private User entity;

        public UserBuilder() {
            this.reset();
        }

        public static UserBuilder builder() {
            return new UserBuilder();
        }

        @Override
        public User build() {
            return this.entity;
        }

        @Override
        public UserAbstractBuilder name(String name) {
            this.entity.setName(name);
            return this;
        }

        @Override
        public UserAbstractBuilder email(String email) {
            this.entity.setEmail(email);
            return this;
        }

        @Override
        public UserAbstractBuilder password(String password) {
            this.entity.setPassword(password);
            return this;
        }

        @Override
        public UserAbstractBuilder id(Long id) {
            this.entity.setId(id);
            return this;
        }

        @Override
        public void reset() {
            this.entity = new User();
        }
    }
}