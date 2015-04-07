/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Vista.*;
import Modelo.*;
import Controlador.*;

/**
 *
 * @author platon
 */
public class main {
    public static void main(String args[]) {
        System.out.println("Evento incial");
        Vista vista = new Vista();
        Modelo modelo =new Modelo();
        Controlador controlador=new Controlador(vista,modelo);
        
                
    }
}
