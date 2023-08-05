package com.exam.noteApp.respository;

import com.exam.noteApp.entity.User;
import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class UserRespositoryImpl implements UserRepository{
    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public List<User> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<User> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public <S extends User> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends User> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<User> entities) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public User getOne(Integer integer) {
        return null;
    }

    @Override
    public <S extends User> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends User> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends User> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends User> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends User> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends User> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends User, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public Optional<User> findOne(Specification<User> spec) {
        return Optional.empty();
    }

    @Override
    public List<User> findAll(Specification<User> spec) {
        return null;
    }

    @Override
    public Page<User> findAll(Specification<User> spec, Pageable pageable) {
        return null;
    }

    @Override
    public List<User> findAll(Specification<User> spec, Sort sort) {
        return null;
    }

    @Override
    public long count(Specification<User> spec) {
        return 0;
    }

    @Override
    public Optional<User> findOne(Predicate predicate) {
        return Optional.empty();
    }

    @Override
    public Iterable<User> findAll(Predicate predicate) {
        return null;
    }

    @Override
    public Iterable<User> findAll(Predicate predicate, Sort sort) {
        return null;
    }

    @Override
    public Iterable<User> findAll(Predicate predicate, OrderSpecifier<?>... orders) {
        return null;
    }

    @Override
    public Iterable<User> findAll(OrderSpecifier<?>... orders) {
        return null;
    }

    @Override
    public Page<User> findAll(Predicate predicate, Pageable pageable) {
        return null;
    }

    @Override
    public long count(Predicate predicate) {
        return 0;
    }

    @Override
    public boolean exists(Predicate predicate) {
        return false;
    }

    @Override
    public <S extends User, R> R findBy(Predicate predicate, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
