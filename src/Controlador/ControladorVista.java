/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author ikasleaETHAZI
 */

import Vista.VistaBienvenida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;



public class ControladorVista implements ActionListener {
    
    public ControladorVista(JButton boton_siguiente){
        
        boton_siguiente.addActionListener(this);
          
           VistaBienvenida vistab=new VistaBienvenida();
    vistab.setBounds(10,10,400,300);
    vistab.setVisible(true);
    
    
    }
    
    public void actionPerformed(ActionEvent e) {
    System.exit(0);
    }
    }
    
   
