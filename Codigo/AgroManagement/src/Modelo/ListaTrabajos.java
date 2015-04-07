/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author platon
 */
class ListaTrabajos {
    private ArrayList<Trabajo> trabajos;
    
    public ListaTrabajos(){
        this.trabajos=new ArrayList();
    }
    public void addTrabajo(Trabajo trabajo){
        trabajos.add(trabajo);
    }
    public Trabajo getTrabajoByNombre(String nombre){
        int i;
        for(i=0;i<trabajos.size();i++){
            if(trabajos.get(i).getNombre().equals(nombre))
                return trabajos.get(i);
        }
        return null;
    }
}
