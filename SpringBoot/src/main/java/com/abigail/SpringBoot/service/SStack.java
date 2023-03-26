package com.abigail.SpringBoot.service;


import com.abigail.SpringBoot.entity.Stack;
import com.abigail.SpringBoot.repository.RStack;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SStack {
    
    @Autowired
    public RStack stackRepo;
    
    public List <Stack> verStacks() {
        List <Stack> listaStacks= stackRepo.findAll();
        return listaStacks;
    }
    
     public Stack buscarStack(int id){
        Stack stack = stackRepo.findById(id).orElse(null);
        return stack;
    }
     
    public void crearStack(Stack stack){
        stackRepo.save(stack);
    }
    
    public void borrarStack(int id){
        stackRepo.deleteById(id);
    }
    
   
}