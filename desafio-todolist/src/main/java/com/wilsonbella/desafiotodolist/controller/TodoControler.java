package com.wilsonbella.desafiotodolist.controller;

import com.wilsonbella.desafiotodolist.entity.Todo;
import com.wilsonbella.desafiotodolist.service.TodoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoControler {
    private TodoService todoService;

    public TodoControler(TodoService todoService) {
        this.todoService = todoService;

    }
@PostMapping
    List<Todo> create(@RequestBody @Valid Todo todo) {
        return todoService.create(todo);

    }
@GetMapping
    List<Todo> list() {
        return todoService.list();

    }
@PutMapping
    List<Todo> update(@RequestBody Todo todo) {
        return todoService.update(todo);
    }
@DeleteMapping("{id}")
    List<Todo> delete(@PathVariable("id") Long id) {
        return todoService.delete(id);

    }
}
