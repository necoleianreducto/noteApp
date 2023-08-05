package com.exam.noteApp.service;

import lombok.Data;

@Data
public class SaveNotes {

    private String name;
    private String surname;
    private String title;
    private String content;
    private String label;
}
