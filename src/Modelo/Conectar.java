
package Modelo;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;




public class Conectar { 
    
    Connection conectar = null;
    public Connection conexion(){
   
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/hotel","root","");
            System.out.println("Conexion establecida");
           
        }
        
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return conectar;
    }
}
