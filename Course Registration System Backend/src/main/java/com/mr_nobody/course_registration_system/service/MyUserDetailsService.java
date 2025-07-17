package com.mr_nobody.course_registration_system.service;

import com.mr_nobody.course_registration_system.model.UserPrincipal;
import com.mr_nobody.course_registration_system.model.Users;
import com.mr_nobody.course_registration_system.repository.UserDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    UserDetailsRepo repo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = repo.getByUsername(username);
        if(user ==null){
            throw new UsernameNotFoundException(" user not found");
        }
        return new UserPrincipal(user);
    }
}
