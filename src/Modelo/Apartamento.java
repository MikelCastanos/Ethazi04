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
    
    int piso, codigoApartamento;
    ArrayList<Apartamento> apartamentoSeleccionado = new ArrayList<Apartamento>();
    public static Apartamento apartamento1=new Apartamento();

    public Apartamento() {
    }
    
    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public int getCodigoApartamento() {
        return codigoApartamento;
    }

    public void setCodigoApartamento(int codigoApartamento) {
        this.codigoApartamento = codigoApartamento;
    }

    
    
//    Devuelve las ubicaciones en las que hay disponibles apartamentos
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
       
//      Devuelve los apartamentos disponibles en una ciudad concreta y con una capacidad concreta de personas
        public ArrayList<String>ApartamentoPorLugarYpersonas(String ubicacionApartamento, int numeroDePersonas){

            Conexion conexion= new Conexion();
            Consultas consultas= new Consultas();

            ArrayList<String> consulta = new ArrayList<String>();
            String query="select * from apartamento where maximo_huespedes>="+numeroDePersonas+" AND ciudad='"+ubicacionApartamento+"' "
                    + "AND apartamento.cod_apartamento NOT IN (SELECT cod_apartamento from reserva "
                    + "where fecha_entrada >='"+Alojamiento.alojamiento1.getFechaEntrada()+"' and  "
                    + "fecha_salida <='"+Alojamiento.alojamiento1.getFechaSalida()+"');";
            ResultSet rs= consultas.consultaBD(query);
            try{
                while(rs.next()){

                    String calleApartamento=rs.getString(8);
                    consulta.add(calleApartamento);
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println("Apartamentos en "+ubicacionApartamento+" son "+consulta);
            return consulta;
    }

        
        public ArrayList<Apartamento> datosApartamentoSeleccionado (int calleApartamento){
            Apartamento aux= new Apartamento();
            Conexion conexion= new Conexion();
            Consultas consultas= new Consultas();
            
            String query="select * from apartamento where direccion= "+calleApartamento+";";
            ResultSet rs= consultas.consultaBD(query);
            
            try{
                while(rs.next()){
                    apartamento1.setCodigoApartamento(rs.getInt(1));
                    apartamento1.setNumeroHuespedes(rs.getInt(2));
                    apartamento1.setPrecioBase(rs.getDouble(3));
                    apartamento1.setPrecioFestivo(rs.getDouble(4));
                    apartamento1.setPrecioEstival(rs.getDouble(5));
                    apartamento1.setPiso(rs.getInt(6));
                    apartamento1.setCiudad(rs.getString(7));
                    apartamento1.setCalle(rs.getString(8));
                    apartamento1.setCodigo_postal(rs.getInt(9));
                    
                    
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            apartamentoSeleccionado.add(apartamento1);
            System.out.println(apartamento1);
            System.out.println(apartamentoSeleccionado);
           return apartamentoSeleccionado; 
        }

}
