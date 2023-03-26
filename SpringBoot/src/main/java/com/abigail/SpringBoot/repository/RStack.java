package com.abigail.SpringBoot.repository;


import com.abigail.SpringBoot.entity.Stack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RStack extends JpaRepository <Stack, Integer>{
    
}