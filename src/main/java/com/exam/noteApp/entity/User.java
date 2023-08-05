package com.exam.noteApp.entity;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class User {

    @Id
    @Column
    private long id;

    @Column
    @NotNull(message="{NotNull.User.name}")
    private String name;

    @Column
    @NotNull(message="{NotNull.User.sureName}")
    private String sureName;
}
