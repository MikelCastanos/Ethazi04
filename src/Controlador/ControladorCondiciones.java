/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import static Controlador.ControladorPago.cantidad_insertada;
import Vista.VistaBienvenida;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import vista.VistaPago;

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
                VistaPago vistaUH=new VistaPago();        
                vistaUH.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                vistaUH.setBounds(0,0,600,725);
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
            VistaBienvenida iniciostart=new VistaBienvenida();
            iniciostart.setBounds(0,0,600,730);
            iniciostart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            iniciostart.setVisible(true);
          
          }
    
}
