package com.abigail.SpringBoot.service;

import com.abigail.SpringBoot.entity.Persona;
import com.abigail.SpringBoot.repository.RPersona;
import java.util.List;
import javax.transaction.Transactional;
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
