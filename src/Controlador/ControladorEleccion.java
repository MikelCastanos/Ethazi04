/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ConsultaHotel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import Controlador.ControladorUbicacion;
import static Controlador.ControladorUbicacion.seleccionUbicacion;
import Vista.VistaEstanciaSeleccionada;
import javax.swing.JFrame;


/**
 *
 * @author ikasleaETHAZI
 */
public class ControladorEleccion {
    
    public static String seleccionEleccion;
    
    public ControladorEleccion(){}
    
        public ControladorEleccion(JButton boton_siguiente2,JComboBox eleccion){
        boton_siguiente2.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
        accionBotonEleccion(eleccion);
        
            }
            
        });}


        
        
           public void rellenarComboBox2 (JComboBox eleccion){
           ConsultaHotel hotel= new ConsultaHotel();
          
          hotel.HotelPorLugar(seleccionUbicacion);
                
        Iterator<String> ite= hotel.HotelPorLugar(seleccionUbicacion).iterator();
        while(ite.hasNext()){
           eleccion.addItem(ite.next()); 
        }
         }
           
           public void accionBotonEleccion(JComboBox eleccion){
               cogerDatosEleccion(eleccion);
            VistaEstanciaSeleccionada vistaes=new VistaEstanciaSeleccionada(eleccion);
            vistaes.setBounds(0,0,600,730);
            vistaes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            vistaes.setVisible(true);
          ControladorEstanciaSeleccionada con= new ControladorEstanciaSeleccionada();
          con.cargarValores();
               
           }
           
          public void cogerDatosEleccion(JComboBox eleccion){
             seleccionEleccion=eleccion.getSelectedItem().toString();
             
         }
           

        

    }
        

    

        
        
    

    

