package com.exam.noteApp.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Data
public class UsersNotes implements Serializable {

    @Id
    @Column
    private long userId;

    @Id
    @Column
    private long noteId;
}
