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
    
    public boolean  habitacionesDisponibles(){
        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();
        Connection con= conexion.conectar();
        
        String query="select cod_habitacion, fecha_entrada, fecha_salida from reserva where (cod_habitacion=100)AND(fecha_entrada='2019-05-111')AND('2019-05-26');";
        ResultSet rs= consultas.consultaBD(con, query);
        boolean disponible=true;
        try{
            if (rs.next()) {
            System.out.println ("Comprobacion reserva: "+rs.getInt (1) + " " + rs.getString (2)+ " " + rs.getInt(3));
            disponible=false;
            }else{
            disponible=true;   
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
            return disponible;
    }
}
