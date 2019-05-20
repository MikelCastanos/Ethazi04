/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorResumenHotel;
import Modelo.Alojamiento;
import Modelo.Apartamento;
import Modelo.Casa;
import static Modelo.Habitacion.habitacion1;
import Modelo.Hotel;
import javax.swing.JFrame;
import javax.swing.*;
import static vista.VistaPago.logo1;

/**
 *
 * @author shabi
 */
public class VistaResumenHotel extends JFrame {
    
    JLabel mensajeCodigo_Descuento;
    public static JTextField fieldCodigoDescuento;
    JButton botonSiguiente;
    JTextField resumenHotel,resumenCasa,resumenApartamento;
    JLabel labelFechaInicio,labelFechaFin, diasYPrecio;
    
    
    
    public VistaResumenHotel(){
        
        
        botonSiguiente=new javax.swing.JButton();
        
                setLayout(null);
                
                resumenHotel=new JTextField("Hotel: "+Hotel.hotel1.getNombreHotel()+" Ciudad: "+Hotel.hotel1.getCiudad()+" Numero Habitaciones: "+Hotel.hotel1.getNum_habitaciones());
                resumenHotel.setBounds(300,200,300,30);
                resumenHotel.setEditable(false);
                add(resumenHotel);
                
               
                
        
        labelFechaInicio=new JLabel ("Fecha Inicio: "+Hotel.hotel1.getFechaEntrada());
        labelFechaInicio.setBounds(300,350,200,30);
        add(labelFechaInicio);
        
                labelFechaFin=new JLabel ("Fecha Fin: "+Hotel.hotel1.getFechaSalida());
        labelFechaFin.setBounds(525,350,200,30);
        add(labelFechaFin);
        
        mensajeCodigo_Descuento=new JLabel("Introduce el Codigo");
        mensajeCodigo_Descuento.setBounds(400,440,200,30);
        add(mensajeCodigo_Descuento);
        
        fieldCodigoDescuento=new JTextField("");
        fieldCodigoDescuento.setBounds(380,480,150,30);
        add(fieldCodigoDescuento);
        
        diasYPrecio=new JLabel("Dias Normales: "+Hotel.hotel1.getCantidadDiasNormales()+" Dias Festivos: "+Hotel.hotel1.getCantidadDiasFestivos()+" Precio Total: "+Double.toString(Hotel.hotel1.getPrecioFinal()));
        diasYPrecio.setBounds(300,400,400,30);
        add(diasYPrecio);
        
                botonSiguiente=new JButton("Siguiente");
        botonSiguiente.setBounds(480,600,100,30);
        add(botonSiguiente);
        
                JButton botonCancelar=new JButton("Cancelar");
        botonCancelar.setBounds(360,600,100,30);
        add(botonCancelar);
        
                ImageIcon icon=new ImageIcon("src//images/resumen.png");
        JLabel logo2 = new JLabel(icon);
            logo2.setSize(900,200);
            add(logo2);
            validate();
        
        ImageIcon icono=new ImageIcon("src//images/fondo.png");
            logo1=new JLabel(icono);
            logo1.setSize(900,692);
            add(logo1);
            validate();
            
ControladorResumenHotel contCD=new ControladorResumenHotel(botonCancelar,botonSiguiente,fieldCodigoDescuento);
            

    }

    
}
