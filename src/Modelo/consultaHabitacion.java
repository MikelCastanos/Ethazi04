/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import BBDD.Conexion;
import BBDD.Consultas;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;

/**
 *
 * @author ira_a
 */
public class consultaHabitacion {
//    Hotel.getCodigoHotel();
    public void habitaciones(int camaInfantil,int camaSimple, int camaDoble, int codHotel){
        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();
        Connection con= conexion.conectar();
        
        String query="select cama_infantil, cama_simple, cama_doble, precio_habitacion, cod_habitacion from habitacion "
                + "where (cod_hotel=" +codHotel+ ")AND(cama_doble="+camaDoble +")AND(cama_simple="+camaSimple+" )AND(cama_infantil="+camaInfantil+");";
        ResultSet rs= consultas.consultaBD(con, query);
        try{
            while(rs.next()){
                System.out.println ("Habitacion que coincide con las camas seleccionadas :"+rs.getInt (1) + " " + rs.getInt (2)+ " " + rs.getInt(3)+ " " + rs.getDouble (4)+ " " + rs.getInt (5));
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void habitacionesDisponibles(){
        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();
        Connection con= conexion.conectar();
        
        String query="select habitacion.cama_infantil, habitacion.cama_simple, habitacion.cama_doble, "
                + "habitacion.precio_habitacion, hotel.nombre_hotel from habitacion inner join hotel on "
                + " habitacion.cod_hotel=hotel.cod_hotel";
        ResultSet rs= consultas.consultaBD(con, query);
        try{
            while(rs.next()){
                System.out.println (rs.getInt (1) + " " + rs.getString (2)+ " " + rs.getInt(3)+ " " + rs.getString (4));
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
