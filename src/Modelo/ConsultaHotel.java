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
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author ikasleaETHAZI
 */
public class ConsultaHotel {
    
//    Consulta estandar la dejo por si acaso pinta los datos d elos hoteles
    
    public void cargarHoteles(){
//        Instanciar BBDD
        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();
        Connection con= conexion.conectar();
        
//        Consulta
        String query="Select * from hotel";
//        Llamamos al metodo de consultasBD y le pasamos la conexion y la consulta
        ResultSet rs= consultas.consultaBD(con, query);
//        Recorrer todos los datos a mostrar
        try{
            while(rs.next()){
                System.out.println (rs.getInt (1) + " " + rs.getString (2)+ " " + rs.getInt(3)+ " " + rs.getString (4));
            }
//        Control de errores
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
//    Busca los hoteles que se encuentran en la ubicacion que se le pasa por paramatro
//    Devuelve un arrayList con los hoteles de esa ubicacion
    
    public ArrayList<String>HotelPorLugar(String ubicacionHotel){
// Instanciar BBDD

        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();
        Connection con= conexion.conectar();
// Crear ArrayList
        ArrayList<String> consulta = new ArrayList<String>();
// Consulta
        String query="select distinct nombre_hotel from hotel inner join ubicacion on hotel.cod_hotel=ubicacion.cod_hotel where ciudad='"+ubicacionHotel+"'";
// Llamamos al metodo de consultasBD y le pasamos la conexion y la consulta
        ResultSet rs= consultas.consultaBD(con, query);
//  Recorrer todos los datos a mostrar
        try{
            while(rs.next()){
//           Si descomentamos la siguiente linea nos muestra todos los datos del hotel que ocincide con la ubicacion

//              System.out.println (rs.getInt (1) + " " + rs.getString (2)+ " " + rs.getInt(3)+ " " + rs.getString (4));

//  Aqui en cambio guardamos los nombres del hotel que coinciden con la ubicaiocn en un arrayList
                String nombreHotel=rs.getString(1);
                consulta.add(nombreHotel);
            }
//        Control de errores
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Hoteles en "+ubicacionHotel+" son "+consulta);
        return consulta;
    }
    
        public ArrayList<String>ubicacion(){
// Instanciar BBDD

        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();
        Connection con= conexion.conectar();
// Crear ArrayList
        ArrayList<String> consultaUbicacion = new ArrayList<String>();
// Consulta
        String query="select distinct ciudad from hotel inner join ubicacion on hotel.cod_hotel=ubicacion.cod_hotel;";
// Llamamos al metodo de consultasBD y le pasamos la conexion y la consulta
        ResultSet rs= consultas.consultaBD(con, query);
//Recorrer todos los datos a mostrar
        try{
            while(rs.next()){
//Si descomentamos la siguiente linea nos muestra todos los datos del hotel que ocincide con la ubicacion

//System.out.println (rs.getInt (1) + " " + rs.getString (2)+ " " + rs.getInt(3)+ " " + rs.getString (4));

//  Aqui en cambio guardamos los nombres del hotel que coinciden con la ubicaiocn en un arrayList
                String ubicacion=rs.getString(1);
                consultaUbicacion.add(ubicacion);
            }
//        Control de errores
        }catch(Exception e){
            System.out.println("Ubicacion  "+e.getMessage());
        }
        System.out.println("Hoteles en son "+consultaUbicacion);
        return consultaUbicacion;
    }
  
   public ArrayList consultaCompleta(String nombreHotel){
// Instanciar BBDD

        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();
        Connection con= conexion.conectar();
// Crear ArrayList
        ArrayList infoCompleta = new ArrayList<>();
// Consulta
        String query="Select * from hotel inner join ubicacion on hotel.cod_hotel=ubicacion.cod_hotel where nombre_hotel='"+nombreHotel+"'";
// Llamamos al metodo de consultasBD y le pasamos la conexion y la consulta
        ResultSet rs= consultas.consultaBD(con, query);
//  Recorrer todos los datos a mostrar
        try{
            while(rs.next()){
//           Si descomentamos la siguiente linea nos muestra todos los datos del hotel que ocincide con la ubicacion

//              System.out.println (rs.getInt (1) + " " + rs.getString (2)+ " " + rs.getInt(3)+ " " + rs.getString (4));

//  Aqui en cambio guardamos los nombres del hotel que coinciden con la ubicaiocn en un arrayList
                int codigoHotel=rs.getInt(1);
                String nombre=rs.getString(2);
                int codioPostal=rs.getInt(3);
//                String ubicacion=rs.getString(4);
                String ciudad=rs.getString(5);
                String provincia=rs.getString(6);
                String calle=rs.getString(7);

                infoCompleta.add(codigoHotel);
                infoCompleta.add(nombre);
                infoCompleta.add(codioPostal);
//                infoCompleta.add(ubicacion);
                infoCompleta.add(ciudad);
                infoCompleta.add(provincia);
                infoCompleta.add(calle);


            }
//        Control de errores
        }catch(Exception e){
            System.out.println("Ubicacion  "+e.getMessage());
        }
//        System.out.println("Hoteles en son "+consultaUbicacion);
       System.out.println(infoCompleta);
        return infoCompleta;
    }
   
   
}

