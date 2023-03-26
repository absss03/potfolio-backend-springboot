package com.abigail.SpringBoot.service;


import com.abigail.SpringBoot.entity.Habilidad;
import com.abigail.SpringBoot.repository.RHabilidad;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SHabilidad {
    
    @Autowired
    public RHabilidad habilidadRepo;
    
    public List <Habilidad> verHabilidades() {
        List <Habilidad> listaHabilidades= habilidadRepo.findAll();
        return listaHabilidades;
    }
    
     public Habilidad buscarHabilidad (int id){
        Habilidad habilidad = habilidadRepo.findById(id).orElse(null);
        return habilidad;
    }
     
    public void crearHabilidad(Habilidad habilidad){
        habilidadRepo.save(habilidad);
    }
    
    public void borrarHabilidad(int id){
        habilidadRepo.deleteById(id);
    }
    
   
}