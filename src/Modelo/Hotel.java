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
public class Hotel extends Alojamiento{
    
    
    static int num_estrellas,codigoHotel;

    public static int getNum_estrellas() {
        return num_estrellas;
    }

    public static void setNum_estrellas(int num_estrellas) {
        Hotel.num_estrellas = num_estrellas;
    }

    public static int getCodigoHotel() {
        return codigoHotel;
    }

    public static void setCodigoHotel(int codigoHotel) {
        Hotel.codigoHotel = codigoHotel;
    }
    
    


    

    
    
}
