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
                
                resumenHotel=new JTextField("Hotel: "+Hotel.hotel1.getNombreHotel()+" Ciudad: "+Hotel.hotel1.getCiudad()+" Numero Habitaciones: "+Alojamiento.alojamiento1.getNum_habitaciones());
                resumenHotel.setBounds(100,200,400,30);
                resumenHotel.setEditable(false);
                add(resumenHotel);
                
                resumenCasa=new JTextField("Codigo Casa: "+Casa.casa1.getCodigo_casa()+" Ciudad: "+Casa.casa1.getCiudad()+" Personas Maximas: "+Casa.casa1.getNum_personas());
                resumenCasa.setBounds(100,240,400,30);
                resumenCasa.setEditable(false);
                add(resumenCasa);
                
                resumenApartamento=new JTextField("Codigo Apartamento: "+Apartamento.apartamento1.getCodigoApartamento()+" Ciudad: "+Apartamento.apartamento1.getCiudad()+" Personas Maximas: "+Apartamento.apartamento1.getNum_personas());
                resumenApartamento.setBounds(100,280,400,30);
                resumenApartamento.setEditable(false);
                add(resumenApartamento);
               
                
        
        labelFechaInicio=new JLabel ("Fecha Inicio: "+Alojamiento.alojamiento1.getFechaEntrada());
        labelFechaInicio.setBounds(100,350,200,30);
        add(labelFechaInicio);
        
                labelFechaFin=new JLabel ("Fecha Fin: "+Alojamiento.alojamiento1.getFechaSalida());
        labelFechaFin.setBounds(350,350,200,30);
        add(labelFechaFin);
        
        mensajeCodigo_Descuento=new JLabel("Introduce el Codigo");
        mensajeCodigo_Descuento.setBounds(200,440,200,30);
        add(mensajeCodigo_Descuento);
        
        fieldCodigoDescuento=new JTextField("");
        fieldCodigoDescuento.setBounds(180,480,200,30);
        add(fieldCodigoDescuento);
        
        diasYPrecio=new JLabel("Dias Normales: "+Alojamiento.alojamiento1.getCantidadDiasNormales()+" Dias Festivos: "+Alojamiento.alojamiento1.getCantidadDiasFestivos()+" Precio Total: "+Double.toString(Alojamiento.alojamiento1.getPrecioFinal()));
        diasYPrecio.setBounds(100,400,400,30);
        add(diasYPrecio);
        
                botonSiguiente=new JButton("Siguiente");
        botonSiguiente.setBounds(450,600,100,30);
        add(botonSiguiente);
        
                JButton botonCancelar=new JButton("Cancelar");
        botonCancelar.setBounds(150,600,100,30);
        add(botonCancelar);
        
                ImageIcon icon=new ImageIcon("src//images/Bidaion.png");
        JLabel logo2 = new JLabel(icon);
            logo2.setSize(575,200);
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
