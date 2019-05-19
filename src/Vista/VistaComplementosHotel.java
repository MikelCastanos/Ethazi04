/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorComplementosHotel;
import javax.swing.*;
import static vista.VistaPago.logo1;

public class VistaComplementosHotel extends JFrame {
    
    JLabel mensajeComplementos;
    JLabel labelWifi,labelPiscina,labelSpa,labelParking,labelAA,labelRestaurante,labelBar,labelGym;
    public static JCheckBox checkboxWifiHotel,checkboxPiscinaHotel,checkboxSpaHotel,checkboxParkingHotel,checkboxAAHotel,checkboxRestauranteHotel,checkboxBarHotel,checkboxGymHotel;
    JButton botonSiguienteComplementosHotel;
    
    public VistaComplementosHotel(){
        
        
        setLayout(null);
        
        botonSiguienteComplementosHotel=new javax.swing.JButton();
        botonSiguienteComplementosHotel=new JButton("Siguiente");
        botonSiguienteComplementosHotel.setBounds(480,600,100,30);
        add(botonSiguienteComplementosHotel);
        
        JButton botonCancelar=new JButton("Cancelar");
        botonCancelar.setBounds(360,600,100,30);
        add(botonCancelar);
        
        mensajeComplementos=new JLabel("Seleccione los complementos:");
        mensajeComplementos.setBounds(375,200,200,30);
        add(mensajeComplementos);
        
        
        //Primera Fila
        
        labelWifi=new JLabel("Wifi:");
        labelWifi.setBounds(295,250,200,30);
        add(labelWifi);
        
        checkboxWifiHotel=new JCheckBox();
        checkboxWifiHotel.setBounds(325,250,30,30);
        add(checkboxWifiHotel);
        
                labelPiscina=new JLabel("Piscina:");
        labelPiscina.setBounds(525,250,200,30);
        add(labelPiscina);
        
        checkboxPiscinaHotel=new JCheckBox();
        checkboxPiscinaHotel.setBounds(575,250,30,30);
        add(checkboxPiscinaHotel);
        
        //Segunda Fila
        
        labelSpa=new JLabel("Spa:");
        labelSpa.setBounds(295,300,200,30);
        add(labelSpa);
        
        checkboxSpaHotel=new JCheckBox();
        checkboxSpaHotel.setBounds(325,300,30,30);
        add(checkboxSpaHotel);
        
        labelParking=new JLabel("Parking:");
        labelParking.setBounds(525,300,200,30);
        add(labelParking);
        
        checkboxParkingHotel=new JCheckBox();
        checkboxParkingHotel.setBounds(575,300,30,30);
        add(checkboxParkingHotel);
        
        //Tercera Fila
        
        labelAA=new JLabel("Aire Acondicionado:");
        labelAA.setBounds(207,350,200,30);
        add(labelAA);
        
        checkboxAAHotel=new JCheckBox();
        checkboxAAHotel.setBounds(325,350,30,30);
        add(checkboxAAHotel);
        
        labelRestaurante=new JLabel("Restaurante:");
        labelRestaurante.setBounds(500,350,200,30);
        add(labelRestaurante);
        
        checkboxRestauranteHotel=new JCheckBox();
        checkboxRestauranteHotel.setBounds(575,350,30,30);
        add(checkboxRestauranteHotel);
        
        //Cuarta Fila
        
        labelBar=new JLabel("Bar:");
        labelBar.setBounds(295,400,200,30);
        add(labelBar);
        
        checkboxBarHotel=new JCheckBox();
        checkboxBarHotel.setBounds(325,400,30,30);
        add(checkboxBarHotel);
        
        labelGym=new JLabel("Gimnasio:");
        labelGym.setBounds(515,400,200,30);
        add(labelGym);
        
        checkboxGymHotel=new JCheckBox();
        checkboxGymHotel.setBounds(575,400,30,30);
        add(checkboxGymHotel);
       
        ImageIcon icon=new ImageIcon("src//images/complementos.png");
        JLabel logo2 = new JLabel(icon);
            logo2.setSize(900,200);
            add(logo2);
            validate();
                    
        
            ImageIcon icono=new ImageIcon("src//images/fondo.png");
            logo1=new JLabel(icono);
            logo1.setSize(900,692);
            add(logo1);
            validate();
            
            
            
            ControladorComplementosHotel controladorComple1=new ControladorComplementosHotel(botonCancelar,botonSiguienteComplementosHotel,checkboxWifiHotel,checkboxPiscinaHotel,checkboxSpaHotel,checkboxParkingHotel,checkboxAAHotel,checkboxRestauranteHotel,checkboxBarHotel,checkboxGymHotel);

                //controladorUnaHab.rellenarComboBox(comboBoxUbicacionCasa);
    }
    
    
    
    

}
