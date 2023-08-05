package com.exam.noteApp.repository;

import com.exam.noteApp.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface NoteRepository extends JpaRepository<Note, Integer>, JpaSpecificationExecutor<Note>, QuerydslPredicateExecutor<Note> {

}
