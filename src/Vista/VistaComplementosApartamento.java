/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import Controlador.ControladorComplementosApartamento;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static vista.VistaPago.logo1;

/**
 *
 * @author shabi
 */
public class VistaComplementosApartamento extends JFrame{
    
     JLabel mensajeComplementos;
    JLabel labelWifi,labelPiscina,labelSpa,labelParking,labelAA,labelRestaurante,labelBar,labelGym;
    public static JCheckBox checkboxWifiApartamento,checkboxPiscinaApartamento,checkboxSpaApartamento,checkboxParkingApartamento,checkboxAAApartamento,checkboxRestauranteApartamento,checkboxBarApartamento,checkboxGymApartamento;
     JButton botonSiguienteComplementosApartamento;
    
    public VistaComplementosApartamento(){
        
        setLayout(null);
        
        botonSiguienteComplementosApartamento=new javax.swing.JButton();
        botonSiguienteComplementosApartamento=new JButton("Siguiente");
        botonSiguienteComplementosApartamento.setBounds(450,600,100,30);
        add(botonSiguienteComplementosApartamento);
        
        mensajeComplementos=new JLabel("Seleccione los complementos de la Apartamento:");
        mensajeComplementos.setBounds(200,200,200,30);
        add(mensajeComplementos);
        
        
        //Primera Fila
        
        labelWifi=new JLabel("Wifi:");
        labelWifi.setBounds(120,250,200,30);
        add(labelWifi);
        
        checkboxWifiApartamento=new JCheckBox();
        checkboxWifiApartamento.setBounds(150,250,30,30);
        add(checkboxWifiApartamento);
        
                labelPiscina=new JLabel("Piscina:");
        labelPiscina.setBounds(350,250,200,30);
        add(labelPiscina);
        
        checkboxPiscinaApartamento=new JCheckBox();
        checkboxPiscinaApartamento.setBounds(400,250,30,30);
        add(checkboxPiscinaApartamento);
        
        //Segunda Fila
        
        labelSpa=new JLabel("Spa:");
        labelSpa.setBounds(120,300,200,30);
        add(labelSpa);
        
        checkboxSpaApartamento=new JCheckBox();
        checkboxSpaApartamento.setBounds(150,300,30,30);
        add(checkboxSpaApartamento);
        
        labelParking=new JLabel("Parking:");
        labelParking.setBounds(350,300,200,30);
        add(labelParking);
        
        checkboxParkingApartamento=new JCheckBox();
        checkboxParkingApartamento.setBounds(400,300,30,30);
        add(checkboxParkingApartamento);
        
        //Tercera Fila
        
        labelAA=new JLabel("Aire Acondicionado:");
        labelAA.setBounds(32,350,200,30);
        add(labelAA);
        
        checkboxAAApartamento=new JCheckBox();
        checkboxAAApartamento.setBounds(150,350,30,30);
        add(checkboxAAApartamento);
        
        labelRestaurante=new JLabel("Restaurante:");
        labelRestaurante.setBounds(325,350,200,30);
        add(labelRestaurante);
        
        checkboxRestauranteApartamento=new JCheckBox();
        checkboxRestauranteApartamento.setBounds(400,350,30,30);
        add(checkboxRestauranteApartamento);
        
        //Cuarta Fila
        
        labelBar=new JLabel("Bar:");
        labelBar.setBounds(120,400,200,30);
        add(labelBar);
        
        checkboxBarApartamento=new JCheckBox();
        checkboxBarApartamento.setBounds(150,400,30,30);
        add(checkboxBarApartamento);
        
        labelGym=new JLabel("Gimnasio:");
        labelGym.setBounds(340,400,200,30);
        add(labelGym);
        
        checkboxGymApartamento=new JCheckBox();
        checkboxGymApartamento.setBounds(400,400,30,30);
        add(checkboxGymApartamento);
        
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
            
            ControladorComplementosApartamento controlap = new ControladorComplementosApartamento(botonSiguienteComplementosApartamento,checkboxWifiApartamento,checkboxPiscinaApartamento,checkboxSpaApartamento,checkboxParkingApartamento,checkboxAAApartamento,checkboxRestauranteApartamento,checkboxBarApartamento,checkboxGymApartamento);

        
    }
    
}
