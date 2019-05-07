/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
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

public class Usuario {
    
    protected static String dniUsuarioLogin;
    protected static String passwordLogin;
    protected static String dniUsuarioRegistro;
    protected static String passwordRegistro,passwordRegistro2;
    protected static String nombreRegistro;

    public static String getDniUsuarioLogin() {
        return dniUsuarioLogin;
    }

    public static void setDniUsuarioLogin(String dniUsuarioLogin) {
        Usuario.dniUsuarioLogin = dniUsuarioLogin;
    }



    public static String getPasswordLogin() {
        return passwordLogin;
    }

    public static void setPasswordLogin(String passwordLogin) {
        Usuario.passwordLogin = passwordLogin;
    }

    public static String getDniUsuarioRegistro() {
        return dniUsuarioRegistro;
    }

    public static void setDniUsuarioRegistro(String dniUsuarioRegistro) {
        Usuario.dniUsuarioRegistro = dniUsuarioRegistro;
    }

    public static String getPasswordRegistro() {
        return passwordRegistro;
    }

    public static void setPasswordRegistro(String passwordRegistro) {
        Usuario.passwordRegistro = passwordRegistro;
    }

    public static String getPasswordRegistro2() {
        return passwordRegistro2;
    }

    public static void setPasswordRegistro2(String passwordRegistro2) {
        Usuario.passwordRegistro2 = passwordRegistro2;
    }

    public static String getNombreRegistro() {
        return nombreRegistro;
    }

    public static void setNombreRegistro(String nombreRegistro) {
        Usuario.nombreRegistro = nombreRegistro;
    }
    
    static PreparedStatement pst = null;
    static ResultSet rs = null;
    static Connection con = null;
    
    public static void consultaLogin(){
        
        //        Instanciar BBDD
        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();
        com.mysql.jdbc.Connection con= conexion.conectar();
        

        


        String query="select * from usuario where dni='"+Usuario.getDniUsuarioLogin()+"' and contrasena='"+ Usuario.getPasswordLogin()+"'";
        

        try{
           //        Llamamos al metodo de consultasLogin y le pasamos la conexion y la consulta
        ResultSet rs= consultas.consultaBD(query);
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
    
    public static void consultaRegistro(){
                
        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();
        com.mysql.jdbc.Connection con= conexion.conectar();
        
        System.out.println(Usuario.getDniUsuarioRegistro()+" "+Usuario.getNombreRegistro()+" "+Usuario.getPasswordRegistro());
        
        String query="insert into usuario (dni,nombre_usuario, contrasena) values('"+Usuario.getDniUsuarioRegistro()+"','"+Usuario.getNombreRegistro()+"','"+Usuario.getPasswordRegistro()+"')";
        
        consultas.insertarDatosBD(query);

    }
    
    
    
    
    
}
