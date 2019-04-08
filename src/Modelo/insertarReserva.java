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
    
    public void insertar(){
        
//      Como prueba usamos estas variables, pero cuando tengamos la vista podemos pasarle las variables con el valor seleccionado
        String fechaEntrada="00-00-0000";
        String fechaSalida="00-00-0000";
        String codHotel="12345678";
        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();
        Connection con= conexion.conectar();
        
        String query="";
        
        query="INSERT into reserva (Cod_hotel,Fecha_entrada,Fecha_salida)VALUES('"+ codHotel +"', '"+ fechaEntrada +"', '" +fechaSalida + "')";
        
        consultas.insertarDatosBD(con, query);
    }
}
