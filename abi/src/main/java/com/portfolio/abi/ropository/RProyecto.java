package com.portfolio.abi.ropository;

import com.portfolio.abi.entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProyecto extends JpaRepository <Proyecto, Integer>{
    
}

