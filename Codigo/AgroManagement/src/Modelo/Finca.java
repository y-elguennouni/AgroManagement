/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author platon
 */
class Finca {
    private String nombre;
    private String descripcion;
    private float hectareas;
    private String catastro;
    //getters
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getHectareas() {
        return hectareas;
    }

    public String getCatastro() {
        return catastro;
    }
    //setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setHectareas(float hectareas) {
        this.hectareas = hectareas;
    }

    public void setCatastro(String catastro) {
        this.catastro = catastro;
    }

    public Finca(String nombre, String descripcion, float hectareas, String catastro) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.hectareas = hectareas;
        this.catastro = catastro;
    }
    
}
