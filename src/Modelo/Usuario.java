/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author ikasleaETHAZI
 */
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
    
    
    
    
    
}
