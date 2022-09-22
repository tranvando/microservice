package com.example.profilemanagement.service.impl;

import com.example.profilemanagement.entity.Person;
import com.example.profilemanagement.repository.PersonRepository;
import com.example.profilemanagement.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonRepository personRepository;

    @Override
    public List<Person> getListPerson() {
        return personRepository.findAll();
    }
}
