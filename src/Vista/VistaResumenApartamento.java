/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorResumenApartamento;
import Modelo.Apartamento;
import javax.swing.*;
import static vista.VistaPago.logo1;

/**
 *
 * @author ira_a
 */
public class VistaResumenApartamento extends JFrame {
    
        JLabel mensajeCodigo_Descuento;
    public static JTextField fieldCodigoDescuento;
    JButton botonSiguiente;
    JTextField resumenCasa;
    JLabel labelFechaInicio,labelFechaFin, diasYPrecio;
    
    
    public VistaResumenApartamento(){
        
                botonSiguiente=new javax.swing.JButton();
        
                setLayout(null);
        
        
        
        resumenCasa=new JTextField("Codigo Apartamento: "+Apartamento.apartamento1.getCodigoApartamento()+" Ciudad: "+Apartamento.apartamento1.getCiudad()+" Personas Maximas: "+Apartamento.apartamento1.getNum_personas());
        resumenCasa.setBounds(300,240,350,30);
        resumenCasa.setEditable(false);
        add(resumenCasa);
        
                
        labelFechaInicio=new JLabel ("Fecha Inicio: "+Apartamento.apartamento1.getFechaEntrada());
        labelFechaInicio.setBounds(300,350,200,30);
        add(labelFechaInicio);
        
                labelFechaFin=new JLabel ("Fecha Fin: "+Apartamento.apartamento1.getFechaSalida());
        labelFechaFin.setBounds(525,350,200,30);
        add(labelFechaFin);
        
        mensajeCodigo_Descuento=new JLabel("Introduce el Codigo");
        mensajeCodigo_Descuento.setBounds(400,440,200,30);
        add(mensajeCodigo_Descuento);
        
        fieldCodigoDescuento=new JTextField("");
        fieldCodigoDescuento.setBounds(380,480,150,30);
        add(fieldCodigoDescuento);
        
        diasYPrecio=new JLabel("Dias Normales: "+Apartamento.apartamento1.getCantidadDiasNormales()+" Dias Festivos: "+Apartamento.apartamento1.getCantidadDiasFestivos()+" Precio Total: "+Double.toString(Apartamento.apartamento1.getPrecioFinal()));
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
            
            ControladorResumenApartamento contApart=new ControladorResumenApartamento(botonCancelar,botonSiguiente,fieldCodigoDescuento);
    }
    
}
