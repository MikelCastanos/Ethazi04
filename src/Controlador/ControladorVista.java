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
import Vista.*;
import Modelo.*;
import Aplicacion.*;
import javax.swing.JOptionPane;



public class ControladorVista {
    
    VistaBienvenida vista;
    Modelo modelo;
    ActionListener actionListener;

        public void contol(){        
        actionListener = new ActionListener() {
              public void actionPerformed(ActionEvent actionEvent) {                  
                  impr();
              }
        };                
        VistaBienvenida.getBoton_siguiente().addActionListener(actionListener);   
    }
        
        public void impr(){
            JOptionPane.showMessageDialog(null,"YEEEEEEEAH");
        }
    
    
    
    
    
    
}
    
    
    
    
    
    
    
    
    
    
    
    
    /*public ControladorVista(JButton boton_siguiente){
        
        boton_siguiente.addActionListener((ActionListener) this);
          
           VistaBienvenida vistab=new VistaBienvenida();
            vistab.setBounds(10,10,400,300);
            vistab.setVisible(true);
    
    
    }
    
    public void actionPerformed(ActionEvent e) {
    System.exit(0);
    }*/
    
  

   
    
    
    
    
   
