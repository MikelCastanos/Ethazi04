/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorCodigoDescuento;
import javax.swing.JFrame;
import javax.swing.*;
import static vista.VistaPago.logo1;

/**
 *
 * @author shabi
 */
public class VistaCodigoDescuento extends JFrame {
    
    JLabel mensajeCodigo_Descuento;
    public static JTextField fieldCodigoDescuento;
    JButton botonSiguiente;
    
    
    public VistaCodigoDescuento(){
        
        
        botonSiguiente=new javax.swing.JButton();
        
                setLayout(null);
               
        mensajeCodigo_Descuento=new JLabel("Introduce el Codigo");
        mensajeCodigo_Descuento.setBounds(200,200,200,30);
        add(mensajeCodigo_Descuento);
        
        fieldCodigoDescuento=new JTextField("");
        fieldCodigoDescuento.setBounds(200,240,200,30);
        add(fieldCodigoDescuento);
        
                botonSiguiente=new JButton("Siguiente");
        botonSiguiente.setBounds(450,600,100,30);
        add(botonSiguiente);
        
                JButton botonCancelar=new JButton("Cancelar");
        botonCancelar.setBounds(150,600,100,30);
        add(botonCancelar);
        
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
            
ControladorCodigoDescuento contCD=new ControladorCodigoDescuento(botonCancelar,botonSiguiente,fieldCodigoDescuento);
            

    }
    
    public static void main(String[] args) {
                    VistaCodigoDescuento iniciostart=new VistaCodigoDescuento();
            iniciostart.setBounds(0,0,600,730);
            iniciostart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            iniciostart.setVisible(true);
    }
    
}
