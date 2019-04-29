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
    
    protected static String nombreUsuarioLogin;
    protected static String passwordLogin;

    public static String getNombreUsuarioLogin() {
        return nombreUsuarioLogin;
    }

    public static void setNombreUsuarioLogin(String nombreUsuarioLogin) {
        Usuario.nombreUsuarioLogin = nombreUsuarioLogin;
    }

    public static String getPasswordLogin() {
        return passwordLogin;
    }

    public static void setPasswordLogin(String passwordLogin) {
        Usuario.passwordLogin = passwordLogin;
    }
    
    
    
    
    
}
