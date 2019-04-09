package vista;

import Controlador.ControladorPagoIgual;
import javax.swing.*;
import javax.swing.ImageIcon;


public class VistaPagoIgual extends JFrame{
    public static JLabel mensajejusto, mensajejusto2, logo1;
    public static JButton boton_finalizar;
    
    
    public VistaPagoIgual(){
            
            setLayout(null);
            
            ImageIcon icono=new ImageIcon("src//images/salding.png");
            logo1=new JLabel(icono);
            logo1.setSize(100,100);
            add(logo1);
            validate();
           
            mensajejusto=new JLabel("La cantidad insertada es correcta. Esperamos volver a verte pronto.");
            mensajejusto.setBounds(12,120,400,20);
            add(mensajejusto);
            
            boton_finalizar=new JButton("Finalizar");
            boton_finalizar.setBounds(115,180,150,30);
            add(boton_finalizar); 
    
            ControladorPagoIgual cont=new ControladorPagoIgual(boton_finalizar);
    
    }

    public static JButton getBoton_finalizar() {
        return boton_finalizar;
    }
    
}
    

