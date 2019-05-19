/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import Controlador.ControladorUnApartamento;
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
public class VistaUnApartamento extends JFrame{
    
    JLabel labelResultadosHabitacion;
    JComboBox comboBoxResultadosApartamento;
    JButton botonSiguienteUnaApartamento;
    
    
    public VistaUnApartamento(){
        
        setLayout(null);
        
        botonSiguienteUnaApartamento=new javax.swing.JButton();
        botonSiguienteUnaApartamento=new JButton("Siguiente");
        botonSiguienteUnaApartamento.setBounds(480,600,100,30);
        add(botonSiguienteUnaApartamento);
        
        JButton botonCancelar=new JButton("Cancelar");
        botonCancelar.setBounds(360,600,100,30);
        add(botonCancelar);
        
        labelResultadosHabitacion=new JLabel("Estos son los Apartamentos disponibles:");
        labelResultadosHabitacion.setBounds(350,280,300,30);
        add(labelResultadosHabitacion);
        
        comboBoxResultadosApartamento=new JComboBox();
        comboBoxResultadosApartamento.setBounds(355,330,200,30);
        add(comboBoxResultadosApartamento);
        
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
            
                            ControladorUnApartamento controladorUnaApartamento=new ControladorUnApartamento(botonCancelar,botonSiguienteUnaApartamento,comboBoxResultadosApartamento);
                            controladorUnaApartamento.rellenarComboBox(comboBoxResultadosApartamento);
                //controladorUnaHab.rellenarComboBox(comboBoxUbicacionApartamento);
    }
    
        
}
