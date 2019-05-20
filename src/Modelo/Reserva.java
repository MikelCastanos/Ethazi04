/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import BBDD.Conexion;
import BBDD.Consultas;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author ikasleaETHAZI
 */
public class Reserva {
    
    //cod_reserva, fecha_entrada, fecha_salida,fecha_gestion,fecha_tos,dni, cod_huesped, cod_alojamiento
    public void insertarHotel(int codHotel, String dni, String fechaGestion, String fechaEntrada, String fechaSalida, double precioReserva){

        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();
        
//        insert into reserva (fecha_entrada,fecha_salida, fecha_gestion, fecha_tos, cod_festivo, dni, cod_huesped, cod_casa, cod_hotel, cod_apartamento)
//        values();
        
        String query="";
        
        //query="INSERT into reserva (cod_habitacion,cod_hotel,dni,fecha_gestion,fecha_entrada,fecha_salida,precio_reserva)VALUES('"+ codHabitacion +"','"+ codHotel +"', '" + dni + "','"+ fechaGestion +"','"+ fechaEntrada +"','"+ fechaSalida +"','"+ precioReserva +"')";
        
        query="insert into reserva(cod_hotel,dni,fecha_gestion,fecha_entrada,fecha_salida,precio_reserva)"
            + "VALUES('"+codHotel+"','"+dni+"','"+fechaGestion+"','"+fechaEntrada+"','"+fechaSalida+"','"+precioReserva+"')";
        System.out.println(query);
        consultas.insertarDatosBD(query);
    }
    
        public void insertarCasa(int codCasa, String dni, String fechaGestion, String fechaEntrada, String fechaSalida, double precioReserva){

        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();
        
//        insert into reserva (fecha_entrada,fecha_salida, fecha_gestion, fecha_tos, cod_festivo, dni, cod_huesped, cod_casa, cod_hotel, cod_apartamento)
//        values();
        
        String query="";
        
        //query="INSERT into reserva (cod_habitacion,cod_hotel,dni,fecha_gestion,fecha_entrada,fecha_salida,precio_reserva)VALUES('"+ codHabitacion +"','"+ codHotel +"', '" + dni + "','"+ fechaGestion +"','"+ fechaEntrada +"','"+ fechaSalida +"','"+ precioReserva +"')";
        
        query="insert into reserva(cod_casa,dni,fecha_gestion,fecha_entrada,fecha_salida,precio_reserva)"
            + "VALUES('"+codCasa+"','"+dni+"','"+fechaGestion+"','"+fechaEntrada+"','"+fechaSalida+"','"+precioReserva+"')";
        System.out.println(query);
        consultas.insertarDatosBD(query);
    }
        
                public void insertarApartamento(int codApart, String dni, String fechaGestion, String fechaEntrada, String fechaSalida, double precioReserva){

        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();
        
//        insert into reserva (fecha_entrada,fecha_salida, fecha_gestion, fecha_tos, cod_festivo, dni, cod_huesped, cod_casa, cod_hotel, cod_apartamento)
//        values();
        
        String query="";
        
        //query="INSERT into reserva (cod_habitacion,cod_hotel,dni,fecha_gestion,fecha_entrada,fecha_salida,precio_reserva)VALUES('"+ codHabitacion +"','"+ codHotel +"', '" + dni + "','"+ fechaGestion +"','"+ fechaEntrada +"','"+ fechaSalida +"','"+ precioReserva +"')";
        
        query="insert into reserva(cod_apartamento,dni,fecha_gestion,fecha_entrada,fecha_salida,precio_reserva)"
            + "VALUES('"+codApart+"','"+dni+"','"+fechaGestion+"','"+fechaEntrada+"','"+fechaSalida+"','"+precioReserva+"')";
        System.out.println(query);
        consultas.insertarDatosBD(query);
    }
    
    public void checkInsertar(){
        if(Alojamiento.alojamiento1.getTipoAlojamiento().equals("H")){
                                                      
                insertarHotel(Hotel.hotel1.getCodigoHotel(),Usuario.usuarioLogin.getDniUsuarioLogin(),Usuario.usuarioLogin.getFechaTOS(),
                Hotel.hotel1.getFechaEntrada(),Hotel.hotel1.getFechaSalida(),Hotel.hotel1.getPrecioFinal());
    }
        
        if(Alojamiento.alojamiento1.getTipoAlojamiento().equals("C")){
            insertarCasa(Casa.casa1.codigo_casa,Usuario.usuarioLogin.getDniUsuarioLogin(),Usuario.usuarioLogin.getFechaTOS(),
                Casa.casa1.getFechaEntrada(),Casa.casa1.getFechaSalida(),Casa.casa1.getPrecioFinal());
        }
        
                if(Alojamiento.alojamiento1.getTipoAlojamiento().equals("A")){
            insertarCasa(Apartamento.apartamento1.getCodigoApartamento(),Usuario.usuarioLogin.getDniUsuarioLogin(),Usuario.usuarioLogin.getFechaTOS(),
               Apartamento.apartamento1.getFechaEntrada(),Apartamento.apartamento1.getFechaSalida(),Apartamento.apartamento1.getPrecioFinal());
        }
        
    }
    
    public void generarArchivoTexto(){
        FileWriter fw;
    
        try {
            Reserva rers=new Reserva();
            
            fw = new FileWriter(new File("reserva.txt"));
            
            String reserva="DNI: "+Usuario.usuarioLogin.getDniUsuarioLogin()+" Hotel: "+Hotel.hotel1.getCodigoHotel()+" Casa: "+Casa.casa1.getCodigo_casa()+" Apartamento: "+Apartamento.apartamento1.getCodigoApartamento()+" ";
            
            fw.write(reserva);
            

            fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
