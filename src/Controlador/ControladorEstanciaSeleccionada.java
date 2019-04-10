/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import static Controlador.ControladorEleccion.seleccionEleccion;
import Modelo.ConsultaHotel;
import Vista.VistaEstanciaSeleccionada;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import vista.VistaPago;

/**
 *
 * @author shabi
 */
public class ControladorEstanciaSeleccionada {
    
    public static int precio1;
    public static int precio1cents;
    
    public ControladorEstanciaSeleccionada(JButton boton_siguiente3){
                   
        boton_siguiente3.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                irPago();
            }
            
        });}
    
    
    public void irPago(){
                ConsultaHotel cons=new ConsultaHotel();
                precio1=(int) cons.consultaCompleta(seleccionEleccion).get(2);
                System.out.println("El precio es: ");
                System.out.println(precio1);
                VistaPago vistap=new VistaPago();
                vistap.setBounds(0,0,600,730);
                vistap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                vistap.setVisible(true);
                precio1cents=precio1*100;
    }
    
    public void sacarDatosEstancia(){
           ConsultaHotel hotel= new ConsultaHotel();
           hotel.consultaCompleta(seleccionEleccion);
    }
    }
    

