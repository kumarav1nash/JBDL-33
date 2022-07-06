package com.example.demojpa.repositories;

import com.example.demojpa.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
}
