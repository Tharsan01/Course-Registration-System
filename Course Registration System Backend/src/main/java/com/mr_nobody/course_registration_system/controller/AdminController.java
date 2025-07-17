package com.mr_nobody.course_registration_system.controller;

import com.mr_nobody.course_registration_system.model.CourseRegistry;
import com.mr_nobody.course_registration_system.model.Users;
import com.mr_nobody.course_registration_system.service.CourseService;
import com.mr_nobody.course_registration_system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private UserService userService;
    @Autowired
    CourseService courseService;

    @PostMapping("/add-user")
    public void addUser(@RequestBody Users user) {
        userService.addUser(user);
    }
    @CrossOrigin(origins = "http://localhost:5500")
    @GetMapping("courses/enrolled")
    public List<CourseRegistry> enrolledStudents(){
        return courseService.enrolledStudents();
    }
}
