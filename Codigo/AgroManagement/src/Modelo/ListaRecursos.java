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
class ListaRecursos {
    private ArrayList<Recurso> recursos;
    
    public ListaRecursos(){
        this.recursos=new ArrayList();
    }
    public void addRecurso(Recurso recurso){
        recursos.add(recurso);
    }
    public Recurso getRecursoByNombre(String nombre){
        int i;
        for(i=0;i<recursos.size();i++){
            if(recursos.get(i).getNombre().equals(nombre))
                return recursos.get(i);
        }
        return null;
    }
}
