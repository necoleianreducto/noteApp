package com.exam.noteApp.Utils;

import com.exam.noteApp.entity.Note;
import org.springframework.data.jpa.domain.Specification;

public class NoteSpecificationQueryBuilder {

    public static <T> Specification<T> buildNameAndSurname(String name, String surname) {
        return (root, query, criteriaBuilder) -> {
            return criteriaBuilder.and(
                    criteriaBuilder.equal(root.get("name"), name),
                    criteriaBuilder.equal(root.get("surname"), surname)
            );
        };
    }

    public static Specification<Note> withNoteId(Integer noteId) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("id"), noteId);
    }

}
