/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author shabi
 */
public class VistaEstanciaSeleccionada extends JFrame{
    
    
        JLabel mensajeEstancia,datosEstancia;
        JButton boton_siguiente4;
    
    
    
    public VistaEstanciaSeleccionada(){
        
        boton_siguiente4=new javax.swing.JButton();
        
        setLayout(null);
        
        mensajeEstancia=new JLabel("Estos son los datos de tu estancia: ");
        mensajeEstancia.setBounds(10,20,200,30);
        add(mensajeEstancia);
        
        
        
        datosEstancia=new JLabel("");
        datosEstancia.setBounds(10,40,200,30);
        add(datosEstancia);
        
        
        
        boton_siguiente4=new JButton("Siguiente");
        boton_siguiente4.setBounds(10,140,100,30);
        add(boton_siguiente4);
        
    }
    
}
