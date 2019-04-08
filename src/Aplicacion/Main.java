
package Aplicacion;
//import BBDD.Conexion;
//import BBDD.Consultas;
import javax.swing.JFrame;
import Vista.*;
import Controlador.*;
import Controlador.*;
import Modelo.ConsultaHotel;
import javax.swing.SwingUtilities;
import vista.VistaPago;

public class Main {
    
    public static void main(String[] args){

    //ConsultaHotel hotel= new ConsultaHotel();
//    hotel.cargarHoteles();

//pasamos por parametro la ciudad donde queremos buscar el hotel
   // hotel.HotelPorLugar("Bilbao");
    //hotel.ubicacion();


    //VistaPago vistab=new VistaPago();

    VistaPago vistab=new VistaPago();

    vistab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    vistab.setBounds(0,0,600,850);
    vistab.setVisible(true);

    }}
    
    
  

