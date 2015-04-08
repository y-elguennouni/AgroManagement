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
public class ListaUsuarios {
    private ArrayList<Usuario> usuarios;
    
    public ListaUsuarios(){
        this.usuarios=new ArrayList();
    }
    public void addUsuario(String usuario,String password,boolean admin){
        Usuario aux = new Usuario(usuario,password,admin);
        if(!existeUsuario(usuario))
            usuarios.add(aux);
        //Aqui iria un else con la excepcion
    }
    public Usuario getUsuario(String usuario){
        int i;
        for(i=0;i<usuarios.size();i++){
            if(usuarios.get(i).getUsuario().equals(usuario))
                return usuarios.get(i);
        }
        return null;
    }
    public void setUsuario(String usuario, String password, boolean admin){
        int i=0;
        Usuario aux=new Usuario(usuario,password,admin);
        //mientras nolo encuentra avanza
        while (!usuarios.get(i).getUsuario().equals(usuario) || i<usuarios.size())
            i++;
        if(i<usuarios.size())
            usuarios.set(i, aux);
        //Aqui va excepcion de no encontrado
    }
    public void delUsuario(String usuario){
        int i=0;
        while(!usuarios.get(i).getUsuario().equals(usuario)|| i<usuarios.size())
            i++;
        if(i<usuarios.size())
            usuarios.remove(i);
        //Aqui va excepcion de no controlado
    }
    //Funciones auxiliares
    private boolean existeUsuario(String usuario){
        int i;
        boolean encontrado=false;
        for(i=0;i<usuarios.size();i++){
            if(usuarios.get(i).getUsuario().equals(usuario))
                encontrado=true;
        }
        return encontrado;
    }
}
