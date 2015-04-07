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
    public void addUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
    public Usuario getUsuario(String usuario){
        int i;
        for(i=0;i<usuarios.size();i++){
            if(usuarios.get(i).getUsuario().equals(usuario))
                return usuarios.get(i);
        }
        return null;
    }
    public void setUsuario(Usuario usuario){
        int i=0;
        //mientras nolo encuentra avanza
        while (!usuarios.get(i).getUsuario().equals(usuario.getUsuario()))
            i++;
        usuarios.set(i, usuario);
        }
    public void delUsuario(String usuario){
        int i=0;
        while(!usuarios.get(i).getUsuario().equals(usuario))
            i++;
        usuarios.remove(i);
    }
}
