package com.royforthewin.restfulwebservices.todo.service;

import com.royforthewin.restfulwebservices.todo.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class HardCodeService {

    private static List<Todo> todos = new ArrayList<>();
    private static int idCounter = 0;


    static {
        todos.add(new Todo(++idCounter, "test"+idCounter, "description", new Date(), false ));
        todos.add(new Todo(++idCounter, "test"+idCounter, "description", new Date(), false ));

    }


    public List<Todo> findAll(){
        return todos;
    }

}
