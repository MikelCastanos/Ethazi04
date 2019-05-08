/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import Controlador.*;
import com.toedter.calendar.JDateChooser;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import static vista.VistaPago.logo1;

/**
 *
 * @author ikasleaETHAZI
 */
public class VistaUbicacionHotel extends JFrame{
    
    JLabel mensaje_ubicacion, mensaje_alojamiento,mensaje_num_habitaciones,mensaje_fecha_inicio,mensaje_fecha_fin;
    JComboBox ubicacion,tipo_alojamiento, combobox_numero_habitaciones;
    //Date fecha_entrada, fecha_salida;
    static JButton boton_siguiente2;
    JDateChooser fecha_inicio,fecha_fin;
    
    //public static String seleccionUbicacion;
    
    public VistaUbicacionHotel(){
        boton_siguiente2=new javax.swing.JButton();
        
        setLayout(null);
        mensaje_ubicacion=new JLabel("SELECCIONAR UBICACIÓN");
        mensaje_ubicacion.setBounds(200,200,200,30);
        add(mensaje_ubicacion);
        
        ubicacion=new JComboBox();
        ubicacion.setBounds(180,230,200,30);
        add(ubicacion);
        
        mensaje_num_habitaciones=new JLabel("Cantidad Habitaciones:");
        
        
        //      JLabel y JComboBox del Numero de Habitaciones
        
        mensaje_num_habitaciones.setBounds(100,300,200,30);
        add(mensaje_num_habitaciones);
        
        combobox_numero_habitaciones=new JComboBox();
        combobox_numero_habitaciones.addItem(1);
        combobox_numero_habitaciones.addItem(2);
        combobox_numero_habitaciones.addItem(3);
        combobox_numero_habitaciones.addItem(4);
        combobox_numero_habitaciones.addItem(5);
        combobox_numero_habitaciones.setBounds(300,300,50,30);
        add(combobox_numero_habitaciones);
        
        
        //      JLabel y JDateChooser de la FECHA INICIO
        
        mensaje_fecha_inicio=new JLabel("Fecha Inicio:");
        mensaje_fecha_inicio.setBounds(90,400,100,30);
        add(mensaje_fecha_inicio);
        
        fecha_inicio=new JDateChooser();
        fecha_inicio.setMinSelectableDate(new Date());
        fecha_inicio.setBounds(170,400,100,30);
        add(fecha_inicio);
        
        //      JLabel y JDateChooser de la FECHA FIN
        
        mensaje_fecha_fin=new JLabel("Fecha Fin:");
        mensaje_fecha_fin.setBounds(290,400,100,30);
        add(mensaje_fecha_fin);
        
        fecha_fin=new JDateChooser();
        fecha_fin.setMinSelectableDate(new Date());
        fecha_fin.setBounds(350,400,100,30);
        add(fecha_fin);
        
        boton_siguiente2=new JButton("Siguiente");
        boton_siguiente2.setBounds(450,600,100,30);
        add(boton_siguiente2);
        
        ControladorUbicacionHotel cont=new ControladorUbicacionHotel(boton_siguiente2,ubicacion,combobox_numero_habitaciones,fecha_inicio,fecha_fin);
    
        cont.rellenarComboBox(ubicacion);
        
        ImageIcon icon=new ImageIcon("src//images/Bidaion.png");
        JLabel logo2 = new JLabel(icon);
            logo2.setSize(575,200);
            add(logo2);
            validate();
        
        ImageIcon icono=new ImageIcon("src//images/fondo.png");
            logo1=new JLabel(icono);
            logo1.setSize(585,695);
            add(logo1);
            validate();
            
        
    }







    
    


    

    
    
    
    
}
