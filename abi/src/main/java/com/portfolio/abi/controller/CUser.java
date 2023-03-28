package com.portfolio.abi.controller;

import com.portfolio.abi.entity.User;
import com.portfolio.abi.service.SUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost4200")
public class CUser {
    
    @Autowired
    SUser userServ;
            
    @PostMapping("/login")
    public ResponseEntity<?> loginUser (@RequestBody User userData){
        System.out.println(userData);
        User user=userServ.buscarUser(userData.getUserId());
        if(user.getPassword().equals(userData.getPassword()))
            return ResponseEntity.ok(user);
        return (ResponseEntity< ?>)ResponseEntity.internalServerError();
    }
}
