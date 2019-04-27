/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author ira_a
 */
public class Habitacion extends Hotel{
    
    protected static int cod_habitacion;
    protected static int cama_simple;
    protected static int cama_doble;
    protected static int cama_individial;
    protected static double precio_habitacion;

    public Habitacion() {
    }

    public static int getCod_habitacion() {
        return cod_habitacion;
    }

    public static void setCod_habitacion(int cod_habitacion) {
        Habitacion.cod_habitacion = cod_habitacion;
    }

    public static int getCama_simple() {
        return cama_simple;
    }

    public static void setCama_simple(int cama_simple) {
        Habitacion.cama_simple = cama_simple;
    }

    public static int getCama_doble() {
        return cama_doble;
    }

    public static void setCama_doble(int cama_doble) {
        Habitacion.cama_doble = cama_doble;
    }

    public static int getCama_individial() {
        return cama_individial;
    }

    public static void setCama_individial(int cama_individial) {
        Habitacion.cama_individial = cama_individial;
    }

    public static double getPrecio_habitacion() {
        return precio_habitacion;
    }

    public static void setPrecio_habitacion(double precio_habitacion) {
        Habitacion.precio_habitacion = precio_habitacion;
    }
    
    
    
}
