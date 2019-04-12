/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import static Controlador.ControladorEleccion.seleccionEleccion;
import Modelo.ConsultaHotel;
import Modelo.insertarReserva;
import Vista.VistaEstanciaSeleccionada;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import vista.VistaPago;

/**
 *
 * @author shabi
 */
public class ControladorEstanciaSeleccionada {
    
    public static int precio1;
    public static int precio1cents;
    public static int codigoHotelInsertar;
    public static String nombreHotelInsertar;
    public static ArrayList datosHotel= new ArrayList<>();
    
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
        
        ConsultaHotel cons=new ConsultaHotel();
        datosHotel= cons.consultaCompleta(seleccionEleccion);
        precio1=(int)datosHotel.get(2);
        codigoHotelInsertar=(int)datosHotel.get(0);
        nombreHotelInsertar=(String)datosHotel.get(1);
    }
    
    
    public void irPago(){
        ConsultaHotel cons=new ConsultaHotel();
//        precio1=(int) cons.consultaCompleta(seleccionEleccion).get(2);
        System.out.println("El precio es: ");
        System.out.println(precio1);
        VistaPago vistap=new VistaPago();
        vistap.setBounds(0,0,600,730);
        vistap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vistap.setVisible(true);
        precio1cents=precio1*100;
    }
    
    public void sacarDatosEstancia(){
           ConsultaHotel hotel= new ConsultaHotel();
           hotel.consultaCompleta(seleccionEleccion);
    }
    public void insertarDatosEstancia(){
        ConsultaHotel cons=new ConsultaHotel();
//        codigoHotelInsertar=(int) cons.consultaCompleta(seleccionEleccion).get(0);
//        nombreHotelInsertar=(String) cons.consultaCompleta(seleccionEleccion).get(1);
        insertarReserva insertar= new insertarReserva();
        insertar.insertar(codigoHotelInsertar,nombreHotelInsertar); 
    }
    
    public void generarArchivoTexto(){
        FileWriter fw;
    
        try {
            ConsultaHotel cons=new ConsultaHotel();
            
            fw = new FileWriter(new File("mytextfile.txt"));
            
            fw.write(String.format(cons.consultaCompleta(seleccionEleccion).toString()));
            

            fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

