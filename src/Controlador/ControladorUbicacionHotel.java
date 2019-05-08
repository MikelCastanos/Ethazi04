/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VistaBienvenida;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;
import Vista.*;
import Modelo.*;
import java.awt.event.MouseEvent;
import java.util.Iterator;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Modelo.Hotel;
import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.time.temporal.ChronoUnit;

public class ControladorUbicacionHotel {
    
    
    static String seleccionUbicacion;
    
    public ControladorUbicacionHotel(){}
    
    public ControladorUbicacionHotel(JButton boton_siguiente2,JComboBox ubicacion,JComboBox combobox_numero_habitaciones,JDateChooser fecha_inicio,JDateChooser fecha_fin){
        boton_siguiente2.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
               fechaSeleccionada(fecha_inicio,fecha_fin);
                checkearFechas(ubicacion,combobox_numero_habitaciones,fecha_inicio,fecha_fin);
                

            }
            
        });
    }


   
    
    public void accionBoton(JComboBox ubicacion, JComboBox combobox_numero_habitaciones,JDateChooser fecha_inicio,JDateChooser fecha_fin){
        
            
        
//            VistaEleccion vistae=new VistaEleccion();
//            vistae.setBounds(0,0,600,730);
//            vistae.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            vistae.setVisible(true);
            cogerDatos(ubicacion,combobox_numero_habitaciones);
            
            if(Hotel.hotel1.getNum_habitaciones()==1){
                VistaUnaHabitacion vistauna=new VistaUnaHabitacion();
                vistauna.setBounds(0,0,600,730);
                vistauna.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                vistauna.setVisible(true);
            }
            if(Hotel.hotel1.getNum_habitaciones()==2){
                VistaDosHabitaciones vistados=new VistaDosHabitaciones();
                vistados.setBounds(0,0,600,730);
                vistados.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                vistados.setVisible(true);
            }
            if(Hotel.hotel1.getNum_habitaciones()==3){
                VistaTresHabitaciones vistatres=new VistaTresHabitaciones();
                vistatres.setBounds(0,0,600,730);
                vistatres.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                vistatres.setVisible(true);
            }
            
            System.out.println(seleccionUbicacion);
            System.out.println("Numero de habitaciones: "+Hotel.hotel1.getNum_habitaciones());
            
            

    }
    
    public void checkearFechas(JComboBox ubicacion, JComboBox combobox_numero_habitaciones,JDateChooser fecha_inicio,JDateChooser fecha_fin){

//        String fecha1=fecha_inicio.getDate().toString();
//        String fecha2=fecha_inicio.getDate().toString();
//        System.out.println(fecha1);
//        System.out.println(fecha2);
        
        Date fech1=fecha_inicio.getDate();
        Date fech2=fecha_fin.getDate();

        if(fech1==null||fech2==null){
            JOptionPane.showMessageDialog(null,"Debe seleccionar una Fecha de inicio y una Fecha fin");
        }
        
       if(fech1!=null&&fech2!=null){
        if(fecha_inicio.getDate().compareTo(fecha_fin.getDate())==0||fecha_inicio.getDate().compareTo(fecha_fin.getDate())>0){
            JOptionPane.showMessageDialog(null,"Fecha fin invalida. Selecciona al menos una noche.");
        }
        
        
        else{
            accionBoton(ubicacion,combobox_numero_habitaciones,fecha_inicio,fecha_fin);
            
            //ESTE CODIGO CALCULA EL NUMERO DE DIAS QUE HAY ENTRE LA FECHA ENTRADA Y LA FECHA SALIDA
            Date date1=fecha_inicio.getDate();
            Date date2=fecha_fin.getDate();

            Instant now = date1.toInstant();
            Instant now2 = date2.toInstant();
            int otro = (int) ChronoUnit.DAYS.between(now,now2);
           
            
            Hotel.hotel1.setDiasEstancia(otro);
        } }
        
    }
    

         public void rellenarComboBox (JComboBox ubicacion){
           Hotel hotel= new Hotel();
//           hotel.ubicacion();
           
        Iterator<String> i= hotel.ubicacion().iterator();
        while(i.hasNext()){
           ubicacion.addItem(i.next()); 
        }
         }

       
         public void cogerDatos(JComboBox ubicacion, JComboBox combobox_numero_habitaciones){
            seleccionUbicacion=ubicacion.getSelectedItem().toString();
            Hotel.hotel1.setNum_habitaciones((int)combobox_numero_habitaciones.getSelectedItem());
            
            
         }
         
         public void fechaSeleccionada(JDateChooser fecha_inicio,JDateChooser fecha_fin){
//            
             try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String date = sdf.format(fecha_inicio.getDate());
                Hotel.hotel1.setFechaEntrada(date);
                } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Elija una fecha de Entrada ", "Error..!!", JOptionPane.ERROR_MESSAGE);
                 
                }
             System.out.println("Fecha entrada "+Hotel.hotel1.getFechaEntrada());
             
                try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String date = sdf.format(fecha_fin.getDate());
                Hotel.hotel1.setFechaSalida(date);
                } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Elija una fecha de Salida ", "Error..!!", JOptionPane.ERROR_MESSAGE);
                 
                }
                System.out.println("Fecha salida "+Hotel.hotel1.getFechaEntrada());
         }

//   Crear metodo que NO permita selecionar una fecha de salida anterior a la fecha de entrada !
         




    


        


}
    

