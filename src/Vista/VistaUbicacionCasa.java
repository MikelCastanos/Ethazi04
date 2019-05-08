/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import Controlador.*;
import com.toedter.calendar.JDateChooser;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import static vista.VistaPago.logo1;

public class VistaUbicacionCasa extends JFrame {
    
    static JButton botonSiguienteUbicacionCasa;
    JLabel mensajeUbicacionCasa,numeroPersonasCasa,labelFechaEntrada,labelFechaSalida;
    JComboBox comboBoxUbicacionCasa,comboBoxNumeroPersonasCasa;
    JDateChooser fechaEntradaCasa,fechaSalidaCasa;
    
    public VistaUbicacionCasa(){
    
        botonSiguienteUbicacionCasa=new javax.swing.JButton();
        botonSiguienteUbicacionCasa=new JButton("Siguiente");
        botonSiguienteUbicacionCasa.setBounds(450,600,100,30);
        add(botonSiguienteUbicacionCasa);
        
        setLayout(null);

        mensajeUbicacionCasa=new JLabel("SELECCIONAR UBICACIÓN CASA");
        mensajeUbicacionCasa.setBounds(200,200,200,30);
        add(mensajeUbicacionCasa);
        
        comboBoxUbicacionCasa=new JComboBox();
        comboBoxUbicacionCasa.setBounds(180,230,200,30);
        add(comboBoxUbicacionCasa);
        
        
        numeroPersonasCasa=new JLabel("Cantidad de Personas:");
        numeroPersonasCasa.setBounds(100,300,200,30);
        add(numeroPersonasCasa);
        
        
        comboBoxNumeroPersonasCasa=new JComboBox();
        comboBoxNumeroPersonasCasa.addItem(1);
        comboBoxNumeroPersonasCasa.addItem(2);
        comboBoxNumeroPersonasCasa.addItem(3);
        comboBoxNumeroPersonasCasa.addItem(4);
        comboBoxNumeroPersonasCasa.addItem(5);
        comboBoxNumeroPersonasCasa.setBounds(300,300,50,30);
        add(comboBoxNumeroPersonasCasa);
        
                //      JLabel y JDateChooser de la FECHA INICIO
        
        labelFechaEntrada=new JLabel("Fecha Inicio:");
        labelFechaEntrada.setBounds(90,400,100,30);
        add(labelFechaEntrada);
        
        fechaEntradaCasa=new JDateChooser();
        fechaEntradaCasa.setMinSelectableDate(new Date());
        fechaEntradaCasa.setBounds(170,400,100,30);
        add(fechaEntradaCasa);
        
        
        //      JLabel y JDateChooser de la FECHA FIN
        
        labelFechaSalida=new JLabel("Fecha Fin:");
        labelFechaSalida.setBounds(290,400,100,30);
        add(labelFechaSalida);
        
        fechaSalidaCasa=new JDateChooser();
        fechaSalidaCasa.setMinSelectableDate(new Date());
        fechaSalidaCasa.setBounds(350,400,100,30);
        add(fechaSalidaCasa);
        
        
        //Pasamos lo importante al Controlador y rellenamos el combobox
                ControladorUbicacionCasa controladorUC=new ControladorUbicacionCasa(botonSiguienteUbicacionCasa,comboBoxUbicacionCasa,comboBoxNumeroPersonasCasa,fechaEntradaCasa,fechaSalidaCasa);

                controladorUC.rellenarComboBox(comboBoxUbicacionCasa);
        


        
        
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
            
    }
    
}
