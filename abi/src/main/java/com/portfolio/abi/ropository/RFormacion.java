package com.portfolio.abi.ropository;

import com.portfolio.abi.entity.Formacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RFormacion extends JpaRepository <Formacion, Integer>{
    
}
