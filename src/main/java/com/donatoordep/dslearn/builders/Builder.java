package com.donatoordep.dslearn.builders;

public interface Builder<E> {

    E build();

    void reset();
}