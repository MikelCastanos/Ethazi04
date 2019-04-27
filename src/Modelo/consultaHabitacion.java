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
    public void cargarHoteles(){
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
