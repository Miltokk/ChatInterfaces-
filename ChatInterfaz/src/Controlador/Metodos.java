/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import javax.swing.JTextArea;

/**
 *
 * @author Miltokk
 */
public class Metodos implements ConectorChat {
    String mensaje="";
    JTextArea area;
    @Override
    public void Mensaje(String mensaje) {
        this.mensaje= "El: "+mensaje;
    }

    @Override
    public void ImprimirMensaje() {
       this.area.append(mensaje);
    }

    @Override
    public void enviarArea(JTextArea area) {
        this.area=area;
    }
    
}
