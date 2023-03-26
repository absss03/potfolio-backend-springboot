package com.abigail.SpringBoot.repository;

import com.abigail.SpringBoot.entity.Formacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RFormacion extends JpaRepository <Formacion, Integer>{
    
}
