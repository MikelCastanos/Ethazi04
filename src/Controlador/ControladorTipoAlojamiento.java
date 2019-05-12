package Controlador;

import static Controlador.ControladorPago.cantidad_insertada;
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
                vistaUH.setBounds(0,0,600,725);
                vistaUH.setVisible(true);
                tipoDeAlojamiento= 'H';
              }
              if(radioCasa.isSelected()){
                VistaUbicacionCasa vistaUC=new VistaUbicacionCasa();
                vistaUC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                vistaUC.setBounds(0,0,600,725);
                vistaUC.setVisible(true);
                tipoDeAlojamiento= 'C';
              }
              if(radioApartamento.isSelected()){
                VistaUbicacionApartamento vistaUA=new VistaUbicacionApartamento();
                vistaUA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                vistaUA.setBounds(0,0,600,725);
                vistaUA.setVisible(true);
                tipoDeAlojamiento= 'A';
              }
            return tipoDeAlojamiento;
          }
          
          public void cancelar(){
          JOptionPane.showMessageDialog(null,"Pedido cancelado. Volverá a la pantalla de inicio. ¡Hasta la proxima!");
            cantidad_insertada=0;
            VistaBienvenida iniciostart=new VistaBienvenida();
            iniciostart.setBounds(0,0,600,730);
            iniciostart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            iniciostart.setVisible(true);
          
          }
            
}
