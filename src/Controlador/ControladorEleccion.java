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


/**
 *
 * @author ikasleaETHAZI
 */
public class ControladorEleccion {
    
    public ControladorEleccion(){}
    
        public ControladorEleccion(JButton boton_siguiente2){
        boton_siguiente2.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
            VistaEstanciaSeleccionada vistaes=new VistaEstanciaSeleccionada();
            vistaes.setBounds(0,0,600,600);
            vistaes.setVisible(true);
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
        

    }
        

    

        
        
    

    

