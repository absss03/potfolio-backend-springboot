package com.abigail.SpringBoot.entity;

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
    private String descripccioProyecto;
    private String url;

    public Proyecto() {
    }

    public Proyecto(String tituloProyecto, String descripccioProyecto, String url) {
        this.tituloProyecto = tituloProyecto;
        this.descripccioProyecto = descripccioProyecto;
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

    public String getDescripccioProyecto() {
        return descripccioProyecto;
    }

    public void setDescripccioProyecto(String descripccioProyecto) {
        this.descripccioProyecto = descripccioProyecto;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    
}
