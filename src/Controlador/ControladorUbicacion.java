/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VistaBienvenida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;
import Vista.*;
import Modelo.*;
import Aplicacion.*;
import BBDD.Conexion;
import java.awt.event.MouseEvent;
import java.util.Iterator;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import Modelo.ConsultaHotel;
import Vista.VistaUbicacion;

public class ControladorUbicacion {
    
    VistaBienvenida vista;
    Modelo modelo;
    ActionListener actionListener;
    
    static String seleccionUbicacion;
    
    public ControladorUbicacion(){}
    
    public ControladorUbicacion(JButton boton_siguiente2,JComboBox ubicacion,JComboBox combobox_numero_habitaciones){
        boton_siguiente2.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                accionBoton(ubicacion,combobox_numero_habitaciones);
                
            }
            
        });
    }

    public ControladorUbicacion(VistaBienvenida vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }
   
    
    public void accionBoton(JComboBox ubicacion, JComboBox combobox_numero_habitaciones){
        
            VistaEleccion vistae=new VistaEleccion(ubicacion,combobox_numero_habitaciones);
            vistae.setBounds(0,0,600,730);
            vistae.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            vistae.setVisible(true);
            cogerDatos(ubicacion,combobox_numero_habitaciones);
            System.out.println(seleccionUbicacion);

            
            

    }
    

         public void rellenarComboBox (JComboBox ubicacion){
           ConsultaHotel hotel= new ConsultaHotel();
//           hotel.ubicacion();
           
        Iterator<String> i= hotel.ubicacion().iterator();
        while(i.hasNext()){
           ubicacion.addItem(i.next()); 
        }
         }

       
         public void cogerDatos(JComboBox ubicacion, JComboBox combobox_numero_habitaciones){
            seleccionUbicacion=ubicacion.getSelectedItem().toString();
            Hotel.setNum_habitaciones((int)combobox_numero_habitaciones.getSelectedItem());
            
            
            
             
             
         }

   /* public static String getSeleccionUbicacion() {
        return seleccionUbicacion;
    }*/
         




    


        


}
    

