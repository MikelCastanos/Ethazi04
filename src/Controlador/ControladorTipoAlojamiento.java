package Controlador;

import static Controlador.ControladorPago.cantidad_insertada;
import Modelo.Alojamiento;
import Vista.VistaBienvenida;
import Vista.VistaUbicacionApartamento;
import Vista.VistaUbicacionCasa;
import Vista.VistaUbicacionHotel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;


/**
 *
 * @author ikasleaETHAZI
 */
public class ControladorTipoAlojamiento {
    
    static char tipoDeAlojamiento;
            public ControladorTipoAlojamiento(JButton botonTipoAlojamiento,JButton botonCancelar,JRadioButton radioHotel,JRadioButton radioCasa,JRadioButton radioApartamento){
        botonTipoAlojamiento.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                comprobarSelected(radioHotel,radioCasa,radioApartamento);
                
                
            }

        });
        
        botonCancelar.addMouseListener(new MouseAdapter(){
             public void mouseClicked(MouseEvent a){
                cancelar();
    }
             });
        
            }
            
          public char comprobarSelected(JRadioButton radioHotel,JRadioButton radioCasa,JRadioButton radioApartamento ){
//              char tipoDeAlojamiento='n';
              if(radioHotel.isSelected()){
                VistaUbicacionHotel vistaUH=new VistaUbicacionHotel();        
                vistaUH.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
                vistaUH.setSize(905,720);
    vistaUH.setResizable(false);
                vistaUH.setLocationRelativeTo(null);
                vistaUH.setVisible(true);
                Alojamiento.alojamiento1.setTipoAlojamiento("H");
              }
              if(radioCasa.isSelected()){
                VistaUbicacionCasa vistaUC=new VistaUbicacionCasa();
                vistaUC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
                vistaUC.setSize(905,720);
    vistaUC.setResizable(false);
                vistaUC.setLocationRelativeTo(null);
                vistaUC.setVisible(true);
                Alojamiento.alojamiento1.setTipoAlojamiento("C");
              }
              if(radioApartamento.isSelected()){
                VistaUbicacionApartamento vistaUA=new VistaUbicacionApartamento();
                vistaUA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
                vistaUA.setSize(905,720);
    vistaUA.setResizable(false);
                vistaUA.setLocationRelativeTo(null);
                vistaUA.setVisible(true);
                Alojamiento.alojamiento1.setTipoAlojamiento("A");
              }
            return tipoDeAlojamiento;
          }
          
          public void cancelar(){
          JOptionPane.showMessageDialog(null,"Pedido cancelado. Volverá a la pantalla de inicio. ¡Hasta la proxima!");
            cantidad_insertada=0;
            VistaBienvenida vista=new VistaBienvenida();
            vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    vista.setSize(905,720);
    vista.setResizable(false);
    vista.setLocationRelativeTo(null);
    vista.setVisible(true);
          }
            
}
