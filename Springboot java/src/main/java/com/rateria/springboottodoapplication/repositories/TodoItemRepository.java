package com.rateria.springboottodoapplication.repositories;

import org.springframework.data.repository.CrudRepository;

import com.rateria.springboottodoapplication.models.TodoItem;

public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {
}
