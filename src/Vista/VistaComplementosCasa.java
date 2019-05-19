/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;



import Controlador.ControladorComplementosCasa;
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
public class VistaComplementosCasa extends JFrame{
    
    JLabel mensajeComplementos;
    JLabel labelWifi,labelPiscina,labelSpa,labelParking,labelAA,labelRestaurante,labelBar,labelGym;
    public static JCheckBox checkboxWifiCasa,checkboxPiscinaCasa,checkboxSpaCasa,checkboxParkingCasa,checkboxAACasa,checkboxRestauranteCasa,checkboxBarCasa,checkboxGymCasa;
    JButton botonSiguienteComplementosCasa;
    
    public VistaComplementosCasa(){
        
        
        botonSiguienteComplementosCasa=new javax.swing.JButton();
        botonSiguienteComplementosCasa=new JButton("Siguiente");
        botonSiguienteComplementosCasa.setBounds(480,600,100,30);
        add(botonSiguienteComplementosCasa);
        
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
        
        checkboxWifiCasa=new JCheckBox();
        checkboxWifiCasa.setBounds(325,250,30,30);
        add(checkboxWifiCasa);
        
                labelPiscina=new JLabel("Piscina:");
        labelPiscina.setBounds(525,250,200,30);
        add(labelPiscina);
        
        checkboxPiscinaCasa=new JCheckBox();
        checkboxPiscinaCasa.setBounds(575,250,30,30);
        add(checkboxPiscinaCasa);
        
        //Segunda Fila
        
        labelSpa=new JLabel("Spa:");
        labelSpa.setBounds(295,300,200,30);
        add(labelSpa);
        
        checkboxSpaCasa=new JCheckBox();
        checkboxSpaCasa.setBounds(325,300,30,30);
        add(checkboxSpaCasa);
        
        labelParking=new JLabel("Parking:");
        labelParking.setBounds(525,300,200,30);
        add(labelParking);
        
        checkboxParkingCasa=new JCheckBox();
        checkboxParkingCasa.setBounds(575,300,30,30);
        add(checkboxParkingCasa);
        
        //Tercera Fila
        
        labelAA=new JLabel("Aire Acondicionado:");
        labelAA.setBounds(207,350,200,30);
        add(labelAA);
        
        checkboxAACasa=new JCheckBox();
        checkboxAACasa.setBounds(325,350,30,30);
        add(checkboxAACasa);
        
        labelRestaurante=new JLabel("Restaurante:");
        labelRestaurante.setBounds(500,350,200,30);
        add(labelRestaurante);
        
        checkboxRestauranteCasa=new JCheckBox();
        checkboxRestauranteCasa.setBounds(575,350,30,30);
        add(checkboxRestauranteCasa);
        
        //Cuarta Fila
        
        labelBar=new JLabel("Bar:");
        labelBar.setBounds(295,400,200,30);
        add(labelBar);
        
        checkboxBarCasa=new JCheckBox();
        checkboxBarCasa.setBounds(325,400,30,30);
        add(checkboxBarCasa);
        
        labelGym=new JLabel("Gimnasio:");
        labelGym.setBounds(515,400,200,30);
        add(labelGym);
        
        checkboxGymCasa=new JCheckBox();
        checkboxGymCasa.setBounds(575,400,30,30);
        add(checkboxGymCasa);
       
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
            
            ControladorComplementosCasa controla = new ControladorComplementosCasa(botonCancelar,botonSiguienteComplementosCasa,checkboxWifiCasa,checkboxPiscinaCasa,checkboxSpaCasa,checkboxParkingCasa,checkboxAACasa,checkboxRestauranteCasa,checkboxBarCasa,checkboxGymCasa);

    }
    
    
}
