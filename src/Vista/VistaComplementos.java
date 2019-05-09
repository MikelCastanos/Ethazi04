/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorComplementos;
import javax.swing.*;
import static vista.VistaPago.logo1;

public class VistaComplementos extends JFrame {
    
    JLabel mensajeComplementos;
    JLabel labelWifi,labelPiscina,labelSpa,labelParking,labelAA,labelRestaurante,labelBar,labelGym;
    JCheckBox checkboxWifi,checkboxPiscina,checkboxSpa,checkboxParking,checkboxAA,checkboxRestaurante,checkboxBar,checkboxGym;
    JButton botonSiguienteComplementos;
    
    public VistaComplementos(){
        
        
        setLayout(null);
        
        botonSiguienteComplementos=new javax.swing.JButton();
        botonSiguienteComplementos=new JButton("Siguiente");
        botonSiguienteComplementos.setBounds(450,600,100,30);
        add(botonSiguienteComplementos);
        
        mensajeComplementos=new JLabel("Seleccione los complementos:");
        mensajeComplementos.setBounds(200,200,200,30);
        add(mensajeComplementos);
        
        
        //Primera Fila
        
        labelWifi=new JLabel("Wifi:");
        labelWifi.setBounds(120,250,200,30);
        add(labelWifi);
        
        checkboxWifi=new JCheckBox();
        checkboxWifi.setBounds(150,250,30,30);
        add(checkboxWifi);
        
                labelPiscina=new JLabel("Piscina:");
        labelPiscina.setBounds(350,250,200,30);
        add(labelPiscina);
        
        checkboxPiscina=new JCheckBox();
        checkboxPiscina.setBounds(400,250,30,30);
        add(checkboxPiscina);
        
        //Segunda Fila
        
        labelSpa=new JLabel("Spa:");
        labelSpa.setBounds(120,300,200,30);
        add(labelSpa);
        
        checkboxSpa=new JCheckBox();
        checkboxSpa.setBounds(150,300,30,30);
        add(checkboxSpa);
        
        labelParking=new JLabel("Parking:");
        labelParking.setBounds(350,300,200,30);
        add(labelParking);
        
        checkboxParking=new JCheckBox();
        checkboxParking.setBounds(400,300,30,30);
        add(checkboxParking);
        
        //Tercera Fila
        
        labelAA=new JLabel("Aire Acondicionado:");
        labelAA.setBounds(32,350,200,30);
        add(labelAA);
        
        checkboxAA=new JCheckBox();
        checkboxAA.setBounds(150,350,30,30);
        add(checkboxAA);
        
        labelRestaurante=new JLabel("Restaurante:");
        labelRestaurante.setBounds(325,350,200,30);
        add(labelRestaurante);
        
        checkboxRestaurante=new JCheckBox();
        checkboxRestaurante.setBounds(400,350,30,30);
        add(checkboxRestaurante);
        
        //Cuarta Fila
        
        labelBar=new JLabel("Bar:");
        labelBar.setBounds(120,400,200,30);
        add(labelBar);
        
        checkboxBar=new JCheckBox();
        checkboxBar.setBounds(150,400,30,30);
        add(checkboxBar);
        
        labelGym=new JLabel("Gimnasio:");
        labelGym.setBounds(340,400,200,30);
        add(labelGym);
        
        checkboxGym=new JCheckBox();
        checkboxGym.setBounds(400,400,30,30);
        add(checkboxGym);
        
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
            
            ControladorComplementos controladorComple=new ControladorComplementos(botonSiguienteComplementos,checkboxWifi,checkboxPiscina,checkboxSpa,checkboxParking,checkboxAA,checkboxRestaurante,checkboxBar,checkboxGym);

                //controladorUnaHab.rellenarComboBox(comboBoxUbicacionCasa);
    }
    
    

}
