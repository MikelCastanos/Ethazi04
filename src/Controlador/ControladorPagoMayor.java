
package Controlador;

import Modelo.Modelo;
import Vista.VistaBienvenida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import vista.VistaPagoMayor;


public class ControladorPagoMayor {

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
    
    VistaBienvenida vistab=new VistaBienvenida();
    vistab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    vistab.setBounds(0,0,600,850);
    vistab.setVisible(true);
            
        }
}
