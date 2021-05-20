package com.sanvalero.domain;

public class Restaurante {
    private String nombre;
    private String descripcion;
    private String tipo;
    private String direccion;
    private String horario;

    public Restaurante() {
    }

    public Restaurante(String nombre, String descripcion, String tipo, String direccion, String horario) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.direccion = direccion;
        this.horario = horario;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
