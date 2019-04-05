/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import Controlador.*;

/**
 *
 * @author ikasleaETHAZI
 */
public class VistaBienvenida extends JFrame {
    
    JLabel mensaje_bienvenida;
    static JButton boton_siguiente;
    
    public VistaBienvenida(){
        
        boton_siguiente=new javax.swing.JButton();

        setLayout(null);
        mensaje_bienvenida=new JLabel("Bienvenido a Bidai-On");
        mensaje_bienvenida.setBounds(10,20,200,30);
        add(mensaje_bienvenida);
        
        boton_siguiente=new JButton("Siguiente");
        boton_siguiente.setBounds(10,60,100,30);
        add(boton_siguiente);
        
        ControladorBienvenida cont=new ControladorBienvenida(boton_siguiente);
    }

    public static JButton getBoton_siguiente() {
        return boton_siguiente;
    }
    
}
