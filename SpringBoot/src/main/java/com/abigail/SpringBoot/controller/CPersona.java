package com.abigail.SpringBoot.controller;

import com.abigail.SpringBoot.entity.Persona;
import com.abigail.SpringBoot.service.SPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("persona")
@CrossOrigin(origins = "http://localhost:4200")
public class CPersona {
    
    @Autowired
    SPersona personaServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List <Persona> verPersonas(){
        return personaServ.verPersonas();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Persona verPersona(@PathVariable int id){
        return personaServ.buscarPersona(id);
    }
    
  
    /*
    
    @GetMapping("/ver/{id}")
    public ResponseEntity<Persona> getById(@PathVariable ("id") int id){
        Persona persona = sPersona.getOne(id);
        return new ResponseEntity(persona, HttpStatus.OK);
    }
    
    */
    
    @PostMapping("/crear")
    public String agregarPersona(@RequestBody Persona persona){
        personaServ.crearPersona(persona);
        return "Nueva persona creada con exito";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String eliminarPersona(@PathVariable int id){
        personaServ.borrarPersona(id);
        return "Chau persona";
    }
    
    @PutMapping("/editar")
    public void editarPersona(@RequestBody Persona persona){
        personaServ.editarPersona(persona);
    }
    
    
    
}
