package com.example.university.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.university.domain.Person;
import com.example.university.domain.Student;

/**
 * DataSource Management for the Students at the University.
 *
 * Created by maryellenbowman
 */
public interface StudentRepository extends CrudRepository<Student, Integer>{
	
	List<Student> findByFullTime(boolean fullTime);
	List<Student> findByAge(Integer age);
	List<Student> findByAttendeeLastName(String lastName);
	
	//Query Methods with clauses and Expression
	Student findByAttendeeFirstNameAndAttendeeLastName(String firstName,String LastName);
	Student findByAttendee(Person person);
	List<Student> findByAgeGreaterThan(Integer age);
	List<Student> findByAgeLessThan(Integer age);
	List<Student> findByAttendeeLastNameIgnoreCase(String lastName);
	List<Student> findByAttendeeLastNameLike(String likeLastName);
	Student findFirstByOrderByAttendeeLastNameAsc();
    Student findTopByOrderByAgeDesc();
    List<Student> findTop3ByOrderByAgeDesc();
    
	
	

}
