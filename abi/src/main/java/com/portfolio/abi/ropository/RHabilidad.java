package com.portfolio.abi.ropository;

import com.portfolio.abi.entity.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RHabilidad extends JpaRepository <Habilidad, Integer>{
    
}
