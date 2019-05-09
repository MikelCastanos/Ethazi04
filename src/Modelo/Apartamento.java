/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Casa;

/**
 *
 * @author ikasleaETHAZI
 */
public class Apartamento extends Casa {
    
    String piso;
    
    public static Apartamento apartamento1=new Apartamento();

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }
    
    
}
