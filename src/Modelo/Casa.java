/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import BBDD.Conexion;
import BBDD.Consultas;
import Modelo.Alojamiento;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ikasleaETHAZI
 */
public class Casa extends Alojamiento {
    
    int num_baños, tamaño;
    
    
    public static Casa casa1=new Casa();

    public int getNum_baños() {
        return num_baños;
    }

    public void setNum_baños(int num_baños) {
        this.num_baños = num_baños;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    
   public ArrayList<String>ubicacionApartamento(){
// Instanciar BBDD

        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();


        ArrayList<String> consultaUbicacion = new ArrayList<String>();

        String query="select distinct alojamiento.ciudad from alojamiento inner join casa on casa.cod_casa=alojamiento.cod_alojamiento where alojamiento.tipo='C'";

        ResultSet rs= consultas.consultaBD(query);

        try{
            while(rs.next()){

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

        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();

        ArrayList<String> consulta = new ArrayList<String>();
        String query="select alojamiento.direccion from alojamiento "
                + "inner join casa on casa.cod_casa=alojamiento.cod_alojamiento where alojamiento.tipo='C' AND alojamiento.ciudad='"+ubicacionAlojamiento+"'";

        ResultSet rs= consultas.consultaBD(query);
        try{
            while(rs.next()){

                String nombreHotel=rs.getString(1);
                consulta.add(nombreHotel);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Hoteles en "+ubicacionAlojamiento+" son "+consulta);
        return consulta;
    }
           
}
