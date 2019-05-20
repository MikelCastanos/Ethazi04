
package Controlador;

import BBDD.Conexion;

import Vista.VistaBienvenida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import vista.VistaPagoMayor;
import static Controlador.ControladorPago.*;
import Modelo.Alojamiento;


public class ControladorPagoMayor {

    
   public double calculo_preciototal= Alojamiento.alojamiento1.getPrecioFinal()*100;
   public final static int billete200=20000,billete100=10000,billete50=5000,billete20=2000,billete10=1000,billete5=500,moneda2=200,moneda1=100,moneda50c=50,moneda20c=20,moneda10c=10,moneda5c=5,moneda2c=2,moneda1c=1;
    VistaPagoMayor pagomayor;
    
    ActionListener actionListener;
    
        public ControladorPagoMayor(JButton terminar_compra){
        terminar_compra.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                impr();
                
            }
            
        });
    }
        public void contol(){        
        actionListener = new ActionListener() {
              public void actionPerformed(ActionEvent actionEvent) {  
                  impr();
              }
        };
            
    }
        
        public void impr(){
                ControladorPago controp=new ControladorPago();
        Conexion conn= new Conexion();
        conn.desconectar();
        controp.cantidad_insertada=0;
        controp.precioFinalcents=0; controp.precioFinal=0;
           cantidad_insertada=0;
        VistaBienvenida vistab=new VistaBienvenida();
        vistab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vistab.setSize(905,720);
    vistab.setResizable(false);    vistab.setLocationRelativeTo(null);
    vistab.setVisible(true);
        vistab.setVisible(true);
            
        }
}
