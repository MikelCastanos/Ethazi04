package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import static vista.VistaPago.*;
import vista.VistaPago;
import static Controlador.ControladorPago.*;
import Controlador.ControladorPago;

public class VistaPagoMenor extends JFrame implements ActionListener{
    public static JLabel mensajemenor, mensajemenor2, logo1;
    public double medebes=((precioFinalcents-cantidad_insertada)/100);
    public static JButton boton_masdinero;
    
    public VistaPagoMenor(){
            
        setLayout(null);
        
            ImageIcon icono=new ImageIcon("src//images/salding.png");
            logo1=new JLabel(icono);
            logo1.setSize(100,100);
            add(logo1);
            validate(); 
            
            mensajemenor=new JLabel("La cantidad insertada es inferior al precio total.");
            mensajemenor.setBounds(120,40,400,20);
            add(mensajemenor);
                        mensajemenor2=new JLabel("Por favor, introduce el resto.");
            mensajemenor2.setBounds(160,100,400,20);
            add(mensajemenor2);
                 
            boton_masdinero=new JButton("Insertar mas dinero");
            boton_masdinero.setBounds(160,170,150,30);
            boton_masdinero.addActionListener(this);
            add(boton_masdinero);
    }
    
        public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==boton_masdinero){
            dispose();
                    }
    }
    
}
