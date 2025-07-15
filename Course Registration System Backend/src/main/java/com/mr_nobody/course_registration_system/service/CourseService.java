package com.mr_nobody.course_registration_system.service;

import com.mr_nobody.course_registration_system.model.Course;
import com.mr_nobody.course_registration_system.model.CourseRegistry;
import com.mr_nobody.course_registration_system.repository.CourseRegistryRepo;
import com.mr_nobody.course_registration_system.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepo courseRepo;
    @Autowired
    CourseRegistryRepo courseRegistryRepo;
    public List<Course> availableCourses() {
        return courseRepo.findAll();
    }

    public List<CourseRegistry> enrolledStudents() {
        return courseRegistryRepo.findAll();
    }

    public String registerCourse(String name, String emailId, String courseName) {
        CourseRegistry courseRegistry = new CourseRegistry(name,emailId,courseName);
        courseRegistryRepo.save(courseRegistry);
        return "hello"+name+"Your Registration for"+courseName+"is Succesfull";
    }
}
