package com.example.profilemanagement.controller;

import com.example.profilemanagement.entity.Person;
import com.example.profilemanagement.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    PersonService personService;

    @PostMapping("/get-list-person")
    public ResponseEntity<List<Person>> getListPerson(){
        return ResponseEntity.ok(personService.getListPerson());
    }
}
