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
import Vista.VistaCondiciones;
import Vista.VistaTipoAlojamiento;
import Vista.VistaUbicacionHotel;
import javax.swing.JFrame;

public class Usuario {
    
    protected  String dniUsuarioLogin;
    protected  String passwordLogin;
    protected  String dniUsuarioRegistro;
    protected  String passwordRegistro,passwordRegistro2;
    protected  String nombreRegistro;
    protected  String dniCambioPassword;
    protected  String passwordViejaCambioPassword;
    protected  String passwordNuevaCambioPassword2;
    protected  String dniUsuarioBorrar;
    protected  String passwordUsuarioBorrar;
    protected  String fechaNacimiento;
    protected  String apellido;
    protected  String fechaTOS;


    public static Usuario usuarioLogin=new Usuario();
    public static Usuario usuarioRegistro=new Usuario();
    public static Usuario usuarioCambio=new Usuario();
    public static Usuario usuarioBorrar=new Usuario();
    
    
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

    public String getDniCambioPassword() {
        return dniCambioPassword;
    }

    public void setDniCambioPassword(String dniCambioPassword) {
        this.dniCambioPassword = dniCambioPassword;
    }

    public String getPasswordViejaCambioPassword() {
        return passwordViejaCambioPassword;
    }

    public void setPasswordViejaCambioPassword(String passwordViejaCambioPassword) {
        this.passwordViejaCambioPassword = passwordViejaCambioPassword;
    }

    public String getPasswordNuevaCambioPassword2() {
        return passwordNuevaCambioPassword2;
    }

    public void setPasswordNuevaCambioPassword2(String passwordNuevaCambioPassword2) {
        this.passwordNuevaCambioPassword2 = passwordNuevaCambioPassword2;
    }

    public String getDniUsuarioBorrar() {
        return dniUsuarioBorrar;
    }

    public void setDniUsuarioBorrar(String dniUsuarioBorrar) {
        this.dniUsuarioBorrar = dniUsuarioBorrar;
    }

    public String getPasswordUsuarioBorrar() {
        return passwordUsuarioBorrar;
    }

    public void setPasswordUsuarioBorrar(String passwordUsuarioBorrar) {
        this.passwordUsuarioBorrar = passwordUsuarioBorrar;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaTOS() {
        return fechaTOS;
    }

    public void setFechaTOS(String fechaTOS) {
        this.fechaTOS = fechaTOS;
    }



    
   
    

    
    public  void consultaLogin(){
        
        //        Instanciar BBDD
        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();
        com.mysql.jdbc.Connection con= conexion.conectar();

        String query="select * from usuario where dni='"+Usuario.usuarioLogin.getDniUsuarioLogin()+"' and contrasena=MD5('"+ Usuario.usuarioLogin.getPasswordLogin()+"')";
        
        try{
           //        Llamamos al metodo de consultasLogin y le pasamos la conexion y la consulta
        ResultSet rs= consultas.consultaBD(query);
            if(rs.next())
            {
            VistaCondiciones vistaTA=new VistaCondiciones();
            vistaTA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    vistaTA.setSize(916,729);
    vistaTA.setLocationRelativeTo(null);
    vistaTA.setVisible(true);
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
        String query1="select * from usuario where dni='"+Usuario.usuarioRegistro.getDniUsuarioRegistro()+"'";
        
        
        try{
            ResultSet rs1= consultas.consultaBD(query1);
        if(rs1.next()){
           JOptionPane.showMessageDialog(null, "El usuario ya existe. Pruebe a iniciar sesión para continuar."); 
        }
        else{
//            String query2="insert into usuario (dni,nombre,apellido,fecha_nac,contrasena) values('"+Usuario.usuarioRegistro.getDniUsuarioRegistro()+
//                    "','"+Usuario.usuarioRegistro.getNombreRegistro()+"','"+Usuario.usuarioRegistro.getApellido()+"','"+Usuario.usuarioRegistro.getFechaNacimiento()
//                    +"','"+Usuario.usuarioRegistro.getPasswordRegistro()+"')";
        
            String query2="insert into usuario (dni,nombre,apellido,fecha_nac,contrasena) values('"+Usuario.usuarioRegistro.getDniUsuarioRegistro()+"','"+Usuario.usuarioRegistro.getNombreRegistro()+"','"+Usuario.usuarioRegistro.getApellido()+"','"+Usuario.usuarioRegistro.getFechaNacimiento()+"',MD5('"+Usuario.usuarioRegistro.getPasswordRegistro()+"'))";
            consultas.insertarDatosBD(query2);
          
        }
        }
        catch(SQLException | HeadlessException ex){
            
        }
        

    }
    
    public void consultaLoginCambioPassword(){
        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();
        com.mysql.jdbc.Connection con= conexion.conectar();
        
        System.out.println(Usuario.usuarioCambio.getDniCambioPassword()+" "+Usuario.usuarioCambio.getPasswordViejaCambioPassword()+" "+Usuario.usuarioCambio.getPasswordNuevaCambioPassword2());
        String query="select * from usuario where dni='"+Usuario.usuarioCambio.getDniCambioPassword()+"' and contrasena=MD5('"+ Usuario.usuarioCambio.getPasswordViejaCambioPassword()+"')";
        
         try{
             ResultSet rs= consultas.consultaBD(query);
            if(rs.next())
            {
                //METODO CAMBIO PASSWORD
                String query2="UPDATE USUARIO SET contrasena=MD5('"+Usuario.usuarioCambio.getPasswordNuevaCambioPassword2()+"') WHERE dni='"+Usuario.usuarioCambio.getDniCambioPassword()+"'";
                    
                consultas.actualizarBD(query2);
                JOptionPane.showMessageDialog(null, "Enhorabuena, ahora puede entrar con la nueva contraseña");
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
    
        public void consultaBorrarUsuario(){
        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();
        com.mysql.jdbc.Connection con= conexion.conectar();
        
        System.out.println(Usuario.usuarioBorrar.getDniUsuarioBorrar()+" "+Usuario.usuarioBorrar.getPasswordUsuarioBorrar());
        String query="select * from usuario where dni='"+Usuario.usuarioBorrar.getDniUsuarioBorrar()+"' and contrasena=MD5('"+ Usuario.usuarioBorrar.getPasswordUsuarioBorrar()+"')";
        
         try{
            ResultSet rs= consultas.consultaBD(query);
            if(rs.next())
            {
                //METODO CAMBIO PASSWORD
                //String query2="UPDATE USUARIO SET contrasena='"+Usuario.usuarioCambio.getPasswordNuevaCambioPassword2()+"' WHERE dni='"+Usuario.usuarioCambio.getDniCambioPassword()+"'";
                String query3="DELETE FROM USUARIO WHERE dni='"+Usuario.usuarioBorrar.getDniUsuarioBorrar()+"'";    
                consultas.actualizarBD(query3);
                JOptionPane.showMessageDialog(null, "Su usuario ha sido borrado.");
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
    
    
    
    
    

