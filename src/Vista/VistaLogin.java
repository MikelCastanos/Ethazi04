/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorLogin;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author ikasleaETHAZI
 */
public class VistaLogin extends JFrame {

    
    JLabel mensaje_login, label_usuario, label_password,mensaje_registro,label_dni_registro,label_nombre_registro,label_password_registro,label_password_registro2;
    public static JTextField dniField,registroDniField,registroNombreField;
    public static JPasswordField contrasenaField,registroContrasenaField,registroContrasenaField2;
    public static JButton botonLogin,botonRegistro,botonCambio;
    public static JFormattedTextField dniField2;
    
    JLabel mensaje_cambiar_password,label_cambio_dni,label_cambio_password,label_cambio_password2;
    public static JTextField cambioPasswordDNI;
    public static JPasswordField cambioPasswordPass,cambioPasswordNueva;
    
    public VistaLogin(){
        
        botonLogin=new javax.swing.JButton();
        botonRegistro=new javax.swing.JButton();
        botonCambio=new javax.swing.JButton();
        setLayout(null);
        
        
        //Login
        mensaje_login=new JLabel("Usuario Registrado");
        mensaje_login.setBounds(50,70,120,30);
        add(mensaje_login);
        
        label_usuario=new JLabel("DNI:");
        label_usuario.setBounds(10,120,120,30);
        add(label_usuario);
        
        label_password=new JLabel("Contraseña:");
        label_password.setBounds(10,160,200,30);
        add(label_password);
        
        dniField=new JTextField("");
        dniField.setBounds(100,120,120,30);
        add(dniField);
        
        contrasenaField=new JPasswordField("");
        contrasenaField.setBounds(100,160,120,30);
        add(contrasenaField);
        
        botonLogin=new JButton("Entrar");
        botonLogin.setBounds(100,200,120,30);
        add(botonLogin);
        
        
        // Registro
        
        mensaje_registro=new JLabel("Nuevo Usuario");
        mensaje_registro.setBounds(400,70,120,30);
        add(mensaje_registro);
        
        label_dni_registro=new JLabel("DNI:");
        label_dni_registro.setBounds(300,120,120,30);
        add(label_dni_registro);
        
        registroDniField=new JTextField("");
        registroDniField.setBounds(425,120,120,30);
        add(registroDniField);
        
        label_nombre_registro=new JLabel("Nombre:");
        label_nombre_registro.setBounds(300,160,120,30);
        add(label_nombre_registro);
                
        registroNombreField=new JTextField("");
        registroNombreField.setBounds(425,160,120,30);
        add(registroNombreField);
        
        
        label_password_registro=new JLabel("Contraseña:");
        label_password_registro.setBounds(300,200,120,30);
        add(label_password_registro);
                
        registroContrasenaField=new JPasswordField("");
        registroContrasenaField.setBounds(425,200,120,30);
        add(registroContrasenaField);      
        
        label_password_registro=new JLabel("Repita la Contraseña:");
        label_password_registro.setBounds(300,240,150,30);
        add(label_password_registro);
        
        registroContrasenaField2=new JPasswordField("");
        registroContrasenaField2.setBounds(425,240,120,30);
        add(registroContrasenaField2);  
        

        
        botonRegistro=new JButton("Registrar");
        botonRegistro.setBounds(425,280,120,30);
        add(botonRegistro);
        
        
        //Cambio Password
                mensaje_cambiar_password=new JLabel("Cambiar Contraseña");
        mensaje_cambiar_password.setBounds(50,370,120,30);
        add(mensaje_cambiar_password);
        
                label_cambio_dni=new JLabel("DNI:");
        label_cambio_dni.setBounds(10,400,120,30);
        add(label_cambio_dni);
        
        
        cambioPasswordDNI=new JTextField("");
        cambioPasswordDNI.setBounds(120,400,120,30);
        add(cambioPasswordDNI);
        
        label_cambio_password=new JLabel("Contraseña vieja:");
        label_cambio_password.setBounds(10,440,200,30);
        add(label_cambio_password);
        
                cambioPasswordPass=new JPasswordField("");
        cambioPasswordPass.setBounds(120,440,120,30);
        add(cambioPasswordPass);
        
                label_cambio_password2=new JLabel("Contraseña nueva:");
        label_cambio_password2.setBounds(10,480,200,30);
        add(label_cambio_password2);
        
                cambioPasswordNueva=new JPasswordField("");
        cambioPasswordNueva.setBounds(120,480,120,30);
        add(cambioPasswordNueva);
        
                botonCambio=new JButton("Registrar");
        botonCambio.setBounds(120,520,120,30);
        add(botonCambio);
        
        ControladorLogin contL=new ControladorLogin(botonLogin,botonRegistro,botonCambio,cambioPasswordDNI,cambioPasswordPass,cambioPasswordNueva,contrasenaField,dniField,registroContrasenaField,registroContrasenaField2,registroNombreField,registroContrasenaField2);
        
  
    }




    public static JTextField getDniField() {
        return dniField;
    }

    /*
    public static void main(String[] args) {
    VistaLogin vista=new VistaLogin();
    vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    vista.setBounds(0,0,600,600);
    vista.setVisible(true);
    }
     */
    public static void setDniField(JTextField dniField) {
        VistaLogin.dniField = dniField;
    }

    public static JPasswordField getContrasenaField() {
        return contrasenaField;
    }

    public void setContrasenaField(JPasswordField contrasenaField) {
        this.contrasenaField = contrasenaField;
    }

    public static JButton getBotonLogin() {
        return botonLogin;
    }

    public static void setBotonLogin(JButton botonLogin) {
        VistaLogin.botonLogin = botonLogin;
    }
}
