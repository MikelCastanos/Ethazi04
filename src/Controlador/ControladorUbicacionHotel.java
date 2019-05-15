/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import static Controlador.ControladorPago.cantidad_insertada;
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
    
    public ControladorUbicacionHotel(JButton botonCancelar,JButton boton_siguiente2,JComboBox ubicacion,JComboBox combobox_numero_habitaciones,JDateChooser fecha_inicio,JDateChooser fecha_fin){
        boton_siguiente2.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
               //fechaSeleccionada(fecha_inicio,fecha_fin);
                //checkearFechas(ubicacion,combobox_numero_habitaciones,fecha_inicio,fecha_fin);
                
                cogerDatosUbicacionHotel( ubicacion,  combobox_numero_habitaciones, fecha_inicio, fecha_fin);
                Alojamiento.alojamiento1.calcularDiasFestivos();
                siguienteVentana();

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
    
    public void siguienteVentana(){
        
            
        
//            VistaEleccion vistae=new VistaEleccion();
//            vistae.setBounds(0,0,600,730);
//            vistae.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            vistae.setVisible(true);
           // cogerDatos(ubicacion,combobox_numero_habitaciones);
            
            
            VistaComplementosHotel VistaComple=new VistaComplementosHotel();
                VistaComple.setBounds(0,0,600,730);
                VistaComple.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                VistaComple.setVisible(true);
            

            
            System.out.println(seleccionUbicacion);

            
            

    }
    
//    public void checkearFechas(JComboBox ubicacion, JComboBox combobox_numero_habitaciones,JDateChooser fecha_inicio,JDateChooser fecha_fin){
//
////        String fecha1=fecha_inicio.getDate().toString();
////        String fecha2=fecha_inicio.getDate().toString();
////        System.out.println(fecha1);
////        System.out.println(fecha2);
//        
//        Date fech1=fecha_inicio.getDate();
//        Date fech2=fecha_fin.getDate();
//
//        if(fech1==null||fech2==null){
//            JOptionPane.showMessageDialog(null,"Debe seleccionar una Fecha de inicio y una Fecha fin");
//        }
//        
//       if(fech1!=null&&fech2!=null){
//        if(fecha_inicio.getDate().compareTo(fecha_fin.getDate())==0||fecha_inicio.getDate().compareTo(fecha_fin.getDate())>0){
//            JOptionPane.showMessageDialog(null,"Fecha fin invalida. Selecciona al menos una noche.");
//        }
//        
//        
//        else{
//            accionBoton(ubicacion,combobox_numero_habitaciones,fecha_inicio,fecha_fin);
//            
//            //ESTE CODIGO CALCULA EL NUMERO DE DIAS QUE HAY ENTRE LA FECHA ENTRADA Y LA FECHA SALIDA
//            Date date1=fecha_inicio.getDate();
//            Date date2=fecha_fin.getDate();
//
//            Instant now = date1.toInstant();
//            Instant now2 = date2.toInstant();
//            int otro = (int) ChronoUnit.DAYS.between(now,now2);
//           
//            
//            Alojamiento.alojamiento1.setDiasEstancia(otro);
 //      }
//}    
//    }
    
//    Esto esta bien
         public void rellenarComboBox (JComboBox ubicacion){
            Hotel hotel= new Hotel();
            Iterator<String> i= hotel.ubicacion().iterator();
            while(i.hasNext()){
               ubicacion.addItem(i.next()); 
            }

             }

       
//         public void cogerDatos(JComboBox ubicacion, JComboBox combobox_numero_habitaciones){
//            seleccionUbicacion=ubicacion.getSelectedItem().toString();
//            Hotel.hotel1.setNum_habitaciones((int)combobox_numero_habitaciones.getSelectedItem());
//            
//            
//         }
         
//         public void fechaSeleccionada(JDateChooser fecha_inicio,JDateChooser fecha_fin){
////            
//             try {
//                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//                String date = sdf.format(fecha_inicio.getDate());
//                Hotel.hotel1.setFechaEntrada(date);
//                } catch (Exception e) {
//                JOptionPane.showMessageDialog(null, "Elija una fecha de Entrada ", "Error..!!", JOptionPane.ERROR_MESSAGE);
//                 
//                }
//             System.out.println("Fecha entrada "+Hotel.hotel1.getFechaEntrada());
//             
//                try {
//                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//                String date = sdf.format(fecha_fin.getDate());
//                Hotel.hotel1.setFechaSalida(date);
//                } catch (Exception e) {
//                JOptionPane.showMessageDialog(null, "Elija una fecha de Salida ", "Error..!!", JOptionPane.ERROR_MESSAGE);
//                 
//                }
//                System.out.println("Fecha salida "+Hotel.hotel1.getFechaEntrada());
//         }

//   Crear metodo que NO permita selecionar una fecha de salida anterior a la fecha de entrada !
         


         public void cogerDatosUbicacionHotel(JComboBox ubicacion, JComboBox combobox_numero_habitaciones,JDateChooser fecha_inicio,JDateChooser fecha_fin){
        
        
        //COGEMOS EL NUMERO DE PERSONAS DEL COMBOBOX Y LO PASAMOS AL MODELO
        Alojamiento.alojamiento1.setNum_habitaciones((int)combobox_numero_habitaciones.getSelectedItem());
        System.out.println(Alojamiento.alojamiento1.getNum_habitaciones());
        
        //PASAMOS LOS JDATECHOOSER A FECHA NORMAL
        Date fech1=fecha_inicio.getDate();
        Date fech2=fecha_fin.getDate();

        
        //CHECKEAMOS QUE NO HAYA FECHAS VACIAS
        if(fech1==null||fech2==null){
            JOptionPane.showMessageDialog(null,"Debe seleccionar una Fecha de inicio y una Fecha fin");
        }
        
        //SI LAS FECHAS NO ESTAN VACIAS LAS COMPARAMOS PARA QUE LA FECHA FINAL SEA MAYOR A LA FECHA INICIO
       if(fech1!=null&&fech2!=null){
        if(fecha_inicio.getDate().compareTo(fecha_fin.getDate())==0||fecha_inicio.getDate().compareTo(fecha_fin.getDate())>0){
            JOptionPane.showMessageDialog(null,"Fecha fin invalida. Selecciona al menos una noche.");
        }
        
        
        else{
            
            
            //ESTE CODIGO CALCULA EL NUMERO DE DIAS QUE HAY ENTRE LA FECHA ENTRADA Y LA FECHA SALIDA

            //Creamos un formato para darle a las fechas
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String date = sdf.format(fecha_inicio.getDate());
                
                //Set de FechaEntrada al Modelo
                Alojamiento.alojamiento1.setFechaEntrada(date);
                
                String date2 = sdf.format(fecha_fin.getDate());
                //Set de FechaSalida al Modelo
                Alojamiento.alojamiento1.setFechaSalida(date2);
                
                //Cogemos las fechas otra vez para calcular los dias que hay entre medio
            Date dat1=fecha_inicio.getDate();
            Date dat2=fecha_fin.getDate();

            Instant now = dat1.toInstant();
            Instant now2 = dat2.toInstant();
            int otro = (int) ChronoUnit.DAYS.between(now,now2);
            
            //Llevamos el numero de dias al Modelo
            Alojamiento.alojamiento1.setDiasEstancia(otro);
            
            //Llevamos la ciudad seleccionada al Modelo
            Alojamiento.alojamiento1.setCiudad((String)ubicacion.getSelectedItem());
            seleccionUbicacion=ubicacion.getSelectedItem().toString();
            
                System.out.println("Fecha entrada "+Alojamiento.alojamiento1.getFechaEntrada());
                System.out.println("Fecha entrada "+Alojamiento.alojamiento1.getFechaSalida());
                System.out.println("Dias Estancia: "+Alojamiento.alojamiento1.getDiasEstancia());
                System.out.println("Ciudad Alojamiento: "+ Alojamiento.alojamiento1.getCiudad());
                System.out.println("Numero de habitaciones: "+Alojamiento.alojamiento1.getNum_habitaciones());
                System.out.println(seleccionUbicacion);
        } }}

    


        


}
    

