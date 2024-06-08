package com.donatoordep.dslearn.entities;


import com.donatoordep.dslearn.builders.RoleAbstractBuilder;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String authority;

    protected Role() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public static class RoleBuilder implements RoleAbstractBuilder {

        private Role entity;

        private RoleBuilder() {
            this.reset();
        }

        public static RoleBuilder builder() {
            return new RoleBuilder();
        }

        @Override
        public Role build() {
            return this.entity;
        }

        @Override
        public RoleAbstractBuilder id(Long id) {
            this.entity.setId(id);
            return this;
        }

        @Override
        public RoleAbstractBuilder authority(String authority) {
            this.entity.setAuthority(authority);
            return this;
        }

        @Override
        public void reset() {
            this.entity = new Role();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return Objects.equals(id, role.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}