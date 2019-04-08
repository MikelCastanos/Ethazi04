package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import Controlador.ControladorPago;



public class VistaPago extends JFrame {
    
   public static JButton boton_volver, boton_continuar, boton_200e, boton_100e, boton_50e, boton_20e, boton_10e, boton_5e, boton_2e, boton_1e, boton_50c, boton_20c, boton_10c, boton_5c, boton_2c, boton_1c; 
   public static JLabel mensajePago,  preciototal, preciototal_IVA, men_cantidad_insertada,men_cantidad_pagar, logo1,mensajeRestante;
   public static ImageIcon img_agua;
   public static double calculo_preciototal= 10;
   public static int billete200=20000,billete100=10000,billete50=5000,billete20=2000,billete10=1000,billete5=500,moneda2=200,moneda1=100,moneda50c=50,moneda20c=20,moneda10c=10,moneda5c=5,moneda2c=2,moneda1c=1;
   public static double cantidad_insertada=0;
 
   public static double precioFinal, precioFinalcents;

   
public VistaPago(){
          
            setLayout(null);
          
            boton_volver=new javax.swing.JButton();
            boton_continuar=new javax.swing.JButton();
            boton_200e=new javax.swing.JButton();
            boton_100e=new javax.swing.JButton();
            boton_50e=new javax.swing.JButton();
            boton_20e=new javax.swing.JButton();
            boton_10e=new javax.swing.JButton();
            boton_5e=new javax.swing.JButton();
            boton_2e=new javax.swing.JButton();
            boton_1e=new javax.swing.JButton();
            boton_50c=new javax.swing.JButton();
            boton_20c=new javax.swing.JButton();
            boton_10c=new javax.swing.JButton();
            boton_5c=new javax.swing.JButton();
            boton_2c=new javax.swing.JButton();
            boton_1c=new javax.swing.JButton();
            
            mensajePago=new JLabel("REALIZAR PAGO");
            mensajePago.setBounds(225,25,300,20);
            add(mensajePago);
            
            mensajePago=new JLabel("Selecione con la cantidad de dinero que desea pagar:");
            mensajePago.setBounds(130,60,350,20);
            add(mensajePago);
            
            boton_200e=new JButton();
            boton_200e.setIcon(new ImageIcon("src/images/200e.jpg"));
            boton_200e.setBounds(100,150,50,50);
            boton_200e.setEnabled(true);
            add(boton_200e);
            validate();
            
            
            boton_100e=new JButton();
            boton_100e.setIcon(new ImageIcon("src/images/100e.jpg"));
            boton_100e.setBounds(200,150,50,50);
            add(boton_100e);
            
            
            boton_50e=new JButton();
            boton_50e.setIcon(new ImageIcon("src/images/50e.jpg"));
            boton_50e.setBounds(300,150,50,50);
            add(boton_50e);
            
            
            boton_20e=new JButton();
            boton_20e.setIcon(new ImageIcon("src/images/20e.jpg"));
            boton_20e.setBounds(400,150,50,50);
            add(boton_20e);
            
            
            boton_10e=new JButton();
            boton_10e.setIcon(new ImageIcon("src/images/10e.jpg"));
            boton_10e.setBounds(100,250,50,50);
            add(boton_10e);
            
            
            boton_5e=new JButton();
            boton_5e.setIcon(new ImageIcon("src/images/5e.jpg"));
            boton_5e.setBounds(200,250,50,50);
            add(boton_5e);
            
            
            boton_2e=new JButton();
            boton_2e.setIcon(new ImageIcon("src/images/2e.gif"));
            boton_2e.setBounds(300,250,50,50);
            add(boton_2e);
            
            
            boton_1e=new JButton();
            boton_1e.setIcon(new ImageIcon("src/images/1e.gif"));
            boton_1e.setBounds(400,250,50,50);
            add(boton_1e);
            
            boton_50c=new JButton();
            boton_50c.setIcon(new ImageIcon("src/images/50c.gif"));
            boton_50c.setBounds(100,350,50,50);
            add(boton_50c);
            
            boton_20c=new JButton();
            boton_20c.setIcon(new ImageIcon("src/images/20c.gif"));
            boton_20c.setBounds(200,350,50,50);
            add(boton_20c);
            
            boton_10c=new JButton();
            boton_10c.setIcon(new ImageIcon("src/images/10c.gif"));
            boton_10c.setBounds(300,350,50,50);
            add(boton_10c);
            
            boton_5c=new JButton();
            boton_5c.setIcon(new ImageIcon("src/images/5c.gif"));
            boton_5c.setBounds(400,350,50,50);
            add(boton_5c);
            
            boton_2c=new JButton();
            boton_2c.setIcon(new ImageIcon("src/images/2c.gif"));
            boton_2c.setBounds(200,450,50,50);
            add(boton_2c);
            
            boton_1c=new JButton();
            boton_1c.setIcon(new ImageIcon("src/images/1c.gif"));
            boton_1c.setBounds(300,450,50,50);
            add(boton_1c);
            
            precioFinal=Math.floor(((10)*1.21)*100d)/100d;
            precioFinalcents=precioFinal*100;
            
            preciototal_IVA= new JLabel("Precio Final (IVA incluido): "+precioFinal+"€");
            preciototal_IVA.setBounds(200,100,300,20);
            add(preciototal_IVA);
            
            men_cantidad_insertada= new JLabel("Cantidad insertada: "+(cantidad_insertada/100)+"€");
            men_cantidad_insertada.setBounds(200,550,300,20);
            add(men_cantidad_insertada);
            
            boton_volver=new JButton("Volver");
            boton_volver.setBounds(120,650,100,30);
            add(boton_volver);
            
            boton_continuar=new JButton("Continuar");
            boton_continuar.setBounds(350,650,100,30);
            add(boton_continuar);

            ControladorPago cont=new ControladorPago(boton_volver, boton_continuar, boton_200e, boton_100e, boton_50e, boton_20e, boton_10e, 
                    boton_5e, boton_2e, boton_1e, boton_50c, boton_20c, boton_10c, boton_5c, boton_2c, boton_1c);
            
}

    public static JButton getBoton_volver() {
        return boton_volver;
    }

    public static JButton getBoton_continuar() {
        return boton_continuar;
    }

    public static JButton getBoton_200e() {
        return boton_200e;
    }

    public static JButton getBoton_100e() {
        return boton_100e;
    }

    public static JButton getBoton_50e() {
        return boton_50e;
    }

    public static JButton getBoton_20e() {
        return boton_20e;
    }

    public static JButton getBoton_10e() {
        return boton_10e;
    }

    public static JButton getBoton_5e() {
        return boton_5e;
    }

    public static JButton getBoton_2e() {
        return boton_2e;
    }

    public static JButton getBoton_1e() {
        return boton_1e;
    }

    public static JButton getBoton_50c() {
        return boton_50c;
    }

    public static JButton getBoton_20c() {
        return boton_20c;
    }

    public static JButton getBoton_10c() {
        return boton_10c;
    }

    public static JButton getBoton_5c() {
        return boton_5c;
    }

    public static JButton getBoton_2c() {
        return boton_2c;
    }

    public static JButton getBoton_1c() {
        return boton_1c;
    }

    
    
}



    

