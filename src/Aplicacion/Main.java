
package Aplicacion;
//import BBDD.Conexion;
//import BBDD.Consultas;
import javax.swing.JFrame;
import Vista.*;

public class Main {
    
    public static void main(String[] args){ 

//    ConsultaHotel hotel= new ConsultaHotel();
//    hotel.cargarHoteles();

//pasamos por parametro la ciudad donde queremos buscar el hotel

//    hotel.HotelPorLugar("Barcelona");
//    hotel.ubicacion();
//    insertarReserva insertar= new insertarReserva();
//    insertar.insertar("12345678","Santxo");
//    hotel.consultaCompleta("Ercilla");

   // hotel.HotelPorLugar("Bilbao");
    //hotel.ubicacion();



    //VistaPago vistab=new VistaPago();

    VistaBienvenida vistab=new VistaBienvenida();

    vistab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    vistab.setSize(916,725);
    vistab.setLocationRelativeTo(null);
    vistab.setVisible(true);

    }}
    
    
  

