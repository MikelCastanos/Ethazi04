/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;



import Modelo.Usuario;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import Vista.VistaLogin;
import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author shabi
 */
public class ControladorLogin {

    
            public ControladorLogin(JButton botonBorrar,JTextField dniBorrarUsuario,JPasswordField passwordBorrarUsuario,JButton botonLogin,JButton botonRegistro,JButton botonCambio,
                    JTextField cambioPasswordDNI, JPasswordField cambioPasswordPass, JPasswordField cambioPasswordNueva,JPasswordField contrasenaField, JTextField usuarioField,
                    JPasswordField registroContrasenaField,JTextField registroDniField,JTextField registroNombreField,JPasswordField registroContrasenaField2,JDateChooser fecha_nacimiento,JTextField registroApellidoField){
        botonLogin.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                
                
                cogerDatos(contrasenaField,usuarioField);
                testLogin();
            }
            
        });
        
        
                botonRegistro.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                
                cogerDatosRegistro(registroContrasenaField,registroContrasenaField2,registroDniField,registroNombreField, fecha_nacimiento, registroApellidoField);
                llamarRegistro();
                
            }
            
        });
                botonCambio.addMouseListener(new MouseAdapter(){
                            public void mouseClicked(MouseEvent e){
                
                cogerDatosCambio();
                Modelo.Usuario.usuarioCambio.consultaLoginCambioPassword();
                
            }
            
        });
                
                botonBorrar.addMouseListener(new MouseAdapter(){
                            public void mouseClicked(MouseEvent e){
                
                cogerDatosBorrar();
                Modelo.Usuario.usuarioBorrar.consultaBorrarUsuario();
                //Modelo.Usuario.usuarioCambio.consultaLoginCambioPassword();
                
            }
            
        });
    }
            
            public void testLogin(){
                Modelo.Usuario.usuarioLogin.consultaLogin();
            }
            
            public void llamarRegistro(){
                if(Usuario.usuarioRegistro.getPasswordRegistro().equals(Usuario.usuarioRegistro.getPasswordRegistro2())){
                Modelo.Usuario.usuarioRegistro.consultaRegistro();
                    JOptionPane.showMessageDialog(null,"Ahora puede acceder con su usuario y contraseña");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Las contraseñas no coinciden");
                }
                
            }
            

            
            
            public void cogerDatos(JPasswordField contrasenaField, JTextField usuarioField){
                Usuario.usuarioLogin.setPasswordLogin(String.valueOf(VistaLogin.contrasenaField.getPassword()));
                Usuario.usuarioLogin.setDniUsuarioLogin(VistaLogin.dniField.getText());
                System.out.println(Usuario.usuarioLogin.getPasswordLogin()+" "+Usuario.usuarioLogin.getDniUsuarioLogin());
         }
            
            
            public void cogerDatosRegistro(JPasswordField registroContrasenaField, JPasswordField registroContrasenaField2, JTextField registroDniField,JTextField registroNombreField, JDateChooser fecha_nacimiento,JTextField registroApellidoField){
                Usuario.usuarioRegistro.setDniUsuarioRegistro(VistaLogin.registroDniField.getText());
                Usuario.usuarioRegistro.setPasswordRegistro(String.valueOf(VistaLogin.registroContrasenaField.getPassword()));
                Usuario.usuarioRegistro.setPasswordRegistro2(String.valueOf(VistaLogin.registroContrasenaField2.getPassword()));
                Usuario.usuarioRegistro.setNombreRegistro(VistaLogin.registroNombreField.getText());
                Usuario.usuarioRegistro.setApellido(VistaLogin.registroApellidoField.getText());
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String date = sdf.format(fecha_nacimiento.getDate());
                Usuario.usuarioRegistro.setFechaNacimiento(date);
                System.out.println(Usuario.usuarioRegistro.getDniUsuarioRegistro()+" "+Usuario.usuarioRegistro.getNombreRegistro()+" "+Usuario.usuarioRegistro.getApellido()+" "+Usuario.usuarioRegistro.getPasswordRegistro()+" "+Usuario.usuarioRegistro.getPasswordRegistro2()
                        +" "+Usuario.usuarioRegistro.getFechaNacimiento());
            }
            
            
            public void cogerDatosCambio(){
                Usuario.usuarioCambio.setDniCambioPassword(VistaLogin.cambioPasswordDNI.getText());
                Usuario.usuarioCambio.setPasswordViejaCambioPassword(String.valueOf(VistaLogin.cambioPasswordPass.getPassword()));
                Usuario.usuarioCambio.setPasswordNuevaCambioPassword2(String.valueOf(VistaLogin.cambioPasswordNueva.getPassword()));
                System.out.println(Usuario.usuarioCambio.getDniCambioPassword());
                System.out.println(Usuario.usuarioCambio.getPasswordViejaCambioPassword());
                System.out.println(Usuario.usuarioCambio.getPasswordNuevaCambioPassword2());
            }
            
            public void cogerDatosBorrar(){
                Usuario.usuarioBorrar.setDniUsuarioBorrar(VistaLogin.dniBorrarUsuario.getText());
                Usuario.usuarioBorrar.setPasswordUsuarioBorrar(String.valueOf(VistaLogin.passwordBorrarUsuario.getPassword()));
                System.out.println(Usuario.usuarioBorrar.getDniUsuarioBorrar());
                System.out.println(Usuario.usuarioBorrar.getPasswordUsuarioBorrar());
                
            }
            
}
