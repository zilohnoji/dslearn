package com.donatoordep.dslearn.repositories;

import com.donatoordep.dslearn.entities.User;
import com.donatoordep.dslearn.exceptions.ONBUsuarioNaoEncontradoException;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    default User findByIdOrThrowNotFound(Long id){
        return this.findById(id).orElseThrow(ONBUsuarioNaoEncontradoException::new);
    }
}