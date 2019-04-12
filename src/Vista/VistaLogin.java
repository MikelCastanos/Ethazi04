/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author ikasleaETHAZI
 */
public class VistaLogin extends JFrame {
    
    JLabel mensaje_login, label_usuario, label_password;
    JTextField usuarioField;
    JPasswordField contrasenaField;
    JButton botonLogin;
    
    public VistaLogin(){
        
        botonLogin=new javax.swing.JButton();
        
        setLayout(null);
        
        mensaje_login=new JLabel("Usuario Registrado");
        mensaje_login.setBounds(50,70,120,30);
        add(mensaje_login);
        
        label_usuario=new JLabel("Usuario:");
        label_usuario.setBounds(10,120,120,30);
        add(label_usuario);
        
        label_password=new JLabel("Contraseña:");
        label_password.setBounds(10,160,200,30);
        add(label_password);
        
        usuarioField=new JTextField("");
        usuarioField.setBounds(100,120,120,30);
        add(usuarioField);
        
        contrasenaField=new JPasswordField("");
        contrasenaField.setBounds(100,160,120,30);
        add(contrasenaField);
        
                botonLogin=new JButton("Entrar");
        botonLogin.setBounds(100,200,120,30);
        add(botonLogin);
        
        
    }
    
    
    public static void main(String[] args) {
        VistaLogin vista=new VistaLogin();
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vista.setBounds(0,0,600,600);
        vista.setVisible(true);
    }
    
}
