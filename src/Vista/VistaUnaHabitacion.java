/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import Controlador.ControladorUnaHabitacion;
import javax.swing.*;
import static vista.VistaPago.logo1;
/**
 *
 * @author shabi
 */
public class VistaUnaHabitacion extends JFrame {
    
    JLabel labelResultadosHabitacion;
    JComboBox comboBoxResultadosHabitaciones;
    JButton botonSiguienteUnaHabitacion;
    
    
    public VistaUnaHabitacion(){
        
        setLayout(null);
        
        botonSiguienteUnaHabitacion=new javax.swing.JButton();
        botonSiguienteUnaHabitacion=new JButton("Siguiente");
        botonSiguienteUnaHabitacion.setBounds(450,600,100,30);
        add(botonSiguienteUnaHabitacion);
        
        
        labelResultadosHabitacion=new JLabel("Estos son los resultados:");
        labelResultadosHabitacion.setBounds(200,200,200,30);
        add(labelResultadosHabitacion);
        
        comboBoxResultadosHabitaciones=new JComboBox();
        comboBoxResultadosHabitaciones.setBounds(180,230,200,30);
        add(comboBoxResultadosHabitaciones);
        
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
            
                            ControladorUnaHabitacion controladorUnaHab=new ControladorUnaHabitacion(botonSiguienteUnaHabitacion,comboBoxResultadosHabitaciones);

                //controladorUnaHab.rellenarComboBox(comboBoxUbicacionCasa);
    }
    
    public static void main(String[] args) {
        VistaUnaHabitacion vi=new VistaUnaHabitacion();
                        vi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                vi.setBounds(0,0,600,725);
                vi.setVisible(true);
    }
}
