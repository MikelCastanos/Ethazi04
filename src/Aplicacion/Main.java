
package Aplicacion;
import BBDD.Conexion;
import BBDD.Consultas;
import javax.swing.JFrame;
import Vista.*;
import Controlador.*;
import Controlador.*;
import Modelo.ConsultaHotel;
import javax.swing.SwingUtilities;
import vista.VistaPago;


public class Main {
    
    public static void main(String[] args){

    ConsultaHotel hotel= new ConsultaHotel();
    hotel.cargarHoteles();

<<<<<<< HEAD
    //Conectar cxn = new Conectar();
    //cxn.conexion();
    VistaPago vistab=new VistaPago();
=======
    VistaBienvenida vistab=new VistaBienvenida();
>>>>>>> f7ccdb72ae18c843ec0badef0f4ee8b0022bceeb
    vistab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    vistab.setBounds(0,0,600,600);
    vistab.setVisible(true);

    }}
    
    
  

