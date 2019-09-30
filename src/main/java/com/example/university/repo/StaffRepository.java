package com.example.university.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.university.domain.Staff;
import com.example.university.domain.Student;

public interface StaffRepository extends PagingAndSortingRepository<Staff, Integer>{



}
