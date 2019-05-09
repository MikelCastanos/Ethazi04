/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Vista.VistaUnaCasa;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;


/**
 *
 * @author shabi
 */
public class ControladorComplementosCasa {
    
        public ControladorComplementosCasa(JButton botonSiguienteComplementosCasa,JCheckBox checkboxWifiCasa,JCheckBox checkboxPiscinaCasa,JCheckBox checkboxSpaCasa,JCheckBox checkboxParkingCasa,JCheckBox checkboxAACasa,JCheckBox checkboxRestauranteCasa,JCheckBox checkboxBarCasa,JCheckBox checkboxGymCasa){
        botonSiguienteComplementosCasa.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                
                siguienteVentana();
                
            }
            
        });
    }
        
        public void siguienteVentana(){
            VistaUnaCasa vista1casa=new VistaUnaCasa();
                   vista1casa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       vista1casa.setBounds(0,0,600,725);
       vista1casa.setVisible(true);
        }
    
}
