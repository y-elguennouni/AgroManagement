/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.TUsuario;


/**
 *
 * @author platon
 */
public class controlador {
    
    public void CrearUsuario(String usuario, String password,String confirmar){
        TUsuario objUsuario = new TUsuario(usuario,password);
        if (!usuario.isEmpty() && password.equals(confirmar))
            if (!objUsuario.existe())
                objUsuario.salvar();
      

    }
}
