package com.mr_nobody.course_registration_system.controller;

import com.mr_nobody.course_registration_system.model.Course;
import com.mr_nobody.course_registration_system.model.CourseRegistry;
import com.mr_nobody.course_registration_system.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class CourseController {
    @Autowired
    CourseService courseService;
    @CrossOrigin(origins = "http://localhost:5500")
    @GetMapping("courses")
    public List<Course> availableCourses(){
        return courseService.availableCourses();
    }
    @CrossOrigin(origins = "http://localhost:5500")
    @GetMapping("courses/enrolled")
    public List<CourseRegistry> enrolledStudents(){
        return courseService.enrolledStudents();
    }

    @PostMapping("courses/register")
    public String registerCourse(@RequestParam("name") String name,
                                 @RequestParam("emailId") String emailId,
                                 @RequestParam("courseName") String courseName){
        return courseService.registerCourse(name,emailId,courseName);
    }
}
