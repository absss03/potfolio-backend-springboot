package com.portfolio.abi.controller;



import com.portfolio.abi.entity.Habilidad;
import com.portfolio.abi.service.SHabilidad;
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
@RequestMapping("habilidad")
@CrossOrigin(origins = "http://localhost:4200")
public class CHabilidad {
    
    @Autowired
    SHabilidad habilidadServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List <Habilidad> verHabilidades(){
        return habilidadServ.verHabilidades();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Habilidad verHabilidad(@PathVariable int id){
        return habilidadServ.buscarHabilidad(id);
    }
    
    @PostMapping("/crear")
    public void agregarHabilidad(@RequestBody Habilidad habilidad){
        habilidadServ.crearHabilidad(habilidad);
    }
    
    @DeleteMapping("/borrar/{id}")
    public void eliminarHabilidad(@PathVariable int id){
        habilidadServ.borrarHabilidad(id);
    }

    @PutMapping("/editar")
    public void editarPersona(@RequestBody Habilidad habilidad){
        habilidadServ.editarHabilidad(habilidad);
    }
    
}