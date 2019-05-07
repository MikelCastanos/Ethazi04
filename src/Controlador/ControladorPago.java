package Controlador;

import BBDD.Conexion;
import Vista.VistaBienvenida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;
import Modelo.*;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import vista.VistaPago;
import vista.VistaPagoMayor;
import static vista.VistaPago.*;
import Modelo.Alojamiento;
import Modelo.Habitacion;
import javax.swing.JOptionPane;




public class ControladorPago extends JFrame {
   public int billete200=20000,billete100=10000,billete50=5000,billete20=2000,billete10=1000,billete5=500,moneda2=200,moneda1=100,moneda50c=50,moneda20c=20,moneda10c=10,moneda5c=5,moneda2c=2,moneda1c=1;
   public static double cantidad_insertada=0;
   public  double precioFinal = Habitacion.habitacion1.getPrecio_habitacion()*Alojamiento.alojamiento1.getDiasEstancia();
   public  double precioFinalcents = precioFinal*100;
   
    VistaPago pago;
    Modelo modelo;
    ActionListener actionListener;
    
    public ControladorPago(){}
    
    public ControladorPago(JButton boton_volver, JButton boton_continuar, JButton boton_200e, JButton boton_100e,
            JButton boton_50e, JButton boton_20e, JButton boton_10e, JButton boton_5e, JButton boton_2e, JButton boton_1e,
            JButton boton_50c, JButton boton_20c, JButton boton_10c,JButton boton_5c,JButton boton_2c,JButton boton_1c){
    boton_volver.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                volver();
            }  
        });
    boton_continuar.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                continuar();
            }
        });
    boton_200e.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                e200();
            }
        });
    boton_100e.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                e100();
            }
        });
    boton_50e.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
               e50();
            }
        });
    boton_20e.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                e20();
            }
        });
    boton_10e.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                e10();
            }
        });
    boton_5e.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                e5();
            }
        });
    boton_2e.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                e2();
            }
        });
    boton_1e.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                e1();
            }
        });
    boton_50c.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                e50();
            }
        });
    boton_20c.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                c20();
            }
        });
    boton_10c.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                c10();
            }
        });
    boton_5c.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                c5();
            }
        });
    boton_2c.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                c2();
            }
        });
    boton_1c.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                c1();
            }
        });   

    }
    
    public void contol(){        
        actionListener = new ActionListener() {
              public void actionPerformed(ActionEvent actionEvent) {  
                  volver(); continuar();
                  e200(); e100(); e200(); e50(); e20(); e10(); e5(); e2(); e1();
                  c50(); c20(); c10(); c5(); c2(); c1();
              }
        };
    }
   
    public void continuar(){         
            
            if(getBoton_continuar()==boton_continuar){   
 
            if(cantidad_insertada>precioFinalcents){  
            VistaPagoMayor pagoMayor=new VistaPagoMayor();
            pagoMayor.setBounds(0,0,600,730);
            pagoMayor.setVisible(true);
            pagoMayor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
            
            if(cantidad_insertada<precioFinalcents){  
            JOptionPane.showMessageDialog(null,"¡¡¡La cantidad de dinero insertada es insuficiente!!!. For favor inserte el resto del dinero.");}
            
            if(cantidad_insertada==precioFinalcents){  
            JOptionPane.showMessageDialog(null,"¡La cantidad de dinero insertada es exacta!. Muchas gracias por su reserva.");
           Conexion conn= new Conexion();
           conn.desconectar();
           cantidad_insertada=0;
           VistaBienvenida vistab=new VistaBienvenida();
           vistab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           vistab.setBounds(0,0,600,730);
           vistab.setVisible(true);
            }
    }
    }
    
    public void volver(){
        
        if(getBoton_volver()==boton_volver){            
            cantidad_insertada=0;
            VistaBienvenida iniciostart=new VistaBienvenida();
            iniciostart.setBounds(0,0,600,730);
            iniciostart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            iniciostart.setVisible(true);                      
           }
    }
    
    public void e200(){
        
    if(getBoton_200e()==boton_200e){ 
            cantidad_insertada=cantidad_insertada+billete200;
            VistaPago Pago=new VistaPago();
            Pago.setBounds(0,0,600,730);
            Pago.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Pago.setVisible(true);      
           }
}
            
      public void e100(){
           if(getBoton_100e()==boton_100e){ 
            cantidad_insertada=cantidad_insertada+billete100;
            VistaPago Pago=new VistaPago();
            Pago.setBounds(0,0,600,730);
            Pago.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Pago.setVisible(true);     
           }
    }
      
        public void e50(){
           if(getBoton_50e()==boton_50e){ 
            cantidad_insertada=cantidad_insertada+billete50;
            VistaPago Pago=new VistaPago();
            Pago.setBounds(0,0,600,730);
            Pago.setVisible(true);     
           }
        }
        
           public void e20(){
           if(getBoton_20e()==boton_20e){ 
            cantidad_insertada=cantidad_insertada+billete20;
            VistaPago Pago=new VistaPago();
            Pago.setBounds(0,0,600,730);
            Pago.setVisible(true);     
           }
           }
           
           public void e10(){
           if(getBoton_10e()==boton_10e){ 
            cantidad_insertada=cantidad_insertada+billete10;
            VistaPago Pago=new VistaPago();
            Pago.setBounds(0,0,600,730);
            Pago.setVisible(true);      
           }
           }
           
           public void e5(){
           if(getBoton_5e()==boton_5e){ 
            cantidad_insertada=cantidad_insertada+billete5;
            VistaPago Pago=new VistaPago();
            Pago.setBounds(0,0,600,730);
            Pago.setVisible(true);
           }
           }
           
           public void e2(){
           if(getBoton_2e()==boton_2e){ 
            cantidad_insertada=cantidad_insertada+moneda2;
            VistaPago Pago=new VistaPago();
            Pago.setBounds(0,0,600,730);
            Pago.setVisible(true);
           }     
           }
           
           public void e1(){
           if(getBoton_1e()==boton_1e){ 
            cantidad_insertada=cantidad_insertada+moneda1;
            VistaPago Pago=new VistaPago();
            Pago.setBounds(0,0,600,730);
            Pago.setVisible(true);
           }       
           }
                     
           public void c50(){
           if(getBoton_50c()==boton_50c){ 
            cantidad_insertada=cantidad_insertada+moneda50c;
            VistaPago Pago=new VistaPago();
            Pago.setBounds(0,0,600,730);
            Pago.setVisible(true);
           }      
           }
                     
           public void c20(){
           if(getBoton_20c()==boton_20c){ 
            cantidad_insertada=cantidad_insertada+moneda20c;
            VistaPago Pago=new VistaPago();
            Pago.setBounds(0,0,600,730);
            Pago.setVisible(true);
           }       
           }
                     
           public void c10(){
           if(getBoton_10c()==boton_10c){ 
            cantidad_insertada=cantidad_insertada+moneda10c;
            VistaPago Pago=new VistaPago();
            Pago.setBounds(0,0,600,730);
            Pago.setVisible(true);
           }       
           }
                      
           public void c5(){
           if(getBoton_5c()==boton_5c){ 
            cantidad_insertada=cantidad_insertada+moneda5c;
            VistaPago Pago=new VistaPago();
            Pago.setBounds(0,0,600,730);
            Pago.setVisible(true);
           }      
           }
                      
           public void c2(){
           if(getBoton_2c()==boton_2c){ 
            cantidad_insertada=cantidad_insertada+moneda2c;
            VistaPago Pago=new VistaPago();
            Pago.setBounds(0,0,600,730);
            Pago.setVisible(true);
           }      
           }
                      
           public void c1(){
           if(getBoton_1c()==boton_1c){ 
            cantidad_insertada=cantidad_insertada+moneda1c;
            VistaPago Pago=new VistaPago();
            Pago.setBounds(0,0,600,730);
            Pago.setVisible(true);
           }      
           } 
           
        }
    
    
    
    

    

