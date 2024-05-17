package com.practica.springboot.empleos.Model;

import java.util.Date;

public class Vacante {
    private int id;
    private String nombre;
    private String descripcion;
    private Date fechaPublicacion;
    private double salario;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }
    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Vacante [descripcion=" + descripcion + ", fechaPublicacion=" + fechaPublicacion + ", id=" + id
                + ", nombre=" + nombre + ", salario=" + salario + "]";
    }

    
}
