package com.abhi;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Serializable>{

}
