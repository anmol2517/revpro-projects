package org.springboots.bootstwice.repository;

import org.springboots.bootstwice.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student, Integer> {

}
