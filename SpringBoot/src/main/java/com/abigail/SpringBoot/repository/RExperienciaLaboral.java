package com.abigail.SpringBoot.repository;

import com.abigail.SpringBoot.entity.ExperienciaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperienciaLaboral extends JpaRepository <ExperienciaLaboral, Integer>{
    
}
