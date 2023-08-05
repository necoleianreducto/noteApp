package com.exam.noteApp.repository;

import com.exam.noteApp.entity.NoteLabel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface NoteLabelRepository extends JpaRepository<NoteLabel, Integer>, JpaSpecificationExecutor<NoteLabel>, QuerydslPredicateExecutor<NoteLabel> {
}
