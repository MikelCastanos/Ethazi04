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
    
    protected  int cod_habitacion;
    protected  int cama_simple;
    protected  int cama_doble;
    protected  int cama_nino;
    protected  double precio_habitacion;
    protected  boolean disponibilidad;
    
    
public static Habitacion habitacion1=new Habitacion();
public static Habitacion habitacion2=new Habitacion();
public static Habitacion habitacion3=new Habitacion();

    public Habitacion() {
    }

    public int getCod_habitacion() {
        return cod_habitacion;
    }

    public void setCod_habitacion(int cod_habitacion) {
        this.cod_habitacion = cod_habitacion;
    }

    public int getCama_simple() {
        return cama_simple;
    }

    public void setCama_simple(int cama_simple) {
        this.cama_simple = cama_simple;
    }

    public int getCama_doble() {
        return cama_doble;
    }

    public void setCama_doble(int cama_doble) {
        this.cama_doble = cama_doble;
    }

    public int getCama_nino() {
        return cama_nino;
    }

    public void setCama_nino(int cama_nino) {
        this.cama_nino = cama_nino;
    }

    public double getPrecio_habitacion() {
        return precio_habitacion;
    }

    public void setPrecio_habitacion(double precio_habitacion) {
        this.precio_habitacion = precio_habitacion;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    
    
    public void coincidencia(){
        
//        habitaciones(getCama_nino(),getCama_simple(),getCama_doble(),Hotel.hotel1.getCodigoHotel());
    }
    
    public static void comprobarDisponibilidad(){
        
        habitacion1.habitacionesDisponibles();
//        if (!habitacion2.habitacionesDisponibles()){
//        setDisponibilidad(false); 
//        }else{
//        setDisponibilidad(true);    
//        }
    }

    
    public void  habitacionesDisponibles(){
        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();

        String query="select cod_habitacion, fecha_entrada, fecha_salida from reserva where "
                + "(cod_habitacion="+getCod_habitacion()+")AND(fecha_entrada='"+Hotel.hotel1.getFechaEntrada()+"')AND(fecha_salida='"+Hotel.hotel1.getFechaSalida()+"')";
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
