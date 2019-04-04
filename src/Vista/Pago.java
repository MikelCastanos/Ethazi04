package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;


public class Pago extends JFrame implements ActionListener {
    
   public static JButton boton_volver, boton_continuar, boton_200e, boton_100e, boton_50e, boton_20e, boton_10e, boton_5e, boton_2e, boton_1e, boton_50c, boton_20c, boton_10c, boton_5c, boton_2c, boton_1c; 
   public static JLabel mensajePago,  preciototal, preciototal_IVA, men_cantidad_insertada,men_cantidad_pagar, logo1,mensajeRestante;
   public static ImageIcon img_agua;
   public static double calculo_preciototal= 10;
   public static int billete200=20000,billete100=10000,billete50=5000,billete20=2000,billete10=1000,billete5=500,moneda2=200,moneda1=100,moneda50c=50,moneda20c=20,moneda10c=10,moneda5c=5,moneda2c=2,moneda1c=1;
   public static double cantidad_insertada=0;
 
   public static double precioFinal, precioFinalcents;

   
public Pago(){
            
            setLayout(null);
            ImageIcon icono=new ImageIcon("src//images/salding.png");
            logo1=new JLabel(icono);
            logo1.setSize(100,100);
            add(logo1);
            validate();
            
            mensajePago=new JLabel("REALIZAR PAGO");
            mensajePago.setBounds(225,25,300,20);
            add(mensajePago);
            
            mensajePago=new JLabel("Selecione con la cantidad de dinero que desea pagar:");
            mensajePago.setBounds(130,60,350,20);
            add(mensajePago);
            
            /*mensajeRestante=new JLabel("Dinero restante: "+(((((calculo_preciototal*1.21)-(cantidad_insertada/100))*100d)/100d)));
            mensajeRestante.setBounds(115,70,350,20);
            add(mensajeRestante);*/
            
            boton_200e=new JButton();
            boton_200e.setIcon(new ImageIcon("src/images/200e.jpg"));
            boton_200e.setBounds(100,150,50,50);
            boton_200e.setEnabled(true);
            add(boton_200e);
            boton_200e.addActionListener(this);
            validate();
            
            
            boton_100e=new JButton();
            boton_100e.setIcon(new ImageIcon("src/images/100e.jpg"));
            boton_100e.setBounds(200,150,50,50);
            boton_100e.addActionListener(this);
            add(boton_100e);
            
            
            boton_50e=new JButton();
            boton_50e.setIcon(new ImageIcon("src/images/50e.jpg"));
            boton_50e.setBounds(300,150,50,50);
            boton_50e.addActionListener(this);
            add(boton_50e);
            
            
            boton_20e=new JButton();
            boton_20e.setIcon(new ImageIcon("src/images/20e.jpg"));
            boton_20e.setBounds(400,150,50,50);
            boton_20e.addActionListener(this);
            add(boton_20e);
            
            
            boton_10e=new JButton();
            boton_10e.setIcon(new ImageIcon("src/images/10e.jpg"));
            boton_10e.setBounds(100,250,50,50);
            boton_10e.addActionListener(this);
            add(boton_10e);
            
            
            boton_5e=new JButton();
            boton_5e.setIcon(new ImageIcon("src/images/5e.jpg"));
            boton_5e.setBounds(200,250,50,50);
            boton_5e.addActionListener(this);
            add(boton_5e);
            
            
            boton_2e=new JButton();
            boton_2e.setIcon(new ImageIcon("src/images/2e.gif"));
            boton_2e.setBounds(300,250,50,50);
            boton_2e.addActionListener(this);
            add(boton_2e);
            
            
            boton_1e=new JButton();
            boton_1e.setIcon(new ImageIcon("src/images/1e.gif"));
            boton_1e.setBounds(400,250,50,50);
            boton_1e.addActionListener(this);
            add(boton_1e);
            
            boton_50c=new JButton();
            boton_50c.setIcon(new ImageIcon("src/images/50c.gif"));
            boton_50c.setBounds(100,350,50,50);
            boton_50c.addActionListener(this);
            add(boton_50c);
            
            boton_20c=new JButton();
            boton_20c.setIcon(new ImageIcon("src/images/20c.gif"));
            boton_20c.setBounds(200,350,50,50);
            boton_20c.addActionListener(this);
            add(boton_20c);
            
            boton_10c=new JButton();
            boton_10c.setIcon(new ImageIcon("src/images/10c.gif"));
            boton_10c.setBounds(300,350,50,50);
            boton_10c.addActionListener(this);
            add(boton_10c);
            
            boton_5c=new JButton();
            boton_5c.setIcon(new ImageIcon("src/images/5c.gif"));
            boton_5c.setBounds(400,350,50,50);
            boton_5c.addActionListener(this);
            add(boton_5c);
            
            boton_2c=new JButton();
            boton_2c.setIcon(new ImageIcon("src/images/2c.gif"));
            boton_2c.setBounds(200,450,50,50);
            boton_2c.addActionListener(this);
            add(boton_2c);
            
            boton_1c=new JButton();
            boton_1c.setIcon(new ImageIcon("src/images/1c.gif"));
            boton_1c.setBounds(300,450,50,50);
            boton_1c.addActionListener(this);
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
            boton_volver.addActionListener(this);
            add(boton_volver);
            
            boton_continuar=new JButton("Continuar");
            boton_continuar.setBounds(350,650,100,30);
            boton_continuar.addActionListener(this);
            add(boton_continuar);

}
public void actionPerformed(ActionEvent e) { 
    
           
          
           if(e.getSource()==boton_volver){
            
            
            VistaBienvenida iniciostart=new VistaBienvenida();
            iniciostart.setBounds(0,0,400,300);
            iniciostart.setVisible(true);
            iniciostart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dispose();
           }
           
           if(e.getSource()==boton_200e){ 
            cantidad_insertada=cantidad_insertada+billete200;

            Pago Pago=new Pago();
            Pago.setBounds(0,0,600,730);
            Pago.setVisible(true);
            dispose();       
           }
           if(e.getSource()==boton_100e){ 
            cantidad_insertada=cantidad_insertada+billete100;

            Pago Pago=new Pago();
            Pago.setBounds(0,0,600,730);
            Pago.setVisible(true);
            dispose();       
           }
           if(e.getSource()==boton_50e){ 
            cantidad_insertada=cantidad_insertada+billete50;

            Pago Pago=new Pago();
            Pago.setBounds(0,0,600,730);
            Pago.setVisible(true);
            dispose();       
           }
           if(e.getSource()==boton_20e){ 
            cantidad_insertada=cantidad_insertada+billete20;

            Pago Pago=new Pago();
            Pago.setBounds(0,0,600,730);
            Pago.setVisible(true);
            dispose();       
           }
           if(e.getSource()==boton_10e){ 
            cantidad_insertada=cantidad_insertada+billete10;

            Pago Pago=new Pago();
            Pago.setBounds(0,0,600,730);
            Pago.setVisible(true);
            dispose();       
           }
           if(e.getSource()==boton_5e){ 
            cantidad_insertada=cantidad_insertada+billete5;

            Pago Pago=new Pago();
            Pago.setBounds(0,0,600,730);
            Pago.setVisible(true);
            dispose();       
           }
           if(e.getSource()==boton_2e){ 
            cantidad_insertada=cantidad_insertada+moneda2;

            Pago Pago=new Pago();
            Pago.setBounds(0,0,600,730);
            Pago.setVisible(true);
            dispose();       
           }
           if(e.getSource()==boton_1e){ 
            cantidad_insertada=cantidad_insertada+moneda1;

            Pago Pago=new Pago();
            Pago.setBounds(0,0,600,730);
            Pago.setVisible(true);
            dispose();       
           }
           if(e.getSource()==boton_50c){ 
            cantidad_insertada=cantidad_insertada+moneda50c;

            Pago Pago=new Pago();
            Pago.setBounds(0,0,600,730);
            Pago.setVisible(true);
            dispose();       
           }
           if(e.getSource()==boton_20c){ 
            cantidad_insertada=cantidad_insertada+moneda20c;

            Pago Pago=new Pago();
            Pago.setBounds(0,0,600,730);
            Pago.setVisible(true);
            dispose();       
           }
           if(e.getSource()==boton_10c){ 
            cantidad_insertada=cantidad_insertada+moneda10c;

            Pago Pago=new Pago();
            Pago.setBounds(0,0,600,730);
            Pago.setVisible(true);
            dispose();       
           }
           if(e.getSource()==boton_5c){ 
            cantidad_insertada=cantidad_insertada+moneda5c;

            Pago Pago=new Pago();
            Pago.setBounds(0,0,600,730);
            Pago.setVisible(true);
            dispose();       
           }
           if(e.getSource()==boton_2c){ 
            cantidad_insertada=cantidad_insertada+moneda2c;

            Pago Pago=new Pago();
            Pago.setBounds(0,0,600,730);
            Pago.setVisible(true);
            dispose();       
           }
           if(e.getSource()==boton_1c){ 
            cantidad_insertada=cantidad_insertada+moneda1c;

            Pago Pago=new Pago();
            Pago.setBounds(0,0,600,730);
            Pago.setVisible(true);
            dispose();       
           }
           
           if(e.getSource()==boton_continuar){
 
            if(cantidad_insertada>precioFinalcents){  
            pagoMayor pagoMayor=new pagoMayor();
            pagoMayor.setBounds(0,0,600,750);
            pagoMayor.setVisible(true);
            pagoMayor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dispose();}
            
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
            pagoIgual.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dispose();}
           }
}


}
    

