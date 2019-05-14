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

//Retorna las ubicaciones donde estan disponibles las casa    
   public ArrayList<String>ubicacionCasa(){

        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();


        ArrayList<String> consultaUbicacion = new ArrayList<String>();

        String query="select DISTINCT ciudad from casa ";
        ResultSet rs= consultas.consultaBD(query);

        try{
            while(rs.next()){

                String ubicacion=rs.getString(1);
                consultaUbicacion.add(ubicacion);
            }
        }catch(Exception e){
            System.out.println("Ubicacion  "+e.getMessage());
        }
        System.out.println("Ubicacion de las casas "+consultaUbicacion);
        return consultaUbicacion;
    }
//    retorna las casas disponibles en un lugar concreto y con un cupo de personas concreto    
  public ArrayList<String>CasaPorLugarYporPersonas(String ubicacionCasa, int numeroDePersonas){

        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();

        ArrayList<String> consulta = new ArrayList<String>();
        String query="select cod_casa, maximo_huespedes,direccion,ciudad from casa where maximo_huespedes>="+numeroDePersonas+" AND ciudad='"+ubicacionCasa+"'";
        ResultSet rs= consultas.consultaBD(query);
        try{
            while(rs.next()){

                int cod_casa=rs.getInt(1);
                String calle=rs.getString(3);
                consulta.add(Integer.toString(cod_casa)+" Calle: "+calle);
                
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Casas en "+ubicacionCasa+" son "+consulta);
        return consulta;
    }
           
}
