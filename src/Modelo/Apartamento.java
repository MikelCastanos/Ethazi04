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
    int codigoApartamento;
    ArrayList<Apartamento> apartamentoSeleccionado = new ArrayList<Apartamento>();
    public static Apartamento apartamento1=new Apartamento();

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
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
        String query="select * from apartamento where maximo_huespedes>="+numeroDePersonas+" AND ciudad='"+ubicacionApartamento+"';";
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
        
//        METODOS PARA SACAR LOS PRECIOS BASe ESTIVAL Y FESTIVO SEGUN EL CODIGO DE APARTAMENTO
//        llamar a este metodo precioApartamento(apartamento1.getPrecioApartamento) comprobar 
//        que el setter esta hecho antes de llamar al metodo
        
        public ArrayList<Apartamento> datosApartamentoSeleccionado (int calleApartamento){
          
            Conexion conexion= new Conexion();
            Consultas consultas= new Consultas();
            
            String query="select * from apartamento where direccion= "+calleApartamento+";";
            ResultSet rs= consultas.consultaBD(query);

            try{
                while(rs.next()){
                    
//                    preciosApartamento.add(rs.getDouble(1));
//                    preciosApartamento.add(rs.getDouble(2));
//                    preciosApartamento.add(rs.getDouble(3)); 
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            asignarPrecios();
           return apartamentoSeleccionado; 
        }
        
//Siempre hay que llamar a este metodo despues de haber llamado al metodo de consulta PrecioApartamento
        
        public void asignarPrecios(){
            apartamento1.setPrecioBase(apartamentoSeleccionado.get(0));
            apartamento1.setPrecioEstival(apartamentoSeleccionado.get(1));
            apartamento1.setPrecioFestivo(apartamentoSeleccionado.get(2));
            
            System.out.println("Precio apartamento seleccionado :"+apartamento1.getPrecioBase()+" "+apartamento1.getPrecioEstival()+" "+apartamento1.getPrecioFestivo());
            
        }
}
