package com.portfolio.abi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String tituloProyecto;
    private String descripcionProyecto;
    private String url;

    public Proyecto() {
    }

    public Proyecto(String tituloProyecto, String descripccioProyecto, String url) {
        this.tituloProyecto = tituloProyecto;
        this.descripcionProyecto = descripccioProyecto;
        this.url = url;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getTituloProyecto() {
        return tituloProyecto;
    }

    public void setTituloProyecto(String tituloProyecto) {
        this.tituloProyecto = tituloProyecto;
    }

    public String getDescripcionProyecto() {
        return descripcionProyecto;
    }

    public void setDescripcionProyecto(String descripccioProyecto) {
        this.descripcionProyecto = descripccioProyecto;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    
}
