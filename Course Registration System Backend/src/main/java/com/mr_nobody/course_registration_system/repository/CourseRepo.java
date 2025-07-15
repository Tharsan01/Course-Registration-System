package com.mr_nobody.course_registration_system.repository;

import com.mr_nobody.course_registration_system.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Course,Integer> {
}
