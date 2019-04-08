/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ConsultaHotel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author ikasleaETHAZI
 */
public class ControladorEleccion {
    
        public ControladorEleccion(JButton boton_siguiente2){
        boton_siguiente2.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                JOptionPane.showMessageDialog(null,"FUnciona");
            }
            
        });
    }
    

        
        
    }

    

