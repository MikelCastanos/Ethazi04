/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Promocion;
import Modelo.Usuario;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import vista.VistaPago;


/**
 *
 * @author shabi
 */
public class ControladorResumenDescuento {
    
    public ControladorResumenDescuento(){}
    
                        public ControladorResumenDescuento(JButton botonCancelar,JButton botonSiguiente,JTextField fieldCodigoDescuento){
        botonSiguiente.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                System.out.println("Probando");
                cogerCodigoDescuento();
                
               
                
                
            }
            
        });}
                        
                        
                        public void cogerCodigoDescuento(){
                        Promocion.promocion.setCodigoDescuento(Vista.VistaResumenDescuento.fieldCodigoDescuento.getText());;
                            
                            if(Vista.VistaResumenDescuento.fieldCodigoDescuento.getText().equals("")){
                                     VistaPago vista=new VistaPago();
                                     vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
                                     vista.setSize(1000,700);
                                     vista.setLocationRelativeTo(null);
                                     vista.setVisible(true);
                            }
                            
                            else{
                               Promocion.promocion.checkPromocion(); 
                                
                            }
                        }
    
                        
                        public void irPago(){
                                     VistaPago vista=new VistaPago();
                                     vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
                                     vista.setSize(1000,700);
                                     vista.setLocationRelativeTo(null);
                                     vista.setVisible(true);
                        }
}
