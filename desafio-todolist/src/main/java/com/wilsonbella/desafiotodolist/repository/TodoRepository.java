package com.wilsonbella.desafiotodolist.repository;

import com.wilsonbella.desafiotodolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
