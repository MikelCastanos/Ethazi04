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
        botonSiguienteComplementosHotel.setBounds(450,600,100,30);
        add(botonSiguienteComplementosHotel);
        
        JButton botonCancelar=new JButton("Cancelar");
        botonCancelar.setBounds(340,600,100,30);
        add(botonCancelar);
        
        mensajeComplementos=new JLabel("Seleccione los complementos:");
        mensajeComplementos.setBounds(200,200,200,30);
        add(mensajeComplementos);
        
        
        //Primera Fila
        
        labelWifi=new JLabel("Wifi:");
        labelWifi.setBounds(120,250,200,30);
        add(labelWifi);
        
        checkboxWifiHotel=new JCheckBox();
        checkboxWifiHotel.setBounds(150,250,30,30);
        add(checkboxWifiHotel);
        
                labelPiscina=new JLabel("Piscina:");
        labelPiscina.setBounds(350,250,200,30);
        add(labelPiscina);
        
        checkboxPiscinaHotel=new JCheckBox();
        checkboxPiscinaHotel.setBounds(400,250,30,30);
        add(checkboxPiscinaHotel);
        
        //Segunda Fila
        
        labelSpa=new JLabel("Spa:");
        labelSpa.setBounds(120,300,200,30);
        add(labelSpa);
        
        checkboxSpaHotel=new JCheckBox();
        checkboxSpaHotel.setBounds(150,300,30,30);
        add(checkboxSpaHotel);
        
        labelParking=new JLabel("Parking:");
        labelParking.setBounds(350,300,200,30);
        add(labelParking);
        
        checkboxParkingHotel=new JCheckBox();
        checkboxParkingHotel.setBounds(400,300,30,30);
        add(checkboxParkingHotel);
        
        //Tercera Fila
        
        labelAA=new JLabel("Aire Acondicionado:");
        labelAA.setBounds(32,350,200,30);
        add(labelAA);
        
        checkboxAAHotel=new JCheckBox();
        checkboxAAHotel.setBounds(150,350,30,30);
        add(checkboxAAHotel);
        
        labelRestaurante=new JLabel("Restaurante:");
        labelRestaurante.setBounds(325,350,200,30);
        add(labelRestaurante);
        
        checkboxRestauranteHotel=new JCheckBox();
        checkboxRestauranteHotel.setBounds(400,350,30,30);
        add(checkboxRestauranteHotel);
        
        //Cuarta Fila
        
        labelBar=new JLabel("Bar:");
        labelBar.setBounds(120,400,200,30);
        add(labelBar);
        
        checkboxBarHotel=new JCheckBox();
        checkboxBarHotel.setBounds(150,400,30,30);
        add(checkboxBarHotel);
        
        labelGym=new JLabel("Gimnasio:");
        labelGym.setBounds(340,400,200,30);
        add(labelGym);
        
        checkboxGymHotel=new JCheckBox();
        checkboxGymHotel.setBounds(400,400,30,30);
        add(checkboxGymHotel);
        
                    ImageIcon icon=new ImageIcon("src//images/Bidaion.png");
            JLabel logo2 = new JLabel(icon);
            logo2.setSize(575,200);
            add(logo2);
            validate();
        
            ImageIcon icono=new ImageIcon("src//images/fondo.png");
            logo1=new JLabel(icono);
            logo1.setSize(900,690);
            add(logo1);
            validate();
            
            ControladorComplementosHotel controladorComple1=new ControladorComplementosHotel(botonCancelar,botonSiguienteComplementosHotel,checkboxWifiHotel,checkboxPiscinaHotel,checkboxSpaHotel,checkboxParkingHotel,checkboxAAHotel,checkboxRestauranteHotel,checkboxBarHotel,checkboxGymHotel);

                //controladorUnaHab.rellenarComboBox(comboBoxUbicacionCasa);
    }
    
    

}
