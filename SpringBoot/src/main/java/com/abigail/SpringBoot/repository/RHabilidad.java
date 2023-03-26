package com.abigail.SpringBoot.repository;

import com.abigail.SpringBoot.entity.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RHabilidad extends JpaRepository <Habilidad, Integer>{
    
}
