/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Metodos;

/**
 *
 * @author Miltokk
 */
public class Ejecutor {
    public static void main(String[]args){
        
        Metodos metodo1=new Metodos();
        Metodos metodo2=new Metodos();
        Ventana ven1=new Ventana("Ventana1",metodo1,metodo2,0,0);
        Ventana ven2=new Ventana("Ventana2",metodo2,metodo1,300,0);
        ven1.setVisible(true);
        ven1.setVisible(true);
        
    }
}
