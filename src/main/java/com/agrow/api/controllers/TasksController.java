package com.agrow.api.controllers;

import com.agrow.api.entities.Tasks;
import com.agrow.api.repositories.TasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class TasksController {

    @Autowired
    private TasksRepository repository;

    @GetMapping("/tasks")
    public List<Tasks> list() {
        return repository.findAll();
    }

    @GetMapping("/tasks/{id}")
    public Optional<Tasks> listById(@PathVariable(value = "id") Integer id) {
        return repository.findById(id);
    }

    @PostMapping("/tasks")
    public Tasks save(@RequestBody Tasks task) {
        return repository.save(task);
    }

    @PutMapping("/tasks")
    public Tasks update(@RequestBody Tasks task) {
        return repository.save(task);
    }

    @DeleteMapping("/tasks/{id}")
    public void delete(@PathVariable(value = "id") Integer id) {
        repository.deleteById(id);
    }
}
