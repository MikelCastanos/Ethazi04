/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Vista.VistaUnApartamento;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 *
 * @author shabi
 */
public class ControladorComplementosApartamento {
    
            public ControladorComplementosApartamento(JButton botonSiguienteComplementosApartamento,JCheckBox checkboxWifiApartamento,JCheckBox checkboxPiscinaApartamento,JCheckBox checkboxSpaApartamento,JCheckBox checkboxParkingApartamento,JCheckBox checkboxAAApartamento,JCheckBox checkboxRestauranteApartamento,JCheckBox checkboxBarApartamento,JCheckBox checkboxGymApartamento){
        botonSiguienteComplementosApartamento.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                
                siguienteVentana();
                
            }
            
        });
    }
        
        public void siguienteVentana(){
           VistaUnApartamento vista1Apartamento=new VistaUnApartamento();
                  vista1Apartamento.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      vista1Apartamento.setBounds(0,0,600,725);
      vista1Apartamento.setVisible(true);
       
            
        }
    
}
