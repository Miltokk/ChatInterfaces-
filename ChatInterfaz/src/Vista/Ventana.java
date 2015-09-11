/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ConectorChat;
import Controlador.Metodos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Miltokk
 */
public class Ventana extends JFrame  {
    private JTextField textoEnviar;
    private JTextArea textoDondeRecibe;
    private JButton botonEnviar;
    private String mensajeEnviar;
    private JScrollPane scroll;
    private ConectorChat conectorchat;
    private Metodos metodos;
    
    
    public Ventana(String nombre,Metodos metodos,ConectorChat conectorchat,int x,int y){
        
        super(nombre);
        this.metodos=metodos;
        this.conectorchat=conectorchat;
        this.setSize(300, 250);
        this.setLayout(null);
        this.setLocation(x,y);
        
        Init();
        this.setVisible(true);
        
     }
    
     public void Init(){
     textoEnviar=new JTextField();
     textoEnviar.setBounds(5,180, 180, 25);
     textoDondeRecibe=new JTextArea();
     scroll=new JScrollPane(textoDondeRecibe);
     textoDondeRecibe.setEditable(false);
     scroll.setBounds(0, 0, 285,180);
     botonEnviar=new JButton("Enviar");
     metodos.enviarArea(textoDondeRecibe);
   
      botonEnviar.addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent e) {
                mensajeEnviar=textoEnviar.getText()+"\n";
                textoEnviar.setText("");
                 textoDondeRecibe.append("Tu: "+mensajeEnviar);
                conectorchat.Mensaje(mensajeEnviar);
                conectorchat.ImprimirMensaje();
                 mensajeEnviar="";
             }
         });
     
      
     botonEnviar.setBounds(190, 180, 90, 25);
     this.add(scroll);
     this.add(textoEnviar);
     this.add(botonEnviar);
     
    }


   
}