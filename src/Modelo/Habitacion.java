/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import BBDD.Conexion;
import BBDD.Consultas;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Habitacion extends Hotel{
    
    protected static int cod_habitacion;
    protected static int cama_simple;
    protected static int cama_doble;
    protected static int cama_nino;
    protected static double precio_habitacion;
    protected static boolean disponibilidad;

    public Habitacion() {
    }

    public static boolean isDisponibilidad() {
        return disponibilidad;
    }

    public static void setDisponibilidad(boolean disponibilidad) {
        Habitacion.disponibilidad = disponibilidad;
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

    public static int getCama_nino() {
        return cama_nino;
    }

    public static void setCama_nino(int cama_nino) {
        Habitacion.cama_nino = cama_nino;
    }

    public static double getPrecio_habitacion() {
        return precio_habitacion;
    }

    public static void setPrecio_habitacion(double precio_habitacion) {
        Habitacion.precio_habitacion = precio_habitacion;
    }
    
    public static void coincidencia(){
        Habitacion habitacion= new Habitacion();
        habitacion.habitaciones(getCama_nino(),getCama_simple(),getCama_doble(),Hotel.getCodigoHotel());
    }
    
    public static void comprobarDisponibilidad(){
        Habitacion habitacion2= new Habitacion();
        habitacion2.habitacionesDisponibles();
//        if (!habitacion2.habitacionesDisponibles()){
//        setDisponibilidad(false); 
//        }else{
//        setDisponibilidad(true);    
//        }
    }
    
    
    public void habitaciones(int camaInfantil,int camaSimple, int camaDoble, int codHotel){
        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();

        
        String query="select cama_infantil, cama_simple, cama_doble, precio_habitacion, cod_habitacion from habitacion "
                + "where (cod_hotel=" +codHotel+ ")AND(cama_doble="+camaDoble +")AND(cama_simple="+camaSimple+" )AND(cama_infantil="+camaInfantil+");";
        ResultSet rs= consultas.consultaBD(query);
        try{
            while(rs.next()){
                System.out.println ("Habitacion que coincide con las camas seleccionadas :"+rs.getInt (1) + " " + rs.getInt (2)+ " " + rs.getInt(3)+ " " + rs.getDouble (4)+ " " + rs.getInt (5));
             Habitacion.setPrecio_habitacion(rs.getDouble (4));   
             Habitacion.setCod_habitacion(rs.getInt(5));
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void  habitacionesDisponibles(){
        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();

        
//        String query="select if (exists (select cod_habitacion, fecha_entrada, fecha_salida from reserva where "
//                + "(cod_habitacion="+Habitacion.getCod_habitacion()+")AND(fecha_entrada='"+Alojamiento.getFechaEntrada()+"')AND(fecha_entrada='"+Alojamiento.getFechaSalida()+"')));";
        String query="select cod_habitacion, fecha_entrada, fecha_salida from reserva where "
                + "(cod_habitacion="+Habitacion.getCod_habitacion()+")AND(fecha_entrada='"+Alojamiento.alojamiento1.getFechaEntrada()+"')AND(fecha_salida='"+Alojamiento.alojamiento1.getFechaSalida()+"')";
        System.out.println(query);
        ResultSet rs= consultas.consultaBD(query);

        
        try{
            while(rs.next()) {
              JOptionPane.showMessageDialog(null,"Las habitaciones que cumplen sus requerimientos no estan disponibles");
          }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}
