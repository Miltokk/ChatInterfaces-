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
public interface ConectorChat {
    
    public void Mensaje(String mensaje);
    public void ImprimirMensaje();
    public void enviarArea(JTextArea area);
}
