package com.abigail.SpringBoot.repository;


import com.abigail.SpringBoot.entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProyecto extends JpaRepository <Proyecto, Integer>{
    
}

