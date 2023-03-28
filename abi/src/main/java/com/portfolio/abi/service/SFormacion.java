package com.portfolio.abi.service;


import com.portfolio.abi.entity.Formacion;
import com.portfolio.abi.ropository.RFormacion;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class SFormacion {
    
    @Autowired
    public RFormacion formacionRepo;
    
    public List <Formacion> verFormaciones() {
        List <Formacion> listaFormaciones= formacionRepo.findAll();
        return listaFormaciones;
    }
    
     public Formacion buscarFormacion(int id){
        Formacion formacion = formacionRepo.findById(id).orElse(null);
        return formacion;
    }
     
    public void crearFormacion(Formacion formacion){
        formacionRepo.save(formacion);
    }
    
    public void borrarFormacion(int id){
        formacionRepo.deleteById(id);
    }
    
   
}
