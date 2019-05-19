/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import static Controlador.ControladorPago.cantidad_insertada;
import Modelo.Usuario;
import Vista.VistaBienvenida;
import Vista.VistaTipoAlojamiento;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import vista.VistaPago;
import java.util.*;

/**
 *
 * @author ibilbao
 */
public class ControladorCondiciones extends JFrame {
    
    static char aceptado;
            public ControladorCondiciones(JButton botonTipoAlojamiento,JButton botonCancelar,JRadioButton radioCondiciones){
        botonTipoAlojamiento.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                comprobarSelected(radioCondiciones);
                
                
            }

        });
        
        botonCancelar.addMouseListener(new MouseAdapter(){
             public void mouseClicked(MouseEvent a){
                cancelar();
    }
             });
        
            }
            
          public char comprobarSelected(JRadioButton radioCondiciones){
//              char tipoDeAlojamiento='n';
              if(radioCondiciones.isSelected()){
                  
                  
                   SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
                    Date fechatos=Calendar.getInstance().getTime();
                    String formatted= format1.format(fechatos);
                  Usuario.usuarioLogin.setFechaTOS(formatted);
                  System.out.println(Usuario.usuarioLogin.getFechaTOS());
                  
                  
                VistaTipoAlojamiento vistaUH=new VistaTipoAlojamiento();        
                vistaUH.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    vistaUH.setSize(905,720);
    vistaUH.setResizable(false);
    vistaUH.setLocationRelativeTo(null);
    vistaUH.setVisible(true);
                aceptado= 'S';
              }else{
              JOptionPane.showMessageDialog(null,"Tienes que aceptar los terminos y las condiciones para poder continuar.");
              }
              
            return aceptado;
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
