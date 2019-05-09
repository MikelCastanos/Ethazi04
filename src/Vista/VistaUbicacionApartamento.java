/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorUbicacionApartamento;
import Controlador.ControladorUbicacionCasa;
import com.toedter.calendar.JDateChooser;
import java.util.Date;
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
public class VistaUbicacionApartamento extends JFrame {
    
    static JButton botonSiguienteUbicacionApartamento;
    public JLabel mensajeUbicacionCasa,numeroPersonasCasa,labelFechaEntrada,labelFechaSalida;
    public JComboBox comboBoxUbicacionApartamento,comboBoxNumeroPersonasApartamento;
    public JDateChooser fechaEntradaApartamento,fechaSalidaApartamento;
    
    public VistaUbicacionApartamento(){
        
        botonSiguienteUbicacionApartamento=new javax.swing.JButton();
        botonSiguienteUbicacionApartamento=new JButton("Siguiente");
        botonSiguienteUbicacionApartamento.setBounds(450,600,100,30);
        add(botonSiguienteUbicacionApartamento);
        
        setLayout(null);

        mensajeUbicacionCasa=new JLabel("SELECCIONAR UBICACIÓN APARTAMENTO");
        mensajeUbicacionCasa.setBounds(200,200,200,30);
        add(mensajeUbicacionCasa);
        
        comboBoxUbicacionApartamento=new JComboBox();
        comboBoxUbicacionApartamento.setBounds(180,230,200,30);
        add(comboBoxUbicacionApartamento);
        
        
        numeroPersonasCasa=new JLabel("Cantidad de Personas:");
        numeroPersonasCasa.setBounds(100,300,200,30);
        add(numeroPersonasCasa);
        
        
        comboBoxNumeroPersonasApartamento=new JComboBox();
        comboBoxNumeroPersonasApartamento.addItem(1);
        comboBoxNumeroPersonasApartamento.addItem(2);
        comboBoxNumeroPersonasApartamento.addItem(3);
        comboBoxNumeroPersonasApartamento.addItem(4);
        comboBoxNumeroPersonasApartamento.addItem(5);
        comboBoxNumeroPersonasApartamento.setBounds(300,300,50,30);
        add(comboBoxNumeroPersonasApartamento);
        
                //      JLabel y JDateChooser de la FECHA INICIO
        
        labelFechaEntrada=new JLabel("Fecha Inicio:");
        labelFechaEntrada.setBounds(90,400,100,30);
        add(labelFechaEntrada);
        
        fechaEntradaApartamento=new JDateChooser();
        fechaEntradaApartamento.setMinSelectableDate(new Date());
        fechaEntradaApartamento.setBounds(170,400,100,30);
        add(fechaEntradaApartamento);
        
        
        //      JLabel y JDateChooser de la FECHA FIN
        
        labelFechaSalida=new JLabel("Fecha Fin:");
        labelFechaSalida.setBounds(290,400,100,30);
        add(labelFechaSalida);
        
        fechaSalidaApartamento=new JDateChooser();
        fechaSalidaApartamento.setMinSelectableDate(new Date());
        fechaSalidaApartamento.setBounds(350,400,100,30);
        add(fechaSalidaApartamento);
        
        
        //Pasamos lo importante al Controlador y rellenamos el combobox
                ControladorUbicacionApartamento controladorUA=new ControladorUbicacionApartamento(botonSiguienteUbicacionApartamento,comboBoxUbicacionApartamento,comboBoxNumeroPersonasApartamento,fechaEntradaApartamento,fechaSalidaApartamento);

                controladorUA.rellenarComboBox(comboBoxUbicacionApartamento);
        


        
        
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
