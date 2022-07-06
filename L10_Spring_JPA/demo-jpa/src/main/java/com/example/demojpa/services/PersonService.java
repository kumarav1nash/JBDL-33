package com.example.demojpa.services;

import com.example.demojpa.models.Person;
import com.example.demojpa.models.request.CreatePersonRequest;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PersonService{


    void createPerson(CreatePersonRequest createPersonRequest);

    Person getPerson(int id);

    List<Person> getPeople();
}
