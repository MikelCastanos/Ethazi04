/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Modelo.Complementos;
import Vista.VistaComplementosCasa;
import Vista.VistaUnaCasa;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import static Controlador.ControladorPago.cantidad_insertada;
import Vista.VistaBienvenida;
import javax.swing.JOptionPane;


/**
 *
 * @author shabi
 */
public class ControladorComplementosCasa {
    
        public ControladorComplementosCasa(JButton botonCancelar,JButton botonSiguienteComplementosCasa,JCheckBox checkboxWifiCasa,JCheckBox checkboxPiscinaCasa,JCheckBox checkboxSpaCasa,JCheckBox checkboxParkingCasa,JCheckBox checkboxAACasa,JCheckBox checkboxRestauranteCasa,JCheckBox checkboxBarCasa,JCheckBox checkboxGymCasa){
        botonSiguienteComplementosCasa.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                
                siguienteVentana();
                printCheckBox();
                comprobarCheckBoxesComplementosCasa();
                printCheckBox();
            }
            
        });
    botonCancelar.addMouseListener(new MouseAdapter(){
             public void mouseClicked(MouseEvent a){
                cancelar();
    }
             });
        
            }

public void cancelar(){
          JOptionPane.showMessageDialog(null,"Pedido cancelado. Volverá a la pantalla de inicio. ¡Hasta la proxima!");
            cantidad_insertada=0;
            VistaBienvenida iniciostart=new VistaBienvenida();
            iniciostart.setSize(905,720);
    iniciostart.setResizable(false);    iniciostart.setLocationRelativeTo(null);
    iniciostart.setVisible(true);
            iniciostart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            iniciostart.setVisible(true);
          
          }
        
        public void siguienteVentana(){
            VistaUnaCasa vistab=new VistaUnaCasa();
                   vistab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
                   vistab.setSize(905,720);    
                   vistab.setResizable(false);
                   vistab.setLocationRelativeTo(null);
                   vistab.setVisible(true);
        }
        
        public void comprobarCheckBoxesComplementosCasa(){
            
            
            
            if(VistaComplementosCasa.checkboxWifiCasa.isSelected()){
            Modelo.Complementos.casaComplementos.setWifi(true);
        }
        
            if(VistaComplementosCasa.checkboxSpaCasa.isSelected()){
            Modelo.Complementos.casaComplementos.setSpa(true);
        }

            if(VistaComplementosCasa.checkboxPiscinaCasa.isSelected()){
            Modelo.Complementos.casaComplementos.setPiscina(true);
        }

            if(VistaComplementosCasa.checkboxParkingCasa.isSelected()){
            Modelo.Complementos.casaComplementos.setParking(true);
        }

            if(VistaComplementosCasa.checkboxAACasa.isSelected()){
            Modelo.Complementos.casaComplementos.setAireacondicionado(true);
        }

            if(VistaComplementosCasa.checkboxRestauranteCasa.isSelected()){
            Modelo.Complementos.casaComplementos.setRestaurante(true);
        }

            if(VistaComplementosCasa.checkboxBarCasa.isSelected()){
            Modelo.Complementos.casaComplementos.setBar(true);
        }

            if(VistaComplementosCasa.checkboxGymCasa.isSelected()){
            Modelo.Complementos.casaComplementos.setGimnasio(true);
        }
        
        }
        
      public void printCheckBox(){
            System.out.println(Modelo.Complementos.casaComplementos.isWifi());
            System.out.println(Modelo.Complementos.casaComplementos.isSpa());
            System.out.println(Modelo.Complementos.casaComplementos.isAireacondicionado());
            System.out.println(Modelo.Complementos.casaComplementos.isBar());
            System.out.println(Modelo.Complementos.casaComplementos.isGimnasio());
            System.out.println(Modelo.Complementos.casaComplementos.isRestaurante());
            System.out.println(Modelo.Complementos.casaComplementos.isParking());
            System.out.println(Modelo.Complementos.casaComplementos.isPiscina());
            
            
           
                  }    
    
        
      //  checkboxWifiCasa,checkboxPiscinaCasa,checkboxSpaCasa,checkboxParkingCasa,checkboxAACasa,checkboxRestauranteCasa,checkboxBarCasa,checkboxGymCasa
}
