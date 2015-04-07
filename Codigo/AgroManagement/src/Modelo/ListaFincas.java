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
class ListaFincas {
    private ArrayList<Finca> fincas;
    
    public ListaFincas(){
        this.fincas=new ArrayList();
    }
    public void addUsuario(Finca finca){
        fincas.add(finca);
    }
    public Finca getFincaByNombre(String nombre){
        int i;
        for(i=0;i<fincas.size();i++){
            if(fincas.get(i).getNombre().equals(nombre))
                return fincas.get(i);
        }
        return null;
    }
}
