/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import BBDD.Conexion;
import BBDD.Consultas;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author ikasleaETHAZI
 */
public class Reserva {
    
    //cod_reserva, fecha_entrada, fecha_salida,fecha_gestion,fecha_tos,dni, cod_huesped, cod_alojamiento
    public void insertar(int codHabitacion, int codHotel, String dni, String fechaGestion, String fechaEntrada, String fechaSalida, double precioReserva){

        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();
        
//        insert into reserva (fecha_entrada,fecha_salida, fecha_gestion, fecha_tos, cod_festivo, dni, cod_huesped, cod_casa, cod_hotel, cod_apartamento)
//        values();
        
        String query="";
        
        //query="INSERT into reserva (cod_habitacion,cod_hotel,dni,fecha_gestion,fecha_entrada,fecha_salida,precio_reserva)VALUES('"+ codHabitacion +"','"+ codHotel +"', '" + dni + "','"+ fechaGestion +"','"+ fechaEntrada +"','"+ fechaSalida +"','"+ precioReserva +"')";
        
        query="insert into reserva(cod_habitacion,cod_hotel,dni,fecha_gestion,fecha_entrada,fecha_salida,precio_reserva)"
            + "VALUES('"+Habitacion.habitacion1.getCod_habitacion()+"','"+Hotel.hotel1.getCodigoHotel()+"','"+Usuario.usuarioLogin.getDniUsuarioLogin()+"','"+Usuario.usuarioLogin.getFechaTOS()+"','"+Alojamiento.alojamiento1.getFechaEntrada()+"','"+Alojamiento.alojamiento1.getFechaSalida()+"','100')";
        System.out.println(query);
        consultas.insertarDatosBD(query);
    }
}
