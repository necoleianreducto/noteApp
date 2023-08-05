package com.exam.noteApp.links;

import org.springframework.stereotype.Component;

@Component
public class NoteLinks {

    public static final String CREATE_NOTE = "/createNote";
    public static final String EDIT_NOTE = "/editNote";
    public static final String DELETE_NOTE = "/deleteNote";
    public static final String GET_NOTES = "/getNotes";
    public static final String FILTER_NOTES = "/filterNotes";

}
