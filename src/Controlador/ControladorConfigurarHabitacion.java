/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Modelo.Alojamiento;
import Modelo.Habitacion;
import Vista.VistaConfigurarHabitacion;
import Vista.VistaEstanciaSeleccionada;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static Controlador.ControladorPago.cantidad_insertada;
import Vista.VistaBienvenida;
import javax.swing.JOptionPane;

/**
 *
 * @author shabi
 */
public class ControladorConfigurarHabitacion {
    
    public ControladorConfigurarHabitacion(){}
     public ControladorConfigurarHabitacion(JButton botonCancelar,JButton irEstanciaSeleccionada,JComboBox eleccion,JComboBox camaSimpleBox,JComboBox camaDobleBox,JComboBox camaNiñoBox){
        irEstanciaSeleccionada.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                //cargarEstanciaSeleccionada(eleccion);
                configMasHabitaciones(eleccion);
                cogerDatosEleccion(camaSimpleBox,camaDobleBox,camaNiñoBox);
                
                
                
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
     
     
     public void cargarEstanciaSeleccionada(JComboBox eleccion){
            VistaEstanciaSeleccionada vistaes=new VistaEstanciaSeleccionada(eleccion);
            vistaes.setBounds(0,0,600,730);
            vistaes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            vistaes.setVisible(true);

          
     }
     
       public void cogerDatosEleccion(JComboBox camaSimpleBox,JComboBox camaDobleBox,JComboBox camaNiñoBox){
            Habitacion.habitacion1.setCama_simple((int) camaSimpleBox.getSelectedItem());
            Habitacion.habitacion1.setCama_doble((int) camaDobleBox.getSelectedItem());
            Habitacion.habitacion1.setCama_nino((int) camaNiñoBox.getSelectedItem());
            Habitacion.habitacion1.coincidencia();
            Habitacion.comprobarDisponibilidad();
//            if(!Habitacion.isDisponibilidad()){
//              JOptionPane.showMessageDialog(null,"La habitacion elejida no esta disponible en esas fechas");  
//            }
//            System.out.println(Habitacion.isDisponibilidad());
            
            ControladorEstanciaSeleccionada con= new ControladorEstanciaSeleccionada();
            con.cargarValores();
            
            System.out.println(Habitacion.habitacion1.getCama_simple()+" "+Habitacion.habitacion1.getCama_doble()+" "+Habitacion.habitacion1.getCama_nino());
         }
       

                 public void configMasHabitaciones(JComboBox eleccion){
              


                  cargarEstanciaSeleccionada(eleccion);

          }
}
