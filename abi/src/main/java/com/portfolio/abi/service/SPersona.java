package com.portfolio.abi.service;


import com.portfolio.abi.entity.Persona;
import com.portfolio.abi.ropository.RPersona;
import jakarta.transaction.Transactional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SPersona {
    
    @Autowired
    public RPersona personaRepo;
    
    public List <Persona> verPersonas() {
        List <Persona> listaPersonas= personaRepo.findAll();
        return listaPersonas;
    }
    
    public Persona buscarPersona(int id){
        Persona persona = personaRepo.findById(id).orElse(null);
        return persona;
    }
     
    public void crearPersona(Persona persona){
        personaRepo.save(persona);
    }
    
    public void borrarPersona(int id){
        personaRepo.deleteById(id);
    }
    
    public void editarPersona(Persona persona){
        personaRepo.save(persona);
    }
   
}
