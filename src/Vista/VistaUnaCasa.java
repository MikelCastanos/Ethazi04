/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorUnaCasa;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static vista.VistaPago.logo1;

/**
 *
 * @author shabi
 */
public class VistaUnaCasa extends JFrame{
    
    JLabel labelResultadosHabitacion;
    JComboBox comboBoxResultadosCasa;
    JButton botonSiguienteUnaCasa;
    
    
    public VistaUnaCasa(){
        
        setLayout(null);
        
        botonSiguienteUnaCasa=new javax.swing.JButton();
        botonSiguienteUnaCasa=new JButton("Siguiente");
        botonSiguienteUnaCasa.setBounds(480,600,100,30);
        add(botonSiguienteUnaCasa);
        
        JButton botonCancelar=new JButton("Cancelar");
        botonCancelar.setBounds(360,600,100,30);
        add(botonCancelar);
        
        labelResultadosHabitacion=new JLabel("Estas son las casas disponibles:");
        labelResultadosHabitacion.setBounds(350,280,300,30);
        add(labelResultadosHabitacion);
        
        comboBoxResultadosCasa=new JComboBox();
        comboBoxResultadosCasa.setBounds(355,330,200,30);
        add(comboBoxResultadosCasa);
        
            ImageIcon icon=new ImageIcon("src//images/disponible.png");
        JLabel logo2 = new JLabel(icon);
            logo2.setSize(900,200);
            add(logo2);
            validate();
        
            ImageIcon icono=new ImageIcon("src//images/fondo.png");
            logo1=new JLabel(icono);
            logo1.setSize(900,692);
            add(logo1);
            validate();
            
                            ControladorUnaCasa controladorUnaCasa=new ControladorUnaCasa(botonCancelar,botonSiguienteUnaCasa,comboBoxResultadosCasa);
                            controladorUnaCasa.rellenarComboBox(comboBoxResultadosCasa);
    }
    
}
