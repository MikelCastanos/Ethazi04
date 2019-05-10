/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Hotel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JComboBox;
import static Controlador.ControladorUbicacionHotel.seleccionUbicacion;
import Vista.VistaConfigurarHabitacion;
import javax.swing.JFrame;
import static Controlador.ControladorPago.cantidad_insertada;
import Vista.VistaBienvenida;
import javax.swing.JOptionPane;

/**
 *
 * @author ikasleaETHAZI
 */
public class ControladorEleccion {
    
    public static String seleccionEleccion;
    
    
    public ControladorEleccion(){}
    
        public ControladorEleccion(JButton botonCancelar,JButton boton_siguiente2,JComboBox eleccion){
        boton_siguiente2.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
        accionBotonEleccion(eleccion);
        
            }
            
        });
        
        botonCancelar.addMouseListener(new MouseAdapter(){
             public void mouseClicked(MouseEvent a){
                cancelar();
    }
             });
        
            }

public void cancelar(){
          JOptionPane.showMessageDialog(null,"Pedido cancelado. Volverá a la pantalla de inicio. ¡Hasta la proxima!");
            cantidad_insertada=0;
            VistaBienvenida iniciostart=new VistaBienvenida();
            iniciostart.setBounds(0,0,600,730);
            iniciostart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            iniciostart.setVisible(true);
          
          }


        
        
           public void rellenarComboBox2 (JComboBox eleccion){
           Hotel hotel= new Hotel();
          
          hotel.HotelPorLugar(ControladorUbicacionHotel.seleccionUbicacion);
                
        Iterator<String> ite= hotel.HotelPorLugar(seleccionUbicacion).iterator();
        while(ite.hasNext()){
           eleccion.addItem(ite.next()); 
        }
         }
           
           public void accionBotonEleccion(JComboBox eleccion){
               cogerDatosEleccion(eleccion);
            //VistaEstanciaSeleccionada vistaes=new VistaEstanciaSeleccionada(eleccion);
            //vistaes.setBounds(0,0,600,730);
            //vistaes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //vistaes.setVisible(true);

          //ControladorEstanciaSeleccionada con= new ControladorEstanciaSeleccionada();
          //con.cargarValores();
              
            VistaConfigurarHabitacion vistaCon=new VistaConfigurarHabitacion(eleccion);
            vistaCon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            vistaCon.setBounds(0,0,600,725);
            vistaCon.setVisible(true);

               
           }
           
          public void cogerDatosEleccion(JComboBox eleccion){
             seleccionEleccion=eleccion.getSelectedItem().toString();
             
         }
           
//          public void configMasHabitaciones(JComboBox eleccion){
//              
//              if(contadorHab<Alojamiento.getNum_habitaciones()){
//            VistaConfigurarHabitacion vistaCon=new VistaConfigurarHabitacion(eleccion);
//            vistaCon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            vistaCon.setBounds(0,0,600,725);
//            vistaCon.setVisible(true);
//              }
//          }
        

    }
        

    

        
        
    

    

