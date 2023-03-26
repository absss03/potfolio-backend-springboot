package com.abigail.SpringBoot.controller;


import com.abigail.SpringBoot.entity.Stack;
import com.abigail.SpringBoot.service.SStack;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("stack")
@CrossOrigin(origins = "http://localhost:4200")
public class CStack {
    
    @Autowired
    SStack stackServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List <Stack> verStacks(){
        return stackServ.verStacks();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Stack verStack(@PathVariable int id){
        return stackServ.buscarStack(id);
    }
    
    @PostMapping("/crear")
    public void agregarStack(@RequestBody Stack stack){
        stackServ.crearStack(stack);
    }
    
    @DeleteMapping("/borrar/{id}")
    public void eliminarStack(@PathVariable int id){
        stackServ.borrarStack(id);
    }
    
}