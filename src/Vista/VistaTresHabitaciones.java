/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorTresHabitaciones;
import javax.swing.*;
import static vista.VistaPago.logo1;

public class VistaTresHabitaciones extends JFrame {
    
    JLabel labelResultados3Habitaciones,labelPrimeraHabitacion,labelSegundaHabitacion,labelTerceraHabitacion;
    JComboBox comboBoxResultados3Habitaciones1,comboBoxResultados3Habitaciones2,comboBoxResultados3Habitaciones3;
    JButton botonSiguienteTresHabitaciones;
    
    public VistaTresHabitaciones(){
        setLayout(null);
        
        botonSiguienteTresHabitaciones=new javax.swing.JButton();
        botonSiguienteTresHabitaciones=new JButton("Siguiente");
        botonSiguienteTresHabitaciones.setBounds(450,600,100,30);
        add(botonSiguienteTresHabitaciones);
        
        labelResultados3Habitaciones=new JLabel("Estos son los resultados: ");
        labelResultados3Habitaciones.setBounds(200,200,200,30);
        add(labelResultados3Habitaciones);
        
        
        labelPrimeraHabitacion=new JLabel("Primera Habitacion: ");
        labelPrimeraHabitacion.setBounds(25,250,200,30);
        add(labelPrimeraHabitacion);
        
        labelSegundaHabitacion=new JLabel("Segunda Habitacion: ");
        labelSegundaHabitacion.setBounds(200,250,200,30);
        add(labelSegundaHabitacion);
        
        labelTerceraHabitacion=new JLabel("Tercera Habitacion: ");
        labelTerceraHabitacion.setBounds(375,250,200,30);
        add(labelTerceraHabitacion);
        
        
        
        comboBoxResultados3Habitaciones1=new JComboBox();
        comboBoxResultados3Habitaciones1.setBounds(25,280,150,30);
        add(comboBoxResultados3Habitaciones1);
        
        comboBoxResultados3Habitaciones2=new JComboBox();
        comboBoxResultados3Habitaciones2.setBounds(200,280,150,30);
        add(comboBoxResultados3Habitaciones2);
        
        comboBoxResultados3Habitaciones3=new JComboBox();
        comboBoxResultados3Habitaciones3.setBounds(375,280,150,30);
        add(comboBoxResultados3Habitaciones3);
        
        
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
            
             ControladorTresHabitaciones controladorTresHab=new ControladorTresHabitaciones(botonSiguienteTresHabitaciones,comboBoxResultados3Habitaciones1,comboBoxResultados3Habitaciones2,comboBoxResultados3Habitaciones3);

                //controladorUnaHab.rellenarComboBox(comboBoxUbicacionCasa);
    }
    

}
