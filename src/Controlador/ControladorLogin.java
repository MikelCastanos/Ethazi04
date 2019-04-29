/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import static Modelo.ConsultaLogin.consultaLogin;
import Modelo.Modelo;
import Modelo.Usuario;
import Vista.VistaBienvenida;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import Vista.VistaLogin;
import Vista.VistaUbicacion;
import java.awt.event.ActionListener;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author shabi
 */
public class ControladorLogin {

    
            public ControladorLogin(JButton botonLogin,JPasswordField contrasenaField, JTextField usuarioField){
        botonLogin.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                
                
                cogerDatos(contrasenaField,usuarioField);
                testLogin();
            }
            
        });
    }
            
            public void testLogin(){
                consultaLogin();
            }
            
            public void cogerDatos(JPasswordField contrasenaField, JTextField usuarioField){
                Usuario.setPasswordLogin(String.valueOf(VistaLogin.contrasenaField.getPassword()));
                Usuario.setDniUsuarioLogin(VistaLogin.dniField.getText());
                System.out.println(Usuario.getPasswordLogin()+" "+Usuario.getDniUsuarioLogin());
         }
}
