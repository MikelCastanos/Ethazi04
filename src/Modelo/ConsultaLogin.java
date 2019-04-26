/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.VistaLogin;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import BBDD.Conexion;
import BBDD.Consultas;
import Vista.VistaUbicacion;
import javax.swing.JFrame;

/**
 *
 * @author shabi
 */
public class ConsultaLogin {
    
    static PreparedStatement pst = null;
    static ResultSet rs = null;
    static Connection con = null;
    
    public static void consultaLogin(){
        
        //        Instanciar BBDD
        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();
        com.mysql.jdbc.Connection con= conexion.conectar();
        
        String passLogin = new String(VistaLogin.contrasenaField.getPassword());
        String usuarioLogin = VistaLogin.usuarioField.getText();
        System.out.println(usuarioLogin);
        System.out.println(passLogin);
        String query="select * from usuario where nombre_usuario='"+usuarioLogin+"' and contrasena='"+passLogin+"'";
        

        try{
           //        Llamamos al metodo de consultasLogin y le pasamos la conexion y la consulta
        ResultSet rs= consultas.consultaBD(con, query);
            if(rs.next())
            {
            VistaUbicacion vistau=new VistaUbicacion();
            vistau.setBounds(0,0,600,730);
            vistau.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            vistau.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Usuario y/o Contraseña incorrectos");
            }
            }
            catch(SQLException | HeadlessException ex)
            {
                JOptionPane.showMessageDialog(null,ex);
            }
    }
    
}
