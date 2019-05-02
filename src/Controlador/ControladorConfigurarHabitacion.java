/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import static Controlador.ControladorEleccion.contadorHab;
import Modelo.Alojamiento;
import Modelo.Habitacion;
import Vista.VistaConfigurarHabitacion;
import Vista.VistaEstanciaSeleccionada;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author shabi
 */
public class ControladorConfigurarHabitacion {
    
    public ControladorConfigurarHabitacion(){}
     public ControladorConfigurarHabitacion(JButton irEstanciaSeleccionada,JComboBox eleccion,JComboBox camaSimpleBox,JComboBox camaDobleBox,JComboBox camaNiñoBox){
        irEstanciaSeleccionada.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                //cargarEstanciaSeleccionada(eleccion);
                configMasHabitaciones(eleccion);
                cogerDatosEleccion(camaSimpleBox,camaDobleBox,camaNiñoBox);
                
            }
            
        });
    }
     
     
     public void cargarEstanciaSeleccionada(JComboBox eleccion){
            VistaEstanciaSeleccionada vistaes=new VistaEstanciaSeleccionada(eleccion);
            vistaes.setBounds(0,0,600,730);
            vistaes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            vistaes.setVisible(true);

          
     }
     
       public void cogerDatosEleccion(JComboBox camaSimpleBox,JComboBox camaDobleBox,JComboBox camaNiñoBox){
            Habitacion.setCama_simple((int) camaSimpleBox.getSelectedItem());
            Habitacion.setCama_doble((int) camaDobleBox.getSelectedItem());
            Habitacion.setCama_nino((int) camaNiñoBox.getSelectedItem());
            Habitacion.coincidencia();
            Habitacion.comprobarDisponibilidad();
//            if(!Habitacion.isDisponibilidad()){
//              JOptionPane.showMessageDialog(null,"La habitacion elejida no esta disponible en esas fechas");  
//            }
//            System.out.println(Habitacion.isDisponibilidad());
            
            ControladorEstanciaSeleccionada con= new ControladorEstanciaSeleccionada();
            con.cargarValores();
            
            System.out.println(Habitacion.getCama_simple()+" "+Habitacion.getCama_doble()+" "+Habitacion.getCama_nino());
         }
       

                 public void configMasHabitaciones(JComboBox eleccion){
              
              if(contadorHab<Alojamiento.getNum_habitaciones()){
                  contadorHab++;
            VistaConfigurarHabitacion vistaCon=new VistaConfigurarHabitacion(eleccion);
            vistaCon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            vistaCon.setBounds(0,0,600,725);
            vistaCon.setVisible(true);
              }
              else{
                  cargarEstanciaSeleccionada(eleccion);
              }
          }
}
