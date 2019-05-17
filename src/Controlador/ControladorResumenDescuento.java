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


/**
 *
 * @author shabi
 */
public class ControladorResumenDescuento {
    
                        public ControladorResumenDescuento(JButton botonCancelar,JButton botonSiguiente,JTextField fieldCodigoDescuento){
        botonSiguiente.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                System.out.println("Probando");
                cogerCodigoDescuento();
                System.out.println(Promocion.promocion.getCodigoDescuento());
                Promocion.promocion.checkPromocion();
                
            }
            
        });}
                        
                        
                        public void cogerCodigoDescuento(){
                            Promocion.promocion.setCodigoDescuento(Vista.VistaResumenDescuento.fieldCodigoDescuento.getText());;
                        }
    
}
