
package vista;

import Controlador.ControladorResumenCompra;
import Controlador.ControladorPago;
import Controlador.ControladorPagoMayor;
import static Controlador.ControladorPagoMayor.*;
import javax.swing.*;
import javax.swing.ImageIcon;
import static Controlador.ControladorPago.*;



public class VistaPagoMayor extends JFrame{
    

    public static double precioFinal2, precioFinal2cents;
    public static double vueltasCentimos;
    public static double vueltasBillete200;
    public static double vueltasBillete100;
    public static double vueltasBillete50;
    public static double vueltasBillete20;
    public static double vueltasBillete10;
    public static double vueltasBillete5;
    public static double vueltasMoneda2;
    public static double vueltasMoneda1;
    public static double vueltas50cents;
    public static double vueltas20cents;
    public static double vueltas10cents;
    public static double vueltas5cents;
    public static double vueltas2cents;
    public static double vueltas1cents;
    public static JLabel mensajeVueltas,logo1;
    public static JLabel imagen200,imagen100,imagen50,imagen20,imagen10,imagen5,imagen2,imagen1,imagen50c,imagen20c,imagen10c,imagen5c,imagen2c,imagen1c;
    public static JLabel mensaje200,mensaje100,mensaje50,mensaje20,mensaje10,mensaje5,mensaje2,mensaje1,mensaje50c,mensaje20c,mensaje10c,mensaje5c,mensaje2c,mensaje1c;
    public static JButton terminar_compra;
    
    public VistaPagoMayor(){
            
     setLayout(null);  
            ControladorPago controp=new ControladorPago();
            ControladorResumenCompra contro=new ControladorResumenCompra();
            precioFinal2=contro.precio1cents;
            precioFinal2cents=precioFinal2;
            vueltasCentimos=controp.cantidad_insertada-precioFinal2cents;

        
            mensajeVueltas=new JLabel("CANTIDAD A DEVOLVER: "+vueltasCentimos/100+"€");
            mensajeVueltas.setBounds(220,70,220,20);
            add(mensajeVueltas);
            
        vueltasBillete200=vueltasCentimos/billete200;
        vueltasCentimos=vueltasCentimos%billete200;

            ImageIcon icono200=new ImageIcon("src/images/200e.jpg");
            imagen200=new JLabel(icono200);
            imagen200.setSize(50,50);
            imagen200.setBounds(30,150,50,50);
            add(imagen200);
            
                mensaje200=new JLabel((int)vueltasBillete200+" Billete/s de 200€");
                mensaje200.setBounds(100,170,150,20);
                add(mensaje200);
        
        vueltasBillete100=vueltasCentimos/billete100;
        vueltasCentimos=vueltasCentimos%billete100;
        
            ImageIcon icono100=new ImageIcon("src/images/100e.jpg");
            imagen100=new JLabel(icono100);
            imagen100.setSize(50,50);
            imagen100.setBounds(30,220,50,50);
            add(imagen100);
            
                mensaje100=new JLabel((int)vueltasBillete100+" Billete/s de 100€");
                mensaje100.setBounds(100,240,150,20);
                add(mensaje100);
            
        vueltasBillete50=vueltasCentimos/billete50;
        vueltasCentimos=vueltasCentimos%billete50;
        
            ImageIcon icono50=new ImageIcon("src/images/50e.jpg");
            imagen50=new JLabel(icono50);
            imagen50.setSize(50,50);
            imagen50.setBounds(30,290,50,50);
            add(imagen50);

                mensaje50=new JLabel((int)vueltasBillete50+" Billete/s de 50€");
                mensaje50.setBounds(100,310,150,20);
                add(mensaje50);
        
        vueltasBillete20=vueltasCentimos/billete20;
        vueltasCentimos=vueltasCentimos%billete20;
        
            ImageIcon icono20=new ImageIcon("src/images/20e.jpg");
            imagen20=new JLabel(icono20);
            imagen20.setSize(50,50);
            imagen20.setBounds(30,360,50,50);
            add(imagen20);
            
                mensaje20=new JLabel((int)vueltasBillete20+" Billete/s de 20€");
                mensaje20.setBounds(100,380,150,20);
                add(mensaje20);

        vueltasBillete10=vueltasCentimos/billete10;
        vueltasCentimos=vueltasCentimos%billete10;
        
            ImageIcon icono10=new ImageIcon("src/images/10e.jpg");
            imagen10=new JLabel(icono10);
            imagen10.setSize(50,50);
            imagen10.setBounds(30,430,50,50);
            add(imagen10);
        
                mensaje10=new JLabel((int)vueltasBillete10+" Billete/s de 10€");
                mensaje10.setBounds(100,450,150,20);
                add(mensaje10);

        vueltasBillete5=vueltasCentimos/billete5;
        vueltasCentimos=vueltasCentimos%billete5;
        
            ImageIcon icono5=new ImageIcon("src/images/5e.jpg");
            imagen5=new JLabel(icono5);
            imagen5.setSize(50,50);
            imagen5.setBounds(30,500,50,50);
            add(imagen5);
        
                mensaje5=new JLabel((int)vueltasBillete5+" Billete/s de 5€");
                mensaje5.setBounds(100,520,150,20);
                add(mensaje5);

        vueltasMoneda2=vueltasCentimos/moneda2;
        vueltasCentimos=vueltasCentimos%moneda2;
        
            ImageIcon icono2=new ImageIcon("src/images/2e.gif");
            imagen2=new JLabel(icono2);
            imagen2.setSize(50,50);
            imagen2.setBounds(30,570,50,50);
            add(imagen2);
            
                mensaje2=new JLabel((int)vueltasMoneda2+" Moneda/s de 2€");
                mensaje2.setBounds(100,590,150,20);
                add(mensaje2);

        vueltasMoneda1=vueltasCentimos/moneda1;
        vueltasCentimos=vueltasCentimos%moneda1;
       
            ImageIcon icono1=new ImageIcon("src/images/1e.gif");
            imagen1=new JLabel(icono1);
            imagen1.setSize(50,50);
            imagen1.setBounds(300,150,50,50);
            add(imagen1);
            
                mensaje1=new JLabel((int)vueltasMoneda1+" Moneda/s de 1€");
                mensaje1.setBounds(370,170,150,20);
                add(mensaje1);

        vueltas50cents=vueltasCentimos/moneda50c;
        vueltasCentimos=vueltasCentimos%moneda50c;
        
            ImageIcon icono50c=new ImageIcon("src/images/50c.gif");
            imagen50c=new JLabel(icono50c);
            imagen50c.setSize(50,50);
            imagen50c.setBounds(300,220,50,50);
            add(imagen50c);        
        
                mensaje50c=new JLabel((int)vueltas50cents+" Moneda/s de 50cents");
                mensaje50c.setBounds(370,240,150,20);
                add(mensaje50c);

        vueltas20cents=vueltasCentimos/moneda20c;
        vueltasCentimos=vueltasCentimos%moneda20c;
        
            ImageIcon icono20c=new ImageIcon("src/images/20c.gif");
            imagen20c=new JLabel(icono20c);
            imagen20c.setSize(50,50);
            imagen20c.setBounds(300,290,50,50);
            add(imagen20c);   
        
                mensaje20c=new JLabel((int)vueltas20cents+" Moneda/s de 20cents");
                mensaje20c.setBounds(370,310,150,20);
                add(mensaje20c);

        vueltas10cents=vueltasCentimos/moneda10c;
        vueltasCentimos=vueltasCentimos%moneda10c;
        
            ImageIcon icono10c=new ImageIcon("src/images/10c.gif");
            imagen10c=new JLabel(icono10c);
            imagen10c.setSize(50,50);
            imagen10c.setBounds(300,360,50,50);
            add(imagen10c);  
            
                mensaje10c=new JLabel((int)vueltas10cents+" Moneda/s de 10cents");
                mensaje10c.setBounds(370,380,150,20);
                add(mensaje10c);

        vueltas5cents=vueltasCentimos/moneda5c;
        vueltasCentimos=vueltasCentimos%moneda5c;

            ImageIcon icono5c=new ImageIcon("src/images/5c.gif");
            imagen5c=new JLabel(icono5c);
            imagen5c.setSize(50,50);
            imagen5c.setBounds(300,430,50,50);
            add(imagen5c);          
        
                mensaje5c=new JLabel((int)vueltas5cents+" Moneda/s de 5cents");
                mensaje5c.setBounds(370,450,150,20);
                add(mensaje5c);

        vueltas2cents=vueltasCentimos/moneda2c;
        vueltasCentimos=vueltasCentimos%moneda2c;
        
            ImageIcon icono2c=new ImageIcon("src/images/2c.gif");
            imagen2c=new JLabel(icono2c);
            imagen2c.setSize(50,50);
            imagen2c.setBounds(300,500,50,50);
            add(imagen2c); 
        
                mensaje2c=new JLabel((int)vueltas2cents+" Moneda/s de 2cents");
                mensaje2c.setBounds(370,520,150,20);
                add(mensaje2c);
        
        vueltas1cents=vueltasCentimos/moneda1c;
        
            ImageIcon icono1c=new ImageIcon("src/images/1c.gif");
            imagen1c=new JLabel(icono1c);
            imagen1c.setSize(50,50);
            imagen1c.setBounds(300,570,50,50);
            add(imagen1c); 
        
                mensaje1c=new JLabel((int)vueltas1cents+" Moneda/s de 1cent");
                mensaje1c.setBounds(370,590,150,20);
                add(mensaje1c);
    
    
            terminar_compra=new JButton("Terminar");
            terminar_compra.setBounds(200,650,100,30);
            add(terminar_compra);
    
            ImageIcon icono=new ImageIcon("src//images/fondoPago.png");
            logo1=new JLabel(icono);
            logo1.setSize(585,695);
            add(logo1);
            validate();
            
            ControladorPagoMayor cont=new ControladorPagoMayor(terminar_compra);
    
    }

    public static JButton getTerminar_compra() {
        return terminar_compra;
    }
    
    

}
