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
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import Modelo.ConsultaHotel;
import Vista.VistaEleccion;



public class ControladorBienvenida extends JFrame{
    
    VistaBienvenida vista;
    VistaUbicacion vista2;
    Modelo modelo;
    ActionListener actionListener;
    
        public ControladorBienvenida(JButton boton_siguiente){
        boton_siguiente.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                abrirVentanaUbicacion();
                
                
            }
            
        });
    }
        
        public void abrirVentanaUbicacion(){
            
            //HACER DISPOSE SI HAY AGALLAS.
            

            VistaUbicacion vistau=new VistaUbicacion();
            vistau.setBounds(0,0,600,730);
            vistau.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
    
  

   
    
    
    
    
   
