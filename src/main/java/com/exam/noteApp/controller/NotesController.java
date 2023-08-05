package com.exam.noteApp.controller;

import com.exam.noteApp.entity.Note;
import com.exam.noteApp.entity.Users;
import com.exam.noteApp.links.NoteLinks;
import com.exam.noteApp.links.UserLinks;
import com.exam.noteApp.service.NotesService;
import com.exam.noteApp.service.SaveNotes;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/notes/")
public class NotesController {

    @Autowired
    NotesService notesService;

    @GetMapping(path = NoteLinks.GET_NOTES)
    public ResponseEntity<?> getNotesByUser(@RequestParam(name = "name") String name,
                                            @RequestParam(name = "surname") String surname) {
        log.info("NotesController: Get Notes");
        List<Note> resource = notesService.getNotesByUser(name, surname);
        return ResponseEntity.ok(resource);
    }

    @PostMapping(path = NoteLinks.CREATE_NOTE)
    public ResponseEntity<?> createNote(@RequestBody SaveNotes saveNotes) {
        log.info("NotesController:  Create Note");
        return ResponseEntity.ok(notesService.createNote(saveNotes));
    }

    @PatchMapping(path = NoteLinks.EDIT_NOTE)
    public ResponseEntity<?> getNotesByUser(@RequestParam(name = "title") String title,
                                            @RequestParam(name = "content") String content,
                                            @RequestParam(name = "noteId") Integer noteId) {
        log.info("NotesController: Update Notes");
        notesService.udpateNotes(noteId, title, content);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @DeleteMapping(path = NoteLinks.DELETE_NOTE)
    public ResponseEntity<?> deleteNote(@RequestParam(name = "noteId") Integer noteId) {
        log.info("NotesController: Delete Notes");
        notesService.deleteNotes(noteId);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
