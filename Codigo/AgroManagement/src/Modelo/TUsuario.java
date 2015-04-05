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
    
    public TUsuario(String usuario, String password){
        this.usuario=usuario;
        this.password=password;
    }
    public boolean existe(){
        if (this.usuario.equals("admin"))
            return true;
        else
            return false;               
    }
    public void salvar(){
        
    }
}
