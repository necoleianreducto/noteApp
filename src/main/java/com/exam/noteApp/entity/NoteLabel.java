package com.exam.noteApp.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class NoteLabel implements Serializable {

    @Id
    @Column
    private long noteId;

    @Id
    @Column
    private long labelId;
}
