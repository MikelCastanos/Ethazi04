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
public class ControladorUnApartamento {
    
                    public ControladorUnApartamento(JButton botonSiguienteUnaApartamento,JComboBox comboBoxResultadosApartamento){
        botonSiguienteUnaApartamento.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                System.out.println("Boton Una Apartamento");
                
                
            }
            
        });
    }
            
            public void habitacionSeleccionada(JComboBox comboBoxResultadosApartamento){
                comboBoxResultadosApartamento.getSelectedItem();
            }
    
}

