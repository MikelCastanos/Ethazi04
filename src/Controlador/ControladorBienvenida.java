/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author ikasleaETHAZI
 */
import Vista.VistaBienvenida;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;
import Vista.*;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;



public class ControladorBienvenida {
    
    VistaBienvenida vista;
    VistaUbicacionHotel vista2;
    
    ActionListener actionListener;
    
        public ControladorBienvenida(JButton boton_siguiente){
        boton_siguiente.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                abrirVentanaLogin();
                
                
            }
            
        });
    }
        
        public static void abrirVentanaLogin(){
       VistaLogin vista=new VistaLogin();
       vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    vista.setSize(905,720);
    vista.setResizable(false);
    vista.setLocationRelativeTo(null);
    vista.setVisible(true);
    
        }
    
    

    
    
    
}
    
    
    
    
    
    
    
    
    
    
    
    
    /*public ControladorVista(JButton boton_siguiente){
        
        boton_siguiente.addActionListener((ActionListener) this);
          
           VistaBienvenida vistab=new VistaBienvenida();
            vistab.setBounds(10,10,400,300);
            vistab.setVisible(true);
    
    
    }
    
    public void actionPerformed(ActionEvent e) {
    System.exit(0);
    }*/
    
  

   
    
    
    
    
   
