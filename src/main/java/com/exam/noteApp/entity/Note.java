package com.exam.noteApp.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class Note {

    @Id
    @Column
    private long noteId;

    @Column
    @NotNull(message = "{NotNull.Note.title}")
    private String title;

    @Column
    @NotNull(message = "{NotNull.Note.content}")
    private String content;

}
