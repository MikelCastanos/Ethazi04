/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import static Controlador.ControladorPago.cantidad_insertada;
import Modelo.Alojamiento;
import Modelo.Apartamento;
import Modelo.Hotel;
import Vista.VistaBienvenida;
import Vista.VistaComplementosApartamento;
import com.toedter.calendar.JDateChooser;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author shabi
 */
public class ControladorUbicacionApartamento {
    
        public ControladorUbicacionApartamento(JButton botonCancelar,JButton botonSiguienteUbicacionApartamento,JComboBox comboBoxUbicacionApartamento,JComboBox comboBoxNumeroPersonasApartamento,JDateChooser fechaEntradaApartamento,JDateChooser fechaSalidaApartamento){
        botonSiguienteUbicacionApartamento.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                
                cogerDatosUbicacionApartamento(comboBoxUbicacionApartamento,comboBoxNumeroPersonasApartamento,fechaEntradaApartamento,fechaSalidaApartamento);
                siguienteVentanaApartamento();
                
                
            }
            
        });
        botonCancelar.addMouseListener(new MouseAdapter(){
             public void mouseClicked(MouseEvent a){
                cancelar();
    }
             });
    }
        
        public void rellenarComboBox (JComboBox comboBoxUbicacionApartamento){
        Apartamento apartamento= new Apartamento();
    //           hotel.ubicacion();

         Iterator<String> i= apartamento.ubicacionApartamento().iterator();
         while(i.hasNext()){
           comboBoxUbicacionApartamento.addItem(i.next()); 
        }
         }
            
            
             public void cogerDatosUbicacionApartamento(JComboBox comboBoxUbicacionApartamento, JComboBox comboBoxNumeroPersonasApartamento,JDateChooser fechaEntradaApartamento,JDateChooser fechaSalidaApartamento){
        
        
        //COGEMOS EL NUMERO DE PERSONAS DEL COMBOBOX Y LO PASAMOS AL MODELO
        Alojamiento.alojamiento1.setNum_personas((int)comboBoxNumeroPersonasApartamento.getSelectedItem());
        System.out.println(Alojamiento.alojamiento1.getNum_personas());
        
        //PASAMOS LOS JDATECHOOSER A FECHA NORMAL
        Date fech1=fechaEntradaApartamento.getDate();
        Date fech2=fechaSalidaApartamento.getDate();

        
        //CHECKEAMOS QUE NO HAYA FECHAS VACIAS
        if(fech1==null||fech2==null){
            JOptionPane.showMessageDialog(null,"Debe seleccionar una Fecha de inicio y una Fecha fin");
        }
        
        //SI LAS FECHAS NO ESTAN VACIAS LAS COMPARAMOS PARA QUE LA FECHA FINAL SEA MAYOR A LA FECHA INICIO
       if(fech1!=null&&fech2!=null){
        if(fechaEntradaApartamento.getDate().compareTo(fechaSalidaApartamento.getDate())==0||fechaEntradaApartamento.getDate().compareTo(fechaSalidaApartamento.getDate())>0){
            JOptionPane.showMessageDialog(null,"Fecha fin invalida. Selecciona al menos una noche.");
        }
        
        
        else{
            
            
            //ESTE CODIGO CALCULA EL NUMERO DE DIAS QUE HAY ENTRE LA FECHA ENTRADA Y LA FECHA SALIDA

            //Creamos un formato para darle a las fechas
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String date = sdf.format(fechaEntradaApartamento.getDate());
                
                //Set de FechaEntrada al Modelo
                Alojamiento.alojamiento1.setFechaEntrada(date);
                
                String date2 = sdf.format(fechaSalidaApartamento.getDate());
                //Set de FechaSalida al Modelo
                Alojamiento.alojamiento1.setFechaSalida(date2);
                
                //Cogemos las fechas otra vez para calcular los dias que hay entre medio
            Date dat1=fechaEntradaApartamento.getDate();
            Date dat2=fechaSalidaApartamento.getDate();

            Instant now = dat1.toInstant();
            Instant now2 = dat2.toInstant();
            int otro = (int) ChronoUnit.DAYS.between(now,now2);
            
            //Llevamos el numero de dias al Modelo
            Alojamiento.alojamiento1.setDiasEstancia(otro);
            
            //Llevamos la ciudad seleccionada al Modelo
            Alojamiento.alojamiento1.setCiudad((String)comboBoxUbicacionApartamento.getSelectedItem());
            
                System.out.println("Fecha entrada Apartamento"+Alojamiento.alojamiento1.getFechaEntrada());
                System.out.println("Fecha entrada Apartamento"+Alojamiento.alojamiento1.getFechaSalida());
                System.out.println("Dias Estancia Apartamento: "+Alojamiento.alojamiento1.getDiasEstancia());
                System.out.println("Ciudad Alojamiento Apartamento: "+ Alojamiento.alojamiento1.getCiudad());
                System.out.println("Numero de Personas Apartamento: "+Alojamiento.alojamiento1.getNum_personas());
        } }}
             
                 public void siguienteVentanaApartamento(){
        

//            VistaEleccion vistae=new VistaEleccion();
//            vistae.setBounds(0,0,600,730);
//            vistae.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            vistae.setVisible(true);
           // cogerDatos(ubicacion,combobox_numero_habitaciones);
            
            
            VistaComplementosApartamento VistaCompleAp=new VistaComplementosApartamento();
                VistaCompleAp.setBounds(0,0,600,730);
                VistaCompleAp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                VistaCompleAp.setVisible(true);

    }
                 public void cancelar(){
          JOptionPane.showMessageDialog(null,"Pedido cancelado. Volverá a la pantalla de inicio. ¡Hasta la proxima!");
            cantidad_insertada=0;
            VistaBienvenida iniciostart=new VistaBienvenida();
            iniciostart.setBounds(0,0,600,730);
            iniciostart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            iniciostart.setVisible(true);
          
          }
    
}
