package com.joaovitor.workshopmongo.controller;

import com.joaovitor.workshopmongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @RequestMapping
    public ResponseEntity<List<User>> findAll(){
        User maria = new User("1","Maria Brown","Maria@hotmail.com");
        User alex = new User("2","Alex Green","alex@hotmail.com");
        List<User> list = new ArrayList<>(Arrays.asList(maria, alex));
        return ResponseEntity.ok().body(list);
    }
}
