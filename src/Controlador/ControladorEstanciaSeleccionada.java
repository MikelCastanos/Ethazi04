/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import static Controlador.ControladorEleccion.seleccionEleccion;
import Modelo.Alojamiento;
import Modelo.Habitacion;
import Modelo.Hotel;
import Modelo.Usuario;
import Modelo.insertarReserva;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import vista.VistaPago;

/**
 *
 * @author shabi
 */
public class ControladorEstanciaSeleccionada {
    
    public  int codigoHabitacionInsertar;
    public  String dniInsertar;
    public  String fechaGestion;
    public  String fechaEntrada;
    public  String fechaSalida;
    


    public  double precio1;
    public  double precio1ConDias;
    public  double precio1cents;
    public  int codigoHotelInsertar;
      ArrayList datosHotel= new ArrayList<>();
    
    public ControladorEstanciaSeleccionada(JButton boton_siguiente3){
                   
        boton_siguiente3.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                irPago();
                insertarDatosEstancia();
                generarArchivoTexto();
            }
            
        });}
    public ControladorEstanciaSeleccionada(){
        
    }
//    metodo para cargara variables desde el arraylist que recibimos de la consulta 
//    revisar los demas ocntroladores para hacer algo parecido y no llamar a las consultas tantas veces
    public void cargarValores(){
        
        Hotel cons=new Hotel();
        
        datosHotel= cons.consultaCompleta(seleccionEleccion);
        codigoHabitacionInsertar=100;
        codigoHotelInsertar=Hotel.getCodigoHotel();
        dniInsertar=Usuario.getDniUsuarioLogin();
        fechaGestion=insertarReserva.formatted;
        fechaEntrada=Alojamiento.alojamiento1.getFechaEntrada();
        fechaSalida=Alojamiento.alojamiento1.getFechaSalida();
        precio1=Habitacion.getPrecio_habitacion();
        precio1ConDias=Habitacion.getPrecio_habitacion()*Alojamiento.alojamiento1.getDiasEstancia();
        precio1cents=precio1ConDias*100;
       
    }
    
    
    public void irPago(){
        Hotel cons=new Hotel();
//        precio1=(int) cons.consultaCompleta(seleccionEleccion).get(2);
        System.out.println("El precio es: ");
        System.out.println(precio1);
        VistaPago vistap=new VistaPago();
        vistap.setBounds(0,0,600,730);
        vistap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vistap.setVisible(true);
        
    }
    
    public static void sacarDatosEstancia(){
           Hotel hotel= new Hotel();
           hotel.consultaCompleta(seleccionEleccion);
    }
    public void insertarDatosEstancia(){
        Hotel cons=new Hotel();
//        codigoHotelInsertar=(int) cons.consultaCompleta(seleccionEleccion).get(0);
//        nombreHotelInsertar=(String) cons.consultaCompleta(seleccionEleccion).get(1);
        insertarReserva insertar= new insertarReserva();
        insertar.insertar(codigoHabitacionInsertar,codigoHotelInsertar,dniInsertar,fechaGestion,fechaEntrada,fechaSalida,precio1); 
    }
    
    public void generarArchivoTexto(){
        FileWriter fw;
    
        try {
            Hotel cons=new Hotel();
            
            fw = new FileWriter(new File("mytextfile.txt"));
            
            fw.write(String.format(cons.consultaCompleta(seleccionEleccion).toString()));
            

            fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

