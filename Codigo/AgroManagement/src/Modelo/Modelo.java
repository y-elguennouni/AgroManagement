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
public class Modelo {
    private ListaUsuarios listaUsuarios;
    private ListaTrabajos listaTrabajos;
    private ListaRecursos listaRecursos;
    private ListaFincas listaFincas;
    public Modelo(){
        listaUsuarios=new ListaUsuarios();
        listaTrabajos=new ListaTrabajos();
        listaRecursos=new ListaRecursos();
        listaFincas=new ListaFincas();
    }
    //Usuario
    public void crearUsuario(String usuario,String password, boolean admin){
        listaUsuarios.addUsuario(usuario,password,admin);
    }
    public void modificarUsuario(String usuario,String password, boolean admin){
        listaUsuarios.setUsuario(usuario,password,admin);
    }
    public void borrarUsuario(String usuario){
        listaUsuarios.delUsuario(usuario);
    }
    public void verUsuarioUsuario(String usuario){
        
    }
    public void verUsuarioPassword(String usuario){
        
    }
    public void verUsuarioAdmin(String usuario){
        
    }
}
