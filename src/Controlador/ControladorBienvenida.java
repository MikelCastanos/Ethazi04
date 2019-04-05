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
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class ControladorBienvenida {
    
    VistaBienvenida vista;
    Modelo modelo;
    ActionListener actionListener;

        public void contol(){        
        actionListener = new ActionListener() {
              public void actionPerformed(ActionEvent actionEvent) {  
                  VistaBienvenida vistab=new VistaBienvenida();
                  vistab.dispose();
                  impr();
              }
        };                
        VistaBienvenida.getBoton_siguiente().addActionListener(actionListener);   
    }
        
        public void impr(){
            
            //HACER DISPOSE SI HAY AGALLAS.

            VistaUbicacion vistau=new VistaUbicacion();
            vistau.setBounds(0,0,600,600);
            vistau.setVisible(true);
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
    
  

   
    
    
    
    
   
