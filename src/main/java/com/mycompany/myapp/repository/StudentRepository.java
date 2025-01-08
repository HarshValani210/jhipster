package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Student;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data MongoDB reactive repository for the Student entity.
 */
@SuppressWarnings("unused")
@Repository
public interface StudentRepository extends ReactiveMongoRepository<Student, String> {}
