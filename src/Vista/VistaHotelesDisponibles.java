/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorHotelesDisponibles;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static vista.VistaPago.logo1;

/**
 *
 * @author ikasleaETHAZI
 */
public class VistaHotelesDisponibles extends JFrame {
    
    JLabel labelResultadosHotel;
    JComboBox comboBoxResultadosHotel;
    JButton botonSiguienteHotel;
    
    public VistaHotelesDisponibles(){
        setLayout(null);
        
        botonSiguienteHotel=new javax.swing.JButton();
        botonSiguienteHotel=new JButton("Siguiente");
        botonSiguienteHotel.setBounds(450,600,100,30);
        add(botonSiguienteHotel);
        
        JButton botonCancelar=new JButton("Cancelar");
        botonCancelar.setBounds(340,600,100,30);
        add(botonCancelar);
        
        labelResultadosHotel=new JLabel("Estos son los Hoteles disponibles");
        labelResultadosHotel.setBounds(200,200,200,30);
        add(labelResultadosHotel);
        
        comboBoxResultadosHotel=new JComboBox();
        comboBoxResultadosHotel.setBounds(180,230,200,30);
        add(comboBoxResultadosHotel);
        
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
            
                    ControladorHotelesDisponibles controladorHD=new ControladorHotelesDisponibles(botonCancelar,botonSiguienteHotel,comboBoxResultadosHotel);
        //controladorUnaHab.rellenarComboBox(comboBoxResultadosHabitaciones);
        
        controladorHD.rellenarComboBox(comboBoxResultadosHotel);
    }
    
}
