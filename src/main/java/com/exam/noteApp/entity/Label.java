package com.exam.noteApp.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class Label {

    @Id
    @Column
    private long labelId;


    @Column
    @NotNull(message = "{NotNull.Label.name}")
    private String name;
}
