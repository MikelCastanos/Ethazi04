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

        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();

        ArrayList<String> consultaUbicacion = new ArrayList<String>();
        String query="select distinct ciudad from apartamento";
        ResultSet rs= consultas.consultaBD(query);
        try{
            while(rs.next()){

                String ubicacion=rs.getString(1);
                consultaUbicacion.add(ubicacion);
            }
        }catch(Exception e){
            System.out.println("Ubicacion  "+e.getMessage());
        }
        System.out.println("Apartamentos en son "+consultaUbicacion);
        return consultaUbicacion;
    }
       
        public ArrayList<String>ApartamentoPorLugarYpersonas(String ubicacionApartamento, int numeroDePersonas){

        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();

        ArrayList<String> consulta = new ArrayList<String>();
        String query="select * from apartamento where maximo_huespedes>="+numeroDePersonas+" AND ciudad='"+ubicacionApartamento+"';";
        ResultSet rs= consultas.consultaBD(query);
        try{
            while(rs.next()){

                String nombreHotel=rs.getString(1);
                consulta.add(nombreHotel);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Apartamentos en "+ubicacionApartamento+" son "+consulta);
        return consulta;
    }
        
}
