/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Alojamiento;

/**
 *
 * @author ikasleaETHAZI
 */
public class Casa extends Alojamiento {
    
    int num_baños, tamaño;
    
    
    public static Casa casa1=new Casa();

    public int getNum_baños() {
        return num_baños;
    }

    public void setNum_baños(int num_baños) {
        this.num_baños = num_baños;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    
    
    
}
