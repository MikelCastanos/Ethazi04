package Controlador;

import Vista.VistaBienvenida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;
import Modelo.*;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import vista.VistaPago;
import static vista.VistaPago.*;
import vista.pagoIgual;
import vista.pagoMayor;
import vista.pagoMenor;



public class ControladorPago {
    VistaPago pago;
    Modelo modelo;
    ActionListener actionListener;
    
    
    public ControladorPago(JButton boton_continuar, JButton boton_volver, JButton boton_200e, JButton boton_100e,
            JButton boton_50e, JButton boton_20e, JButton boton_10e, JButton boton_5e, JButton boton_2e, JButton boton_1e,
            JButton boton_50c, JButton boton_20c, JButton boton_10c,JButton boton_5c,JButton boton_2c,JButton boton_1c){
    boton_continuar.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                impr();
            }  
        });
    boton_volver.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                impr();
            }
        });
    boton_200e.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                impr();
            }
        });
    boton_100e.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                impr();
            }
        });
    boton_50e.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                impr();
            }
        });
    boton_20e.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                impr();
            }
        });
    boton_10e.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                impr();
            }
        });
    boton_5e.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                impr();
            }
        });
    boton_2e.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                impr();
            }
        });
    boton_1e.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                impr();
            }
        });
    boton_50c.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                impr();
            }
        });
    boton_20c.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                impr();
            }
        });
    boton_10c.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                impr();
            }
        });
    boton_5c.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                impr();
            }
        });
    boton_2c.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                impr();
            }
        });
    boton_1c.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                impr();
            }
        });

    }
    
    public void contol(){        
        actionListener = new ActionListener() {
              public void actionPerformed(ActionEvent actionEvent) {  
                  VistaPago paga=new VistaPago();
                  paga.dispose();
                  impr();
              }
        };
        
        VistaPago.getBoton_continuar().addActionListener(actionListener);
        VistaPago.getBoton_volver().addActionListener(actionListener);
        /*VistaPago.getBoton_200e().addActionListener(actionListener);
        VistaPago.getBoton_100e().addActionListener(actionListener);
        VistaPago.getBoton_50e().addActionListener(actionListener);
        VistaPago.getBoton_20e().addActionListener(actionListener);
        VistaPago.getBoton_10e().addActionListener(actionListener);
        VistaPago.getBoton_5e().addActionListener(actionListener);
        VistaPago.getBoton_2e().addActionListener(actionListener);
        VistaPago.getBoton_1e().addActionListener(actionListener);
        VistaPago.getBoton_50c().addActionListener(actionListener);
        VistaPago.getBoton_20c().addActionListener(actionListener);
        VistaPago.getBoton_10c().addActionListener(actionListener);
        VistaPago.getBoton_5c().addActionListener(actionListener);
        VistaPago.getBoton_2c().addActionListener(actionListener);
        VistaPago.getBoton_1c().addActionListener(actionListener);*/
    }
               

    
    public void impr(){
            
            if(VistaPago.getBoton_volver()==boton_volver){
            
            
            VistaBienvenida iniciostart=new VistaBienvenida();
            iniciostart.setBounds(0,0,400,300);
            iniciostart.setVisible(true);
            iniciostart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //dispose();
           }
            
            if(getBoton_continuar()==boton_continuar){
 
            if(cantidad_insertada>precioFinalcents){  
            pagoMayor pagoMayor=new pagoMayor();
            pagoMayor.setBounds(0,0,600,750);
            pagoMayor.setVisible(true);
            pagoMayor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //dispose();}
            
            if(cantidad_insertada<precioFinalcents){  
            pagoMenor pagoMenor=new pagoMenor();
            pagoMenor.setBounds(0,0,450,300);
            pagoMenor.setVisible(true);
            pagoMenor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}
            //dispose();}
            
            if(cantidad_insertada==precioFinalcents){  
            pagoIgual pagoIgual=new pagoIgual();
            pagoIgual.setBounds(0,0,450,300);
            pagoIgual.setVisible(true);
            pagoIgual.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}
            //dispose();}
           
           /* if(getBoton_200e()==boton_200e){ 
            cantidad_insertada=cantidad_insertada+billete200;

            VistaPago Pago=new VistaPago();
            Pago.setBounds(0,0,600,730);
            Pago.setVisible(true);
           // dispose();       
           }
           if(getBoton_100e()==boton_100e){ 
            cantidad_insertada=cantidad_insertada+billete100;

            VistaPago Pago=new VistaPago();
            Pago.setBounds(0,0,600,730);
            Pago.setVisible(true);
           // dispose();       
           }
           if(getBoton_50e()==boton_50e){ 
            cantidad_insertada=cantidad_insertada+billete50;

            VistaPago Pago=new VistaPago();
            Pago.setBounds(0,0,600,730);
            Pago.setVisible(true);
            //dispose();       
           }
           if(getBoton_20e()==boton_20e){ 
            cantidad_insertada=cantidad_insertada+billete20;

            VistaPago Pago=new VistaPago();
            Pago.setBounds(0,0,600,730);
            Pago.setVisible(true);
            //dispose();       
           }
           if(getBoton_10e()==boton_10e){ 
            cantidad_insertada=cantidad_insertada+billete10;

            VistaPago Pago=new VistaPago();
            Pago.setBounds(0,0,600,730);
            Pago.setVisible(true);
            //dispose();       
           }
           if(getBoton_5e()==boton_5e){ 
            cantidad_insertada=cantidad_insertada+billete5;

            VistaPago Pago=new VistaPago();
            Pago.setBounds(0,0,600,730);
            Pago.setVisible(true);
            //dispose();       
           }
           if(getBoton_2e()==boton_2e){ 
            cantidad_insertada=cantidad_insertada+moneda2;

            VistaPago Pago=new VistaPago();
            Pago.setBounds(0,0,600,730);
            Pago.setVisible(true);
            //dispose();       
           }
           if(getBoton_1e()==boton_1e){ 
            cantidad_insertada=cantidad_insertada+moneda1;

            VistaPago Pago=new VistaPago();
            Pago.setBounds(0,0,600,730);
            Pago.setVisible(true);
            //dispose();       
           }
           if(getBoton_50c()==boton_50c){ 
            cantidad_insertada=cantidad_insertada+moneda50c;

            VistaPago Pago=new VistaPago();
            Pago.setBounds(0,0,600,730);
            Pago.setVisible(true);
            //dispose();       
           }
           if(getBoton_20c()==boton_20c){ 
            cantidad_insertada=cantidad_insertada+moneda20c;

            VistaPago Pago=new VistaPago();
            Pago.setBounds(0,0,600,730);
            Pago.setVisible(true);
            //dispose();       
           }
           if(getBoton_10c()==boton_10c){ 
            cantidad_insertada=cantidad_insertada+moneda10c;

            VistaPago Pago=new VistaPago();
            Pago.setBounds(0,0,600,730);
            Pago.setVisible(true);
            //dispose();       
           }
           if(getBoton_5c()==boton_5c){ 
            cantidad_insertada=cantidad_insertada+moneda5c;

            VistaPago Pago=new VistaPago();
            Pago.setBounds(0,0,600,730);
            Pago.setVisible(true);
            //dispose();       
           }
           if(getBoton_2c()==boton_2c){ 
            cantidad_insertada=cantidad_insertada+moneda2c;

            VistaPago Pago=new VistaPago();
            Pago.setBounds(0,0,600,730);
            Pago.setVisible(true);
            //dispose();       
           }
           if(getBoton_1c()==boton_1c){ 
            cantidad_insertada=cantidad_insertada+moneda1c;

            VistaPago Pago=new VistaPago();
            Pago.setBounds(0,0,600,730);
            Pago.setVisible(true);
            //dispose();       
           }*/
            
        }
    
    
    
    
}
    }
}
