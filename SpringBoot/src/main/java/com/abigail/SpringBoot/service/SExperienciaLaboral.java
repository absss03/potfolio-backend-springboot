package com.abigail.SpringBoot.service;

import com.abigail.SpringBoot.entity.ExperienciaLaboral;
import com.abigail.SpringBoot.repository.RExperienciaLaboral;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperienciaLaboral {
    
    @Autowired
    public RExperienciaLaboral expRepo;
    
    public List <ExperienciaLaboral> verExperiencias() {
        List <ExperienciaLaboral> listaExperienciaLaboral= expRepo.findAll();
        return listaExperienciaLaboral;
    }
    
     public ExperienciaLaboral buscarExperienciaLaboral(int id){
        ExperienciaLaboral experienciaLaboral = expRepo.findById(id).orElse(null);
        return experienciaLaboral;
    }
     
    public void crearExperienciaLaboral(ExperienciaLaboral experienciaLaboral){
        expRepo.save(experienciaLaboral);
    }
    
    public void borrarExperienciaLaboral(int id){
        expRepo.deleteById(id);
    }
}