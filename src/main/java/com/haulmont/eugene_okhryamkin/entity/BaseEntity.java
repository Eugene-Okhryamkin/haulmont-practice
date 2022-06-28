package com.haulmont.eugene_okhryamkin.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

@MappedSuperclass
public class BaseEntity {

    @JmixGeneratedValue
    @Column(name="ID", nullable = false)
    @Id
    protected UUID id;

}
