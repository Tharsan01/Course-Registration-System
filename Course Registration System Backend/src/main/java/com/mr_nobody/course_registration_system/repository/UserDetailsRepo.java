package com.mr_nobody.course_registration_system.repository;

import com.mr_nobody.course_registration_system.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDetailsRepo extends JpaRepository<Users,Integer> {
    Users getByUsername(String username);
}
