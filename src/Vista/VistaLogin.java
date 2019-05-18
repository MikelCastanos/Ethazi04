/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorLogin;
import com.toedter.calendar.JDateChooser;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import static vista.VistaPago.logo1;

/**
 *
 * @author ikasleaETHAZI
 */
public class VistaLogin extends JFrame {

    
    JLabel mensaje_login, label_usuario, label_password,mensaje_registro,label_dni_registro,label_nombre_registro,label_password_registro,label_password_registro2,label_fecha_nacimiento,label_apellido_registro;
    public static JTextField dniField,registroDniField,registroNombreField,registroApellidoField;
    public static JPasswordField contrasenaField,registroContrasenaField,registroContrasenaField2;
    public static JButton botonLogin,botonRegistro,botonCambio,botonBorrar;
    public static JFormattedTextField dniField2;
    public static JDateChooser fecha_nacimiento;
    
    JLabel mensaje_cambiar_password,label_cambio_dni,label_cambio_password,label_cambio_password2;
    public static JTextField cambioPasswordDNI;
    public static JPasswordField cambioPasswordPass,cambioPasswordNueva;
    
    JLabel mensaje_borrar_usuario, label_dni_borrar_usuario, label_password_borrar_usuario;
    public static JTextField dniBorrarUsuario;
    public static JPasswordField passwordBorrarUsuario;
    
    public VistaLogin(){
        
        botonLogin=new javax.swing.JButton();
        botonRegistro=new javax.swing.JButton();
        botonCambio=new javax.swing.JButton();
        botonBorrar=new javax.swing.JButton();
        setLayout(null);
        
        
        //Login
        mensaje_login=new JLabel("Usuario Registrado");
        mensaje_login.setBounds(190,70,120,30);
        add(mensaje_login);
        
        label_usuario=new JLabel("DNI:");
        label_usuario.setBounds(150,120,120,30);
        add(label_usuario);
        
        label_password=new JLabel("Contraseña:");
        label_password.setBounds(150,160,200,30);
        add(label_password);
        
        dniField=new JTextField("");
        dniField.setBounds(240,120,120,30);
        add(dniField);
        
        contrasenaField=new JPasswordField("");
        contrasenaField.setBounds(240,160,120,30);
        add(contrasenaField);
        
        botonLogin=new JButton("Entrar");
        botonLogin.setBounds(240,200,120,30);
        add(botonLogin);
        
        
        // Registro
        
       mensaje_registro=new JLabel("Nuevo Usuario");
        mensaje_registro.setBounds(190,300,120,30);
        add(mensaje_registro);
        
        label_dni_registro=new JLabel("DNI:");
        label_dni_registro.setBounds(150,350,120,30);
        add(label_dni_registro);
        
        registroDniField=new JTextField("");
        registroDniField.setBounds(240,350,120,30);
        add(registroDniField);
        
        label_nombre_registro=new JLabel("Nombre:");
        label_nombre_registro.setBounds(150,390,120,30);
        add(label_nombre_registro);
                
        registroNombreField=new JTextField("");
        registroNombreField.setBounds(240,390,120,30);
        add(registroNombreField);
        
        label_apellido_registro=new JLabel("Apellido:");
        label_apellido_registro.setBounds(150,430,120,30);
        add(label_apellido_registro);
        
        registroApellidoField=new JTextField("");
        registroApellidoField.setBounds(240,430,120,30);
        add(registroApellidoField);
        
        label_password_registro=new JLabel("Contraseña:");
        label_password_registro.setBounds(150,470,120,30);
        add(label_password_registro);
                
        registroContrasenaField=new JPasswordField("");
        registroContrasenaField.setBounds(240,470,120,30);
        add(registroContrasenaField);      
        
        label_password_registro=new JLabel("Repita la Contraseña:");
        label_password_registro.setBounds(150,510,150,30);
        add(label_password_registro);
        
        registroContrasenaField2=new JPasswordField("");
        registroContrasenaField2.setBounds(290,510,120,30);
        add(registroContrasenaField2);  
        
        label_fecha_nacimiento=new JLabel("Fecha de nacimiento:");
        label_fecha_nacimiento.setBounds(150,550,120,30);
        add(label_fecha_nacimiento);
        
        fecha_nacimiento=new JDateChooser();
        fecha_nacimiento.setBounds(290,550,120,30);
        add(fecha_nacimiento);
        
        botonRegistro=new JButton("Registrar");
        botonRegistro.setBounds(290,590,120,30);
        add(botonRegistro);
        
        
        //Cambio Password
        mensaje_cambiar_password=new JLabel("Cambiar Contraseña");
        mensaje_cambiar_password.setBounds(600,300,120,30);
        add(mensaje_cambiar_password);
        
        label_cambio_dni=new JLabel("DNI:");
        label_cambio_dni.setBounds(540,350,120,30);
        add(label_cambio_dni);
        
        
        cambioPasswordDNI=new JTextField("");
        cambioPasswordDNI.setBounds(630,350,120,30);
        add(cambioPasswordDNI);
        
        label_cambio_password=new JLabel("Contraseña vieja:");
        label_cambio_password.setBounds(540,390,200,30);
        add(label_cambio_password);
        
                cambioPasswordPass=new JPasswordField("");
        cambioPasswordPass.setBounds(680,390,120,30);
        add(cambioPasswordPass);
        
                label_cambio_password2=new JLabel("Contraseña nueva:");
        label_cambio_password2.setBounds(540,430,200,30);
        add(label_cambio_password2);
        
                cambioPasswordNueva=new JPasswordField("");
        cambioPasswordNueva.setBounds(680,430,120,30);
        add(cambioPasswordNueva);
        
                botonCambio=new JButton("Cambiar");
        botonCambio.setBounds(630,470,120,30);
        add(botonCambio);
        
        
        //Borrar Usuario
        mensaje_borrar_usuario=new JLabel("Eliminar Usuario");
        mensaje_borrar_usuario.setBounds(600,70,120,30);
        add(mensaje_borrar_usuario);
        
        
        label_dni_borrar_usuario=new JLabel("DNI:");
        label_dni_borrar_usuario.setBounds(540,120,120,30);
        add(label_dni_borrar_usuario);
        
        dniBorrarUsuario=new JTextField("");
        dniBorrarUsuario.setBounds(630,120,120,30);
        add(dniBorrarUsuario);
        
        label_password_borrar_usuario=new JLabel("Contraseña:");
        label_password_borrar_usuario.setBounds(540,160,120,30);
        add(label_password_borrar_usuario);
        
                passwordBorrarUsuario=new JPasswordField("");
        passwordBorrarUsuario.setBounds(630,160,120,30);
        add(passwordBorrarUsuario);
        
        botonBorrar=new JButton("Eliminar");
        botonBorrar.setBounds(630,200,120,30);
        add(botonBorrar);
        
        
            /*ImageIcon icon=new ImageIcon("src//images/Bidaion.png");
            JLabel logo2 = new JLabel(icon);
            logo2.setSize(575,50);
            add(logo2);
            validate();*/
        
            ImageIcon icono=new ImageIcon("src//images/fondo.png");
            logo1=new JLabel(icono);
            logo1.setSize(900,690);
            add(logo1);
            validate();
        
        ControladorLogin contL=new ControladorLogin(botonBorrar,dniBorrarUsuario,passwordBorrarUsuario,botonLogin,botonRegistro,botonCambio,cambioPasswordDNI,cambioPasswordPass,cambioPasswordNueva,contrasenaField,dniField,registroContrasenaField,
            registroContrasenaField2,registroNombreField,registroContrasenaField2,fecha_nacimiento,registroApellidoField);
        
  
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
