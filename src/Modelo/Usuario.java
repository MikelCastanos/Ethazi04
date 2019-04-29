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
    
    
    
    
    
}
