package com.portfolio.abi.controller;


import com.portfolio.abi.entity.Formacion;
import com.portfolio.abi.service.SFormacion;
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
@RequestMapping("formacion")
@CrossOrigin(origins = "http://localhost:4200")
public class CFormacion {
    
    @Autowired
    SFormacion formacionServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List <Formacion> verFormaciones(){
        return formacionServ.verFormaciones();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Formacion verFormacion(@PathVariable int id){
        return formacionServ.buscarFormacion(id);
    }
    
    @PostMapping("/crear")
    public void agregarFormacion(@RequestBody Formacion formacion){
        formacionServ.crearFormacion(formacion);
    }
    
    @DeleteMapping("/borrar/{id}")
    public void eliminarFormacion(@PathVariable int id){
        formacionServ.borrarFormacion(id);
    }
    
}