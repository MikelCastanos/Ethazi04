/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import BBDD.Conexion;
import BBDD.Consultas;
import Modelo.Casa;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ikasleaETHAZI
 */
public class Apartamento extends Casa {
    
    String piso;
    
    public static Apartamento apartamento1=new Apartamento();

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }
    
       public ArrayList<String>ubicacionApartamento(){
// Instanciar BBDD

        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();

// Crear ArrayList
        ArrayList<String> consultaUbicacion = new ArrayList<String>();
// Consulta
        String query="select distinct alojamiento.ciudad from alojamiento inner join apartamento on apartamento.cod_apartamento=alojamiento.cod_alojamiento where alojamiento.tipo='A';";
// Llamamos al metodo de consultasBD y le pasamos la conexion y la consulta
        ResultSet rs= consultas.consultaBD(query);
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
        System.out.println("Apartamentos en son "+consultaUbicacion);
        return consultaUbicacion;
    }
       
        public ArrayList<String>ApartamentoPorLugar(String ubicacionAlojamiento){
// Instanciar BBDD

        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();

// Crear ArrayList
        ArrayList<String> consulta = new ArrayList<String>();
// Consulta
        String query="select alojamiento.direccion from alojamiento inner join apartamento on "
                + "apartamento.cod_apartamento=alojamiento.cod_alojamiento where alojamiento.tipo='A' AND alojamiento.ciudad='"+ubicacionAlojamiento+"'";
// Llamamos al metodo de consultasBD y le pasamos la conexion y la consulta
        ResultSet rs= consultas.consultaBD(query);
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
        System.out.println("Hoteles en "+ubicacionAlojamiento+" son "+consulta);
        return consulta;
    }
        
}
