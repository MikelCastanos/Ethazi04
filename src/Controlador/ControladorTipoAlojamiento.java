package Controlador;

import Vista.VistaUbicacionApartamento;
import Vista.VistaUbicacionCasa;
import Vista.VistaUbicacionHotel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

/**
 *
 * @author ikasleaETHAZI
 */
public class ControladorTipoAlojamiento {
    
            public ControladorTipoAlojamiento(JButton botonTipoAlojamiento,JRadioButton radioHotel,JRadioButton radioCasa,JRadioButton radioApartamento){
        botonTipoAlojamiento.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                comprobarSelected(radioHotel,radioCasa,radioApartamento);
                
                
            }
            
        });
    }
            
          public void comprobarSelected(JRadioButton radioHotel,JRadioButton radioCasa,JRadioButton radioApartamento ){
              if(radioHotel.isSelected()){
                VistaUbicacionHotel vistaUH=new VistaUbicacionHotel();        
                vistaUH.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                vistaUH.setBounds(0,0,600,725);
                vistaUH.setVisible(true);
              }
              if(radioCasa.isSelected()){
                VistaUbicacionCasa vistaUC=new VistaUbicacionCasa();
                vistaUC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                vistaUC.setBounds(0,0,600,725);
                vistaUC.setVisible(true);
              }
              if(radioApartamento.isSelected()){
                VistaUbicacionApartamento vistaUA=new VistaUbicacionApartamento();
                vistaUA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                vistaUA.setBounds(0,0,600,725);
                vistaUA.setVisible(true);
              }
              
          }  
            
}
