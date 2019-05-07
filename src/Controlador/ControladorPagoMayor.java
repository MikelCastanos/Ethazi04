
package Controlador;

import BBDD.Conexion;
import Modelo.Modelo;
import Vista.VistaBienvenida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import vista.VistaPagoMayor;
import static Controlador.ControladorPago.*;


public class ControladorPagoMayor {
    ControladorEstanciaSeleccionada contro=new ControladorEstanciaSeleccionada();
   public double calculo_preciototal= contro.precio1cents;
   public static int billete200=20000,billete100=10000,billete50=5000,billete20=2000,billete10=1000,billete5=500,moneda2=200,moneda1=100,moneda50c=50,moneda20c=20,moneda10c=10,moneda5c=5,moneda2c=2,moneda1c=1;
    VistaPagoMayor pagomayor;
    Modelo modelo;
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
    Conexion conn= new Conexion();
    conn.desconectar();
    cantidad_insertada=0;
    VistaBienvenida vistab=new VistaBienvenida();
    vistab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    vistab.setBounds(0,0,600,730);
    vistab.setVisible(true);
            
        }
}
