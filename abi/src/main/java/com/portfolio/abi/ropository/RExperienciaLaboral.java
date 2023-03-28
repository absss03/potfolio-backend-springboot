package com.portfolio.abi.ropository;

import com.portfolio.abi.entity.ExperienciaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperienciaLaboral extends JpaRepository <ExperienciaLaboral, Integer>{
    
}
