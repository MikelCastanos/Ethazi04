/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorDosHabitaciones;
import javax.swing.*;
import static vista.VistaPago.logo1;

public class VistaDosHabitacionesHotel extends JFrame{
    
    JLabel labelResultados2Habitaciones,labelPrimeraHabitacion,labelSegundaHabitacion;
    JComboBox comboBoxResultados2Habitaciones1,comboBoxResultados2Habitaciones2;
    JButton botonSiguienteDosHabitaciones;
    
    
    
    
    
    public VistaDosHabitacionesHotel(){
        setLayout(null);
        
        botonSiguienteDosHabitaciones=new javax.swing.JButton();
        botonSiguienteDosHabitaciones=new JButton("Siguiente");
        botonSiguienteDosHabitaciones.setBounds(480,600,100,30);
        add(botonSiguienteDosHabitaciones);
        
        JButton botonCancelar=new JButton("Cancelar");
        botonCancelar.setBounds(360,600,100,30);
        add(botonCancelar);
        
        labelResultados2Habitaciones=new JLabel("Estos son los resultados: ");
        labelResultados2Habitaciones.setBounds(400,200,200,30);
        add(labelResultados2Habitaciones);
        
        
        labelPrimeraHabitacion=new JLabel("Primera Habitacion: ");
        labelPrimeraHabitacion.setBounds(250,250,200,30);
        add(labelPrimeraHabitacion);
        
        labelSegundaHabitacion=new JLabel("Segunda Habitacion: ");
        labelSegundaHabitacion.setBounds(500,250,200,30);
        add(labelSegundaHabitacion);
        
        comboBoxResultados2Habitaciones1=new JComboBox();
        comboBoxResultados2Habitaciones1.setBounds(250,280,200,30);
        add(comboBoxResultados2Habitaciones1);
        
        comboBoxResultados2Habitaciones2=new JComboBox();
        comboBoxResultados2Habitaciones2.setBounds(500,280,200,30);
        add(comboBoxResultados2Habitaciones2);
        
        
            ImageIcon icon=new ImageIcon("src//images/disponible.png");
        JLabel logo2 = new JLabel(icon);
            logo2.setSize(900,200);
            add(logo2);
            validate();
        
            ImageIcon icono=new ImageIcon("src//images/fondo.png");
            logo1=new JLabel(icono);
            logo1.setSize(900,692);
            add(logo1);
            validate();
            
            ControladorDosHabitaciones controladorDosHab=new ControladorDosHabitaciones(botonCancelar,botonSiguienteDosHabitaciones,comboBoxResultados2Habitaciones1,comboBoxResultados2Habitaciones2);
            controladorDosHab.rellenarComboBox(comboBoxResultados2Habitaciones1);
            controladorDosHab.rellenarComboBox2(comboBoxResultados2Habitaciones2);
            //controladorUnaHab.rellenarComboBox(comboBoxUbicacionCasa);
    }
    

    
}
