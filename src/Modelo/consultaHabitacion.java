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
             Habitacion.setPrecio_habitacion(rs.getDouble (4));   
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public boolean  habitacionesDisponibles(){
        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();
        Connection con= conexion.conectar();
        
        String query="select if (exists (select cod_habitacion, fecha_entrada, fecha_salida from reserva where "
                + "(cod_habitacion="+Habitacion.getCod_habitacion()+")AND(fecha_entrada='"+Alojamiento.getFechaEntrada()+"')AND(fecha_entrada='"+Alojamiento.getFechaSalida()+"')));";
        boolean rs= consultas.boleano(con, query);

        
        try{
//            if (rs.next()) {
//                
//            System.out.println ("Comprobacion reserva: "+rs.getInt (1) + " " + rs.getString (2)+ " " + rs.getInt(3));
//            return rs.getBoolean(1);
//            
//            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }
               

}
