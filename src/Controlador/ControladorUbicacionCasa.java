/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import static Controlador.ControladorPago.cantidad_insertada;
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

/**
 *
 * @author shabi
 */
public class ControladorUbicacionCasa {
    
    
    public ControladorUbicacionCasa(){}

    public ControladorUbicacionCasa(JButton botonCancelar,JButton botonSiguienteUbicacionCasa,JComboBox comboBoxUbicacionCasa,JComboBox comboBoxNumeroPersonasCasa,JDateChooser fechaEntradaCasa,JDateChooser fechaSalidaCasa){
        botonSiguienteUbicacionCasa.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                
                cogerDatosUbicacionCasa(comboBoxUbicacionCasa,comboBoxNumeroPersonasCasa,fechaEntradaCasa,fechaSalidaCasa);
                siguienteVentanaCasa();
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
    public void rellenarComboBox (JComboBox comboBoxUbicacionCasa){
        Casa casa=new Casa();
        Iterator<String> i= casa.ubicacionCasa().iterator();
        while(i.hasNext()){
            comboBoxUbicacionCasa.addItem(i.next()); 
        }
         }
    
    
    public void cogerDatosUbicacionCasa(JComboBox comboBoxUbicacionCasa, JComboBox comboBoxNumeroPersonasCasa,JDateChooser fechaEntradaCasa,JDateChooser fechaSalidaCasa){
        
        
        //COGEMOS EL NUMERO DE PERSONAS DEL COMBOBOX Y LO PASAMOS AL MODELO
        Alojamiento.alojamiento1.setNum_personas((int)comboBoxNumeroPersonasCasa.getSelectedItem());
        System.out.println(Alojamiento.alojamiento1.getNum_personas());
        
        //PASAMOS LOS JDATECHOOSER A FECHA NORMAL
        Date fech1=fechaEntradaCasa.getDate();
        Date fech2=fechaSalidaCasa.getDate();

        
        //CHECKEAMOS QUE NO HAYA FECHAS VACIAS
        if(fech1==null||fech2==null){
            JOptionPane.showMessageDialog(null,"Debe seleccionar una Fecha de inicio y una Fecha fin");
        }
        
        //SI LAS FECHAS NO ESTAN VACIAS LAS COMPARAMOS PARA QUE LA FECHA FINAL SEA MAYOR A LA FECHA INICIO
       if(fech1!=null&&fech2!=null){
        if(fechaEntradaCasa.getDate().compareTo(fechaSalidaCasa.getDate())==0||fechaEntradaCasa.getDate().compareTo(fechaSalidaCasa.getDate())>0){
            JOptionPane.showMessageDialog(null,"Fecha fin invalida. Selecciona al menos una noche.");
        }
        
        
        else{
            
            
            //ESTE CODIGO CALCULA EL NUMERO DE DIAS QUE HAY ENTRE LA FECHA ENTRADA Y LA FECHA SALIDA

            //Creamos un formato para darle a las fechas
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String date = sdf.format(fechaEntradaCasa.getDate());
                
                //Set de FechaEntrada al Modelo
                Alojamiento.alojamiento1.setFechaEntrada(date);
                
                String date2 = sdf.format(fechaSalidaCasa.getDate());
                //Set de FechaSalida al Modelo
                Alojamiento.alojamiento1.setFechaSalida(date2);
                
                //Cogemos las fechas otra vez para calcular los dias que hay entre medio
            Date dat1=fechaEntradaCasa.getDate();
            Date dat2=fechaSalidaCasa.getDate();

            Instant now = dat1.toInstant();
            Instant now2 = dat2.toInstant();
            int otro = (int) ChronoUnit.DAYS.between(now,now2);
            
            //Llevamos el numero de dias al Modelo
            Alojamiento.alojamiento1.setDiasEstancia(otro);
            
            //Llevamos la ciudad seleccionada al Modelo
            Alojamiento.alojamiento1.setCiudad((String)comboBoxUbicacionCasa.getSelectedItem());
            
                System.out.println("Fecha entrada Casa: "+Alojamiento.alojamiento1.getFechaEntrada());
                System.out.println("Fecha entrada Casa: "+Alojamiento.alojamiento1.getFechaSalida());
                System.out.println("Dias Estancia Casa: "+Alojamiento.alojamiento1.getDiasEstancia());
                System.out.println("Ciudad Alojamiento Casa: "+ Alojamiento.alojamiento1.getCiudad());
                System.out.println("Numero de Personas Casa: "+Alojamiento.alojamiento1.getNum_personas());
        } }}


    public void siguienteVentanaCasa(){
        

//            VistaEleccion vistae=new VistaEleccion();
//            vistae.setBounds(0,0,600,730);
//            vistae.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            vistae.setVisible(true);
           // cogerDatos(ubicacion,combobox_numero_habitaciones);
            
            
            VistaComplementosCasa VistaCompleCa=new VistaComplementosCasa();
                VistaCompleCa.setBounds(0,0,600,730);
                VistaCompleCa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                VistaCompleCa.setVisible(true);

    }



}
       
       

                
    

