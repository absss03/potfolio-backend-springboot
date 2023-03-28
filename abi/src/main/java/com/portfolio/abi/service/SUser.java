package com.portfolio.abi.service;

import com.portfolio.abi.entity.User;
import com.portfolio.abi.ropository.RUser;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SUser {
    @Autowired
    public RUser userRepo;
    
    public User buscarUser(String userId){
        User user = userRepo.findById(userId).orElse(null);
        return user;
    }
    
}
