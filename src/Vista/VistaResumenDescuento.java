/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorResumenDescuento;
import Modelo.Apartamento;
import Modelo.Casa;
import Modelo.Hotel;
import javax.swing.JFrame;
import javax.swing.*;
import static vista.VistaPago.logo1;

/**
 *
 * @author shabi
 */
public class VistaResumenDescuento extends JFrame {
    
    JLabel mensajeCodigo_Descuento;
    public static JTextField fieldCodigoDescuento;
    JButton botonSiguiente;
    JTextField resumenHotel,resumenCasa,resumenApartamento;
    
    
    
    public VistaResumenDescuento(){
        
        
        botonSiguiente=new javax.swing.JButton();
        
                setLayout(null);
                
                resumenHotel=new JTextField(Hotel.hotel1.toString());
                resumenHotel.setBounds(100,200,400,30);
                resumenHotel.setEditable(false);
                add(resumenHotel);
                
                resumenCasa=new JTextField(Casa.casa1.toString());
                resumenCasa.setBounds(100,240,400,30);
                resumenCasa.setEditable(false);
                add(resumenCasa);
                
                resumenApartamento=new JTextField(Apartamento.apartamento1.toString());
                resumenApartamento.setBounds(100,280,400,30);
                resumenApartamento.setEditable(false);
                add(resumenApartamento);
               
        mensajeCodigo_Descuento=new JLabel("Introduce el Codigo");
        mensajeCodigo_Descuento.setBounds(200,350,200,30);
        add(mensajeCodigo_Descuento);
        
        fieldCodigoDescuento=new JTextField("");
        fieldCodigoDescuento.setBounds(180,390,200,30);
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
            
ControladorResumenDescuento contCD=new ControladorResumenDescuento(botonCancelar,botonSiguiente,fieldCodigoDescuento);
            

    }
    
    public static void main(String[] args) {
                    VistaResumenDescuento iniciostart=new VistaResumenDescuento();
            iniciostart.setBounds(0,0,600,730);
            iniciostart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            iniciostart.setVisible(true);
    }
    
}
