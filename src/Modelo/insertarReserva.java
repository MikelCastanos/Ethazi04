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
    
    String fechagest="2019-09-11";
    String preprecio="80";
//    Metodo para insertar los datos de la reserva en la tabla
    
    public void insertar(int codHabitacion, int codHotel, String dni, String fechaGestion, String fechaEntrada, String fechaSalida, double precioReserva){

        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();
        Connection con= conexion.conectar();
        
        String query="";
        
        //query="INSERT into reserva (cod_habitacion,cod_hotel,dni,fecha_gestion,fecha_entrada,fecha_salida,precio_reserva)VALUES('"+ codHabitacion +"','"+ codHotel +"', '" + dni + "','"+ fechaGestion +"','"+ fechaEntrada +"','"+ fechaSalida +"','"+ precioReserva +"')";
        
        query="insert into reserva(cod_habitacion,cod_hotel,dni,fecha_gestion,fecha_entrada,fecha_salida,precio_reserva)VALUES('"+Habitacion.getCod_habitacion()+"','"+Hotel.getCodigoHotel()+"','"+Usuario.getDniUsuarioLogin()+"','"+fechagest+"','"+Alojamiento.getFechaEntrada()+"','"+Alojamiento.getFechaSalida()+"','"+preprecio+"')";
        System.out.println(query);
        consultas.insertarDatosBD(con, query);
    }
}
