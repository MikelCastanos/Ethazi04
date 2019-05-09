/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JCheckBox;


/**
 *
 * @author shabi
 */
public class ControladorComplementosCasa {
    
        public ControladorComplementosCasa(JButton botonSiguienteComplementosCasa,JCheckBox checkboxWifiCasa,JCheckBox checkboxPiscinaCasa,JCheckBox checkboxSpaCasa,JCheckBox checkboxParkingCasa,JCheckBox checkboxAACasa,JCheckBox checkboxRestauranteCasa,JCheckBox checkboxBarCasa,JCheckBox checkboxGymCasa){
        botonSiguienteComplementosCasa.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                
                asd();
                
            }
            
        });
    }
        
        public void asd(){
            System.out.println("YAY");
        }
    
}
