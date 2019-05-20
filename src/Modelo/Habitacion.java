/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import BBDD.Conexion;
import BBDD.Consultas;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Habitacion extends Hotel{
    
    protected  int cod_habitacion;
    protected  int cama_simple;
    protected  int cama_doble;
    protected  int cama_nino;
    ArrayList<Hotel>habitacionSelecionada= new ArrayList<Hotel>();

    


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

    @Override
    public String toString() {
        return "Habitacion{" + "cod_habitacion=" + cod_habitacion + ", cama_simple=" + cama_simple + ", cama_doble=" + cama_doble + ", cama_nino=" + cama_nino + '}';
    }
    
    public static Habitacion habitacion1=new Habitacion();
    public static Habitacion habitacion2=new Habitacion();
    public static Habitacion habitacion3=new Habitacion();

    public ArrayList<String>habitacionesHotel(int codigoHotel){

        System.out.println("El codgio del hotel seleccionado es: "+codigoHotel);
        
        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();

        ArrayList<String> habitaciones = new ArrayList<String>();
        String query="select camas.cod_habitacion_hotel,camas.cama_doble,camas.cama_simple,camas.cama_nino FROM camas" +
            " INNER JOIN habitacion_hotel ON camas.cod_habitacion_hotel=habitacion_hotel.cod_habitacion_hotel" +
            " WHERE habitacion_hotel.cod_hotel=(SELECT cod_hotel from hotel WHERE cod_hotel="+codigoHotel+")" +
            " AND habitacion_hotel.cod_hotel NOT IN (SELECT cod_hotel from reserva where fecha_entrada"
            + " >='"+hotel1.getFechaEntrada()+"' and  fecha_salida <='"+hotel1.getFechaSalida()+"');";
        ResultSet rs= consultas.consultaBD(query);
            
        try{
            while(rs.next()){

               habitaciones.add(Integer.toString(rs.getInt(1))+"CamaDoble: "+Integer.toString(rs.getInt(2))
                       +"CamaSimple: "+Integer.toString(rs.getInt(2))+"CamaNino: "+Integer.toString(rs.getInt(3)));

            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        return habitaciones;
    }
 
    public ArrayList<Habitacion>habitacionSeleccionadaInfo(int codigoHabitacion){

        
        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();

        ArrayList<Habitacion> infoHabitacion = new ArrayList<Habitacion>();
        String query="select habitacion_hotel.precio_base_hotel,habitacion_hotel.precio_festivo_hotel,"
                + "habitacion_hotel.precio_estival_hotel,camas.cama_doble,camas.cama_simple,camas.cama_nino from habitacion_hotel "
                + "inner join camas on habitacion_hotel.cod_habitacion_hotel=camas.cod_habitacion_hotel where "
                + "camas.cod_habitacion_hotel="+codigoHabitacion+"";
        ResultSet rs= consultas.consultaBD(query);
            
        try{
            while(rs.next()){
                habitacion1.setPrecioBase(rs.getDouble(1));
                habitacion1.setPrecioFestivo(rs.getDouble(2));
                habitacion1.setPrecioEstival(rs.getDouble(3));
                habitacion1.setCama_doble(rs.getInt(4));
                habitacion1.setCama_simple(rs.getInt(5));
                habitacion1.setCama_nino(rs.getInt(6));

            }
            infoHabitacion.add(habitacion1);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(infoHabitacion);
        return infoHabitacion;
    }
    
     public ArrayList<Habitacion>habitacionSeleccionadaInfo2(int codigoHabitacion){

        
        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();

        ArrayList<Habitacion> infoHabitacion2 = new ArrayList<Habitacion>();
        String query="select habitacion_hotel.precio_base_hotel,habitacion_hotel.precio_festivo_hotel,"
                + "habitacion_hotel.precio_estival_hotel,camas.cama_doble,camas.cama_simple,camas.cama_nino from habitacion_hotel "
                + "inner join camas on habitacion_hotel.cod_habitacion_hotel=camas.cod_habitacion_hotel where "
                + "camas.cod_habitacion_hotel="+codigoHabitacion+"";
        ResultSet rs= consultas.consultaBD(query);
            
        try{
            while(rs.next()){
                habitacion2.setPrecioBase(rs.getDouble(1));
                habitacion2.setPrecioFestivo(rs.getDouble(2));
                habitacion2.setPrecioEstival(rs.getDouble(3));
                habitacion2.setCama_doble(rs.getInt(4));
                habitacion2.setCama_simple(rs.getInt(5));
                habitacion2.setCama_nino(rs.getInt(6));

            }
            infoHabitacion2.add(habitacion2);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(infoHabitacion2);
        return infoHabitacion2;
    }
     
          public ArrayList<Habitacion>habitacionSeleccionadaInfo3(int codigoHabitacion){

        
        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();

        ArrayList<Habitacion> infoHabitacion3 = new ArrayList<Habitacion>();
        String query="select habitacion_hotel.precio_base_hotel,habitacion_hotel.precio_festivo_hotel,"
                + "habitacion_hotel.precio_estival_hotel,camas.cama_doble,camas.cama_simple,camas.cama_nino from habitacion_hotel "
                + "inner join camas on habitacion_hotel.cod_habitacion_hotel=camas.cod_habitacion_hotel where "
                + "camas.cod_habitacion_hotel="+codigoHabitacion+"";
        ResultSet rs= consultas.consultaBD(query);
            
        try{
            while(rs.next()){
                habitacion3.setPrecioBase(rs.getDouble(1));
                habitacion3.setPrecioFestivo(rs.getDouble(2));
                habitacion3.setPrecioEstival(rs.getDouble(3));
                habitacion3.setCama_doble(rs.getInt(4));
                habitacion3.setCama_simple(rs.getInt(5));
                habitacion3.setCama_nino(rs.getInt(6));

            }
            infoHabitacion3.add(habitacion3);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(infoHabitacion3);
        return infoHabitacion3;
    }

}
