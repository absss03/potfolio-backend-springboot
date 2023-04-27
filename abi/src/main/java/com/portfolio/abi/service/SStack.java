package com.portfolio.abi.service;



import com.portfolio.abi.entity.Stack;
import com.portfolio.abi.ropository.RStack;
import jakarta.transaction.Transactional;
import java.util.List;
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
    
    public void editarStack(Stack stack){
        stackRepo.save(stack);
    }     
}