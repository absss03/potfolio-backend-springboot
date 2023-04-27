package com.portfolio.abi.service;


import com.portfolio.abi.entity.ExperienciaLaboral;
import com.portfolio.abi.ropository.RExperienciaLaboral;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperienciaLaboral {
    
    @Autowired
    public RExperienciaLaboral expRepo;
    
    public List <ExperienciaLaboral> verExperiencias() {
        List <ExperienciaLaboral> listaExperienciaLaboral = expRepo.findAll();
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
    
    public void editarExperiencia(ExperienciaLaboral experienciaLaboral){
        expRepo.save(experienciaLaboral);
    }
}