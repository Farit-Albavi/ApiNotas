package com.todolist.app.repository;

import com.todolist.app.models.NotaModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotaRepository extends CrudRepository<NotaModel, Long> {
}
