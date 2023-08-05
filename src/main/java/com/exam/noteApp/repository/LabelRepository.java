package com.exam.noteApp.repository;

import com.exam.noteApp.entity.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface LabelRepository extends JpaRepository<Label, Integer>, JpaSpecificationExecutor<Label>, QuerydslPredicateExecutor<Label> {
}
