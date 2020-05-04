package com.royforthewin.restfulwebservices.controller;

import com.royforthewin.restfulwebservices.model.HelloWorldBean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


    @GetMapping(value = "/hello")
    public String helloWorld() {
        return "hello";
    }

    @GetMapping(value = "/hello-bean")
    public HelloWorldBean helloBean() {
        return new HelloWorldBean("hello bean");
    }

    @GetMapping(value = "/hello-bean/var/{name}")
    public HelloWorldBean helloBeanWithVarName(@PathVariable String name) {
        return new HelloWorldBean(String.format("hello %s",name));
    }

}
