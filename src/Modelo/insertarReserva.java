/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import BBDD.Conexion;
import BBDD.Consultas;
import com.mysql.jdbc.Connection;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author ikasleaETHAZI
 */
public class insertarReserva{
    public static SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");

    public static Date fechagest=Calendar.getInstance().getTime();
    public static String formatted= format1.format(fechagest);
    int preprecio=(int)Habitacion.habitacion1.getPrecio_habitacion()*Hotel.hotel1.getDiasEstancia();
    String precioString=Integer.toString(preprecio);
//    Metodo para insertar los datos de la reserva en la tabla
    
    public void insertar(int codHabitacion, int codHotel, String dni, String fechaGestion, String fechaEntrada, String fechaSalida, double precioReserva){

        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();

        
        String query="";
        
        //query="INSERT into reserva (cod_habitacion,cod_hotel,dni,fecha_gestion,fecha_entrada,fecha_salida,precio_reserva)VALUES('"+ codHabitacion +"','"+ codHotel +"', '" + dni + "','"+ fechaGestion +"','"+ fechaEntrada +"','"+ fechaSalida +"','"+ precioReserva +"')";
        
        query="insert into reserva(cod_habitacion,cod_hotel,dni,fecha_gestion,fecha_entrada,fecha_salida,precio_reserva)VALUES('"+Habitacion.habitacion1.getCod_habitacion()+"','"+Hotel.hotel1.getCodigoHotel()+"','"+Usuario.usuarioLogin.getDniUsuarioLogin()+"','"+formatted+"','"+Hotel.hotel1.getFechaEntrada()+"','"+Hotel.hotel1.getFechaSalida()+"','"+precioString+"')";
        System.out.println(query);
        consultas.insertarDatosBD(query);
    }
}
