
package Aplicacion;
import BBDD.Conexion;
import BBDD.Consultas;
import javax.swing.JFrame;
import Vista.*;
import Controlador.*;
import Controlador.*;
import Modelo.ConsultaHotel;
import javax.swing.SwingUtilities;


public class Main {
    
    public static void main(String[] args){

    ConsultaHotel hotel= new ConsultaHotel();
    hotel.cargarHoteles();

    VistaBienvenida vistab=new VistaBienvenida();
    vistab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    vistab.setBounds(0,0,600,600);
    vistab.setVisible(true);

    }}
    
    
  

