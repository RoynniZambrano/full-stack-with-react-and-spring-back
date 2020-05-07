package com.royforthewin.restfulwebservices.todo.controller;

import com.royforthewin.restfulwebservices.todo.model.Todo;
import com.royforthewin.restfulwebservices.todo.service.HardCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TodoController {

    @Autowired
    private HardCodeService hardCodeService;

    @GetMapping("/users/{username}/todos")
    public List<Todo> getAllTodos(@PathVariable String username){
        return hardCodeService.findAll();
    }

}
