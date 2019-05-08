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
    
    protected  String dniUsuarioLogin;
    protected  String passwordLogin;
    protected  String dniUsuarioRegistro;
    protected  String passwordRegistro,passwordRegistro2;
    protected  String nombreRegistro;

    public static Usuario usuarioLogin=new Usuario();
    public static Usuario usuarioRegistro=new Usuario();
    
    
    public String getDniUsuarioLogin() {
        return dniUsuarioLogin;
    }

    public void setDniUsuarioLogin(String dniUsuarioLogin) {
        this.dniUsuarioLogin = dniUsuarioLogin;
    }

    public String getPasswordLogin() {
        return passwordLogin;
    }

    public void setPasswordLogin(String passwordLogin) {
        this.passwordLogin = passwordLogin;
    }

    public String getDniUsuarioRegistro() {
        return dniUsuarioRegistro;
    }

    public void setDniUsuarioRegistro(String dniUsuarioRegistro) {
        this.dniUsuarioRegistro = dniUsuarioRegistro;
    }

    public String getPasswordRegistro() {
        return passwordRegistro;
    }

    public void setPasswordRegistro(String passwordRegistro) {
        this.passwordRegistro = passwordRegistro;
    }

    public String getPasswordRegistro2() {
        return passwordRegistro2;
    }

    public void setPasswordRegistro2(String passwordRegistro2) {
        this.passwordRegistro2 = passwordRegistro2;
    }

    public String getNombreRegistro() {
        return nombreRegistro;
    }

    public void setNombreRegistro(String nombreRegistro) {
        this.nombreRegistro = nombreRegistro;
    }

   
    
    static PreparedStatement pst = null;
    static ResultSet rs = null;
    static Connection con = null;
    
    public  void consultaLogin(){
        
        //        Instanciar BBDD
        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();
        com.mysql.jdbc.Connection con= conexion.conectar();
        

        


        String query="select * from usuario where dni='"+Usuario.usuarioLogin.getDniUsuarioLogin()+"' and contrasena='"+ Usuario.usuarioLogin.getPasswordLogin()+"'";
        

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
    
    public  void consultaRegistro(){
                
        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();
        com.mysql.jdbc.Connection con= conexion.conectar();
        
        System.out.println(Usuario.usuarioRegistro.getDniUsuarioRegistro()+" "+Usuario.usuarioRegistro.getNombreRegistro()+" "+Usuario.usuarioRegistro.getPasswordRegistro());
        
        String query="insert into usuario (dni,nombre_usuario, contrasena) values('"+Usuario.usuarioRegistro.getDniUsuarioRegistro()+"','"+Usuario.usuarioRegistro.getNombreRegistro()+"','"+Usuario.usuarioRegistro.getPasswordRegistro()+"')";
        
        consultas.insertarDatosBD(query);

    }
    
    
    
    
    
}
