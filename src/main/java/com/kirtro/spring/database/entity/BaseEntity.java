package com.kirtro.spring.database.entity;

import java.io.Serializable;

public interface BaseEntity <T extends Serializable> {
    public T getId();
    public void setId(T id);
}
