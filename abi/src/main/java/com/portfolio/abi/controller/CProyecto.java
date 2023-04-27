package com.portfolio.abi.controller;


import com.portfolio.abi.entity.Proyecto;
import com.portfolio.abi.service.SProyecto;
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
@RequestMapping("proyecto")
@CrossOrigin(origins = "http://localhost:4200")
public class CProyecto {
    
    @Autowired
    SProyecto proyectoServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List <Proyecto> verProyectos(){
        return proyectoServ.verProyectos();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Proyecto verProyecto(@PathVariable int id){
        return proyectoServ.buscarProyecto(id);
    }
    
    @PostMapping("/crear")
    public void agregarProyecto(@RequestBody Proyecto proyecto){
        proyectoServ.crearProyecto(proyecto);
    }
    
    @DeleteMapping("/borrar/{id}")
    public void eliminarProyecto(@PathVariable int id){
        proyectoServ.borrarProyecto(id);
    }

    @PutMapping("/editar")
    public void editarProyecto(@RequestBody Proyecto proyecto){
        proyectoServ.editarProyecto(proyecto);
    }       
}
