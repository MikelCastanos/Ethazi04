/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import static Modelo.ConsultaLogin.consultaLogin;
import static Modelo.ConsultaLogin.consultaRegistro;
import Modelo.Usuario;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import Vista.VistaLogin;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author shabi
 */
public class ControladorLogin {

    
            public ControladorLogin(JButton botonLogin,JButton botonRegistro,JPasswordField contrasenaField, JTextField usuarioField,JPasswordField registroContrasenaField,JTextField registroDniField,JTextField registroNombreField,JPasswordField registroContrasenaField2){
        botonLogin.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                
                
                cogerDatos(contrasenaField,usuarioField);
                testLogin();
            }
            
        });
        
        
                botonRegistro.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                
                cogerDatosRegistro(registroContrasenaField,registroContrasenaField2,registroDniField,registroNombreField);
                llamarRegistro();
                
            }
            
        });
    }
            
            public void testLogin(){
                consultaLogin();
            }
            
            public void llamarRegistro(){
                if(Usuario.getPasswordRegistro().equals(Usuario.getPasswordRegistro2())){
                consultaRegistro();
                    JOptionPane.showMessageDialog(null,"Ahora puede acceder con su usuario y contraseña");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Las contraseñas no coinciden");
                }
                
            }
            
            
            
            public void cogerDatos(JPasswordField contrasenaField, JTextField usuarioField){
                Usuario.setPasswordLogin(String.valueOf(VistaLogin.contrasenaField.getPassword()));
                Usuario.setDniUsuarioLogin(VistaLogin.dniField.getText());
                System.out.println(Usuario.getPasswordLogin()+" "+Usuario.getDniUsuarioLogin());
         }
            
            
            public void cogerDatosRegistro(JPasswordField registroContrasenaField, JPasswordField registroContrasenaField2, JTextField registroDniField,JTextField registroNombreField){
                Usuario.setDniUsuarioRegistro(VistaLogin.registroDniField.getText());
                Usuario.setPasswordRegistro(String.valueOf(VistaLogin.registroContrasenaField.getPassword()));
                Usuario.setPasswordRegistro2(String.valueOf(VistaLogin.registroContrasenaField2.getPassword()));
                Usuario.setNombreRegistro(VistaLogin.registroNombreField.getText());
                System.out.println(Usuario.getDniUsuarioRegistro()+" "+Usuario.getNombreRegistro()+" "+Usuario.getPasswordRegistro()+" "+Usuario.getPasswordRegistro2());
            }
            
}
