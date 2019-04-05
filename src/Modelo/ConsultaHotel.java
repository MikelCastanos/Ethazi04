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
/**
 *
 * @author ikasleaETHAZI
 */
public class ConsultaHotel {
    
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
}
