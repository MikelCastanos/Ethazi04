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
import static Modelo.Hotel.hotel1;

public class ControladorUbicacionHotel {
    
    
    static String seleccionUbicacion;
    
    public ControladorUbicacionHotel(){}
    
    public ControladorUbicacionHotel(JButton botonCancelar,JButton boton_siguiente2,JComboBox ubicacion,JComboBox combobox_numero_habitaciones,JDateChooser fecha_inicio,JDateChooser fecha_fin){
        boton_siguiente2.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
               //fechaSeleccionada(fecha_inicio,fecha_fin);
                //checkearFechas(ubicacion,combobox_numero_habitaciones,fecha_inicio,fecha_fin);
                Alojamiento alojamiento= new Alojamiento();
                cogerDatosUbicacionHotel( ubicacion,  combobox_numero_habitaciones, fecha_inicio, fecha_fin);
//                Alojamiento.alojamiento1.calcularDiasFestivos(hotel1.getFechaEntrada(),hotel1.getFechaSalida());
                siguienteVentana();
                
                hotel1.setCantidadDiasFestivos(alojamiento.calcularDiasFestivos(hotel1.getFechaEntrada(),hotel1.getFechaSalida()));
                hotel1.setCantidadDiasNormales(alojamiento.calcularDiasNormales(alojamiento.calcularDiasFestivos(hotel1.getFechaEntrada(),hotel1.getFechaSalida()),hotel1.getDiasEstancia()));

                
                
                    System.out.println("Su estancia va a ser de: ");
                    System.out.println(hotel1.getDiasEstancia());
                    System.out.println("De los cuales son dias normales: ");
                    System.out.println(hotel1.getCantidadDiasNormales());
                    System.out.println("Y Dias Festivos: ");
                    System.out.println(hotel1.getCantidadDiasFestivos());

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
            iniciostart.setSize(905,720);
            iniciostart.setResizable(false);    iniciostart.setLocationRelativeTo(null);
            iniciostart.setVisible(true);
            iniciostart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            iniciostart.setVisible(true);
          
          }
    
    public void siguienteVentana(){

            VistaComplementosHotel VistaComple=new VistaComplementosHotel();
            VistaComple.setSize(905,720);
            VistaComple.setResizable(false);    VistaComple.setLocationRelativeTo(null);
            VistaComple.setVisible(true);
            VistaComple.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            VistaComple.setVisible(true);
            

            
            System.out.println(seleccionUbicacion);

            
    }
    
         public void rellenarComboBox (JComboBox ubicacion){
            Hotel hotel= new Hotel();
            Iterator<String> i= hotel.ubicacion().iterator();
            while(i.hasNext()){
                ubicacion.addItem(i.next()); 
            }
             }

//   Crear metodo que NO permita selecionar una fecha de salida anterior a la fecha de entrada !
         
    public void cogerDatosUbicacionHotel(JComboBox ubicacion, JComboBox combobox_numero_habitaciones,JDateChooser fecha_inicio,JDateChooser fecha_fin){
        
        
        //COGEMOS EL NUMERO DE PERSONAS DEL COMBOBOX Y LO PASAMOS AL MODELO
        hotel1.setNum_habitaciones((int)combobox_numero_habitaciones.getSelectedItem());
        System.out.println(hotel1.getNum_habitaciones());
        
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
        }else{
            
            //ESTE CODIGO CALCULA EL NUMERO DE DIAS QUE HAY ENTRE LA FECHA ENTRADA Y LA FECHA SALIDA

            //Creamos un formato para darle a las fechas
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(fecha_inicio.getDate());

            //Set de FechaEntrada al Modelo
            hotel1.setFechaEntrada(date);

            String date2 = sdf.format(fecha_fin.getDate());
            //Set de FechaSalida al Modelo
            hotel1.setFechaSalida(date2);
                
                //Cogemos las fechas otra vez para calcular los dias que hay entre medio
            Date dat1=fecha_inicio.getDate();
            Date dat2=fecha_fin.getDate();

            Instant now = dat1.toInstant();
            Instant now2 = dat2.toInstant();
            int otro = (int) ChronoUnit.DAYS.between(now,now2);
            
            //Llevamos el numero de dias al Modelo
            hotel1.setDiasEstancia(otro);
            
            //Llevamos la ciudad seleccionada al Modelo
            hotel1.setCiudad((String)ubicacion.getSelectedItem());
            seleccionUbicacion=ubicacion.getSelectedItem().toString();
            
                System.out.println("Fecha entrada "+hotel1.getFechaEntrada());
                System.out.println("Fecha entrada "+hotel1.getFechaSalida());
                System.out.println("Dias Estancia: "+hotel1.getDiasEstancia());
                System.out.println("Ciudad Alojamiento: "+ hotel1.getCiudad());
                System.out.println("Numero de habitaciones: "+hotel1.getNum_habitaciones());
                System.out.println(seleccionUbicacion);
        } 
       }
       
    }

}
    

