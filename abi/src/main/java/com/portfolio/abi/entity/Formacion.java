package com.portfolio.abi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Formacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String imagen;
    private String alt;
    private String institucion;
    private String descripccionFormacion;

    public Formacion() {
    }

    public Formacion(String imagen, String alt, String institucion, String descripccionFormacion) {
        this.imagen = imagen;
        this.alt = alt;
        this.institucion = institucion;
        this.descripccionFormacion = descripccionFormacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getDescripccionFormacion() {
        return descripccionFormacion;
    }

    public void setDescripccionFormacion(String descripccionFormacion) {
        this.descripccionFormacion = descripccionFormacion;
    }
    
    
}
