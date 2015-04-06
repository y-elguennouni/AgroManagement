/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author platon
 */
public class TUsuario {
    private String usuario;
    private String password;
    
    public String getUsuario(){
        return this.usuario;
    }
    public String getPassword(){
        return this.password;
    }
    public void setUsuario(String usuario){
        this.usuario=usuario;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public TUsuario(String usuario, String password){
        this.usuario=usuario;
        this.password=password;
    }
}
