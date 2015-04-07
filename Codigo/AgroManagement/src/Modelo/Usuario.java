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
public class Usuario {
    private String usuario;
    private String password;
    private boolean admin;
    //getters
    public String getUsuario(){
        return this.usuario;
    }
    public String getPassword(){
        return this.password;
    }
    public boolean getAdmin(){
        return this.admin;
    }
    //Setters
    public void setUsuario(String usuario){
        this.usuario=usuario;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public void setAdmin(boolean admin){
        this.admin=admin;
    }
    //Constructor
    public Usuario(String usuario, String password, boolean admin){
        this.usuario=usuario;
        this.password=password;
        this.admin=admin;
    }
}
