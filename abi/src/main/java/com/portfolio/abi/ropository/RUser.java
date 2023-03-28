package com.portfolio.abi.ropository;

import com.portfolio.abi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RUser extends JpaRepository <User, String>{

    
}
