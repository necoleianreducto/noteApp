package com.exam.noteApp.service;

import com.exam.noteApp.Utils.NoteSpecificationQueryBuilder;
import com.exam.noteApp.entity.*;
import com.exam.noteApp.repository.LabelRepository;
import com.exam.noteApp.repository.NoteLabelRepository;
import com.exam.noteApp.repository.NoteRepository;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class NotesService {

    private NoteRepository noteRepository;
    private LabelRepository labelRepository;
    private NoteLabelRepository noteLabelRepository;
    private UsersService usersService;

    public NotesService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public NotesService(LabelRepository labelRepository) {
        this.labelRepository = labelRepository;
    }

    public NotesService(NoteLabelRepository noteLabelRepository) {
        this.noteLabelRepository = noteLabelRepository;
    }

    public List<Note> getNotesByUser(String name, String surname) {
        Specification<Note> spec = NoteSpecificationQueryBuilder.buildNameAndSurname(name, surname);
        return noteRepository.findAll(spec);
    }

    public Note createNote(SaveNotes saveNotes) {
        String name = saveNotes.getName();
        String surname = saveNotes.getSurname();
        Specification<Note> spec = NoteSpecificationQueryBuilder.buildNameAndSurname(name, surname);
        List<Users> users = usersService.getUser(name, surname);

        Label label = new Label();
        label.setName(saveNotes.getLabel());
        Label labelSave = labelRepository.save(label);

        Note note = new Note();
        note.setTitle(saveNotes.getTitle());
        note.setContent(saveNotes.getContent());
        Note noteSave = noteRepository.save(note);

        UsersNotes usersNotes = new UsersNotes();
        usersNotes.setNoteId(noteSave.getNoteId());
        usersNotes.setUserId(users.get(0).getUserId());

        NoteLabel noteLabel = new NoteLabel();
        noteLabel.setLabelId(labelSave.getLabelId());
        noteLabel.setNoteId(noteSave.getNoteId());

        return noteSave;
    }


    public void udpateNotes(Integer noteId, String title, String content) {
        Specification<Note> spec = NoteSpecificationQueryBuilder.withNoteId(noteId);
        List<Note> notesToUpdate = noteRepository.findAll(spec);

        for (Note note : notesToUpdate) {
            note.setContent(content);
            note.setTitle(title);
            noteRepository.save(note);
        }
    }

    public void deleteNotes(Integer noteId) {
        Optional<Note> note = noteRepository.findById(noteId);
        note.ifPresent(noteRepository::delete);
    }
}
