package Controlador;

import Modelo.Alojamiento;
import Modelo.Apartamento;
import Modelo.Casa;
import Modelo.Habitacion;
import Modelo.Hotel;
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
        
                System.out.println(Hotel.hotel1.getPrecioFinal());
            if(Vista.VistaResumenHotel.fieldCodigoDescuento.getText().equals("")){
                     
                     VistaPago vistab=new VistaPago();
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