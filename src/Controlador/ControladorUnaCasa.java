/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;

/**
 *
 * @author shabi
 */
public class ControladorUnaCasa {
    
                public ControladorUnaCasa(JButton botonSiguienteUnaCasa,JComboBox comboBoxResultadosCasa){
        botonSiguienteUnaCasa.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                System.out.println("Boton Una Casa");
                
                
            }
            
        });
    }
            
            public void habitacionSeleccionada(JComboBox comboBoxResultadosCasa){
                comboBoxResultadosCasa.getSelectedItem();
            }
    
}
