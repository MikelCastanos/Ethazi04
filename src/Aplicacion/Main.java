
package Aplicacion;
//import BBDD.Conexion;
//import BBDD.Consultas;
import javax.swing.JFrame;
import Vista.*;

public class Main {
    
    public static void main(String[] args){ 

    VistaBienvenida vistab=new VistaBienvenida();
    
    vistab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    vistab.setSize(905,720);
    
    vistab.setResizable(false);
    vistab.setLocationRelativeTo(null);
    vistab.setVisible(true);
    
    }}
    
    
  

