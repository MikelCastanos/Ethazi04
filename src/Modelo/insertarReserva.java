/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import BBDD.Conexion;
import BBDD.Consultas;
import com.mysql.jdbc.Connection;

/**
 *
 * @author ikasleaETHAZI
 */
public class insertarReserva{
    
//    Metodo para insertar los datos de la reserva en la tabla
    
    public void insertar(int codHotel, String nombreHotel){

        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();
        Connection con= conexion.conectar();
        
        String query="";
        
        query="INSERT into reserva (Cod_hotel,NombreHotel)VALUES('"+ codHotel +"', '"+ nombreHotel + "')";
        
        consultas.insertarDatosBD(con, query);
    }
}
