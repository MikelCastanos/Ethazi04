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
        
        
        setLayout(null);
        
        botonSiguienteComplementosCasa=new javax.swing.JButton();
        botonSiguienteComplementosCasa=new JButton("Siguiente");
        botonSiguienteComplementosCasa.setBounds(450,600,100,30);
        add(botonSiguienteComplementosCasa);
        
        JButton botonCancelar=new JButton("Cancelar");
        botonCancelar.setBounds(340,600,100,30);
        add(botonCancelar);
        
        mensajeComplementos=new JLabel("Seleccione los complementos de la casa:");
        mensajeComplementos.setBounds(200,200,200,30);
        add(mensajeComplementos);
        
        
        //Primera Fila
        
        labelWifi=new JLabel("Wifi:");
        labelWifi.setBounds(120,250,200,30);
        add(labelWifi);
        
        checkboxWifiCasa=new JCheckBox();
        checkboxWifiCasa.setBounds(150,250,30,30);
        add(checkboxWifiCasa);
        
                labelPiscina=new JLabel("Piscina:");
        labelPiscina.setBounds(350,250,200,30);
        add(labelPiscina);
        
        checkboxPiscinaCasa=new JCheckBox();
        checkboxPiscinaCasa.setBounds(400,250,30,30);
        add(checkboxPiscinaCasa);
        
        //Segunda Fila
        
        labelSpa=new JLabel("Spa:");
        labelSpa.setBounds(120,300,200,30);
        add(labelSpa);
        
        checkboxSpaCasa=new JCheckBox();
        checkboxSpaCasa.setBounds(150,300,30,30);
        add(checkboxSpaCasa);
        
        labelParking=new JLabel("Parking:");
        labelParking.setBounds(350,300,200,30);
        add(labelParking);
        
        checkboxParkingCasa=new JCheckBox();
        checkboxParkingCasa.setBounds(400,300,30,30);
        add(checkboxParkingCasa);
        
        //Tercera Fila
        
        labelAA=new JLabel("Aire Acondicionado:");
        labelAA.setBounds(32,350,200,30);
        add(labelAA);
        
        checkboxAACasa=new JCheckBox();
        checkboxAACasa.setBounds(150,350,30,30);
        add(checkboxAACasa);
        
        labelRestaurante=new JLabel("Restaurante:");
        labelRestaurante.setBounds(325,350,200,30);
        add(labelRestaurante);
        
        checkboxRestauranteCasa=new JCheckBox();
        checkboxRestauranteCasa.setBounds(400,350,30,30);
        add(checkboxRestauranteCasa);
        
        //Cuarta Fila
        
        labelBar=new JLabel("Bar:");
        labelBar.setBounds(120,400,200,30);
        add(labelBar);
        
        checkboxBarCasa=new JCheckBox();
        checkboxBarCasa.setBounds(150,400,30,30);
        add(checkboxBarCasa);
        
        labelGym=new JLabel("Gimnasio:");
        labelGym.setBounds(340,400,200,30);
        add(labelGym);
        
        checkboxGymCasa=new JCheckBox();
        checkboxGymCasa.setBounds(400,400,30,30);
        add(checkboxGymCasa);
        
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
            
            ControladorComplementosCasa controla = new ControladorComplementosCasa(botonCancelar,botonSiguienteComplementosCasa,checkboxWifiCasa,checkboxPiscinaCasa,checkboxSpaCasa,checkboxParkingCasa,checkboxAACasa,checkboxRestauranteCasa,checkboxBarCasa,checkboxGymCasa);

    }
}
