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
public class ControladorResumenHotel {
    
        public ControladorResumenHotel(JButton botonCancelar,JButton botonSiguiente,JTextField fieldCodigoDescuento){
        botonSiguiente.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                System.out.println("Probando");
                cogerCodigoDescuento();
                
               
                
                
            }
            
        });}
                        
                        
        public void cogerCodigoDescuento(){
        Promocion.promocion.setCodigoDescuento(Vista.VistaResumenHotel.fieldCodigoDescuento.getText());;

            if(Vista.VistaResumenHotel.fieldCodigoDescuento.getText().equals("")){
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
    
                        

}