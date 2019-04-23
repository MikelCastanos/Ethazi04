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
    
    public void insertar(int codHabitacion, int codHotel, int codUsuario, String fechaGestion, String fechaEntrada, String fechaSalida, double precioReserva){

        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();
        Connection con= conexion.conectar();
        
        String query="";
        
        query="INSERT into reserva (cod_habitacion,cod_hotel,cod_usuario,fecha_gestion,fecha_entrada,fecha_salida,precio_reserva)VALUES('"+ codHabitacion +"','"+ codHotel +"', '"
                + codUsuario + "','"+ fechaGestion +"','"+ fechaEntrada +"','"+ fechaSalida +"','"+ precioReserva +"')";
        
        consultas.insertarDatosBD(con, query);
    }
}
