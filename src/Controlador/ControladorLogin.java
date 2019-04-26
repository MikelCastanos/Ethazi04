/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import static Modelo.ConsultaLogin.consultaLogin;
import Modelo.Modelo;
import Vista.VistaBienvenida;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import Vista.VistaLogin;
import Vista.VistaUbicacion;
import java.awt.event.ActionListener;

/**
 *
 * @author shabi
 */
public class ControladorLogin {

    
            public ControladorLogin(JButton botonLogin){
        botonLogin.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                testLogin();
                
                
            }
            
        });
    }
            
            public void testLogin(){
                consultaLogin();
            }
            
            
}
