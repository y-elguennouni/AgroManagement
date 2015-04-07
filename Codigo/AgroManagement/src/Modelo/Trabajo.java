/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author platon
 */
class Trabajo {
    private String nombre;
    private Date fecha;
    private Finca finca;
    private ListaRecursos recursos;

    public String getNombre() {
        return nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public Finca getFinca() {
        return finca;
    }

    public ListaRecursos getRecursos() {
        return recursos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setFinca(Finca finca) {
        this.finca = finca;
    }

    public void setRecursos(ListaRecursos recursos) {
        this.recursos = recursos;
    }

    public Trabajo(String nombre, Date fecha, Finca finca, ListaRecursos recursos) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.finca = finca;
        this.recursos = recursos;
    }
    
}
