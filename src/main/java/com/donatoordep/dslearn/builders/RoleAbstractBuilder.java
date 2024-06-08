package com.donatoordep.dslearn.builders;

import com.donatoordep.dslearn.entities.Role;

public interface RoleAbstractBuilder extends Builder<Role> {

    RoleAbstractBuilder id(Long id);
    RoleAbstractBuilder authority(String authority);
}