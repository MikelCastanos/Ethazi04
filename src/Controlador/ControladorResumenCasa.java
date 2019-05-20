/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Promocion;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import vista.VistaPago;

/**
 *
 * @author ira_a
 */
public class ControladorResumenCasa {
    
            public ControladorResumenCasa(JButton botonCancelar,JButton botonSiguiente,JTextField fieldCodigoDescuento){
        botonSiguiente.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                System.out.println("Probando");
                cogerCodigoDescuento();
                
               
                
                
            }
            
        });}
            
                                    
                        public void cogerCodigoDescuento(){
                        Promocion.promocion.setCodigoDescuento(Vista.VistaResumenCasa.fieldCodigoDescuento.getText());;
                            
                            if(Vista.VistaResumenCasa.fieldCodigoDescuento.getText().equals("")){
                                     VistaPago vistab=new VistaPago();
                                     vistab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
                                     vistab.setSize(905,720);    
                                     vistab.setResizable(false);
                                     vistab.setLocationRelativeTo(null);
                                     vistab.setVisible(true);
                            }
                            
                            else{
                               Promocion.promocion.checkPromocion(); 
                                
                            }
                        }
    
}
