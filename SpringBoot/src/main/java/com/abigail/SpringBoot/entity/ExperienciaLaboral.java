package com.abigail.SpringBoot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ExperienciaLaboral {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String empresa;
    private String inicio;
    private String fin;
    private String descripccionPuesto;

    public ExperienciaLaboral() {
    }

    public ExperienciaLaboral(String empresa, String inicio, String fin, String descripccionPuesto) {
        this.empresa = empresa;
        this.inicio = inicio;
        this.fin = fin;
        this.descripccionPuesto = descripccionPuesto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getDescripccionPuesto() {
        return descripccionPuesto;
    }

    public void setDescripccionPuesto(String descripccionPuesto) {
        this.descripccionPuesto = descripccionPuesto;
    }
    
    
    
}
