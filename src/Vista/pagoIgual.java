package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;


public class pagoIgual extends JFrame implements ActionListener {
    public static JLabel mensajejusto, mensajejusto2, logo1;
    public static JButton boton_finalizar;
    
    
    public pagoIgual(){
            
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
            boton_finalizar.addActionListener(this);
            add(boton_finalizar); }
    
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==boton_finalizar){
           
            VistaBienvenida crono=new VistaBienvenida();
            crono.setBounds(0,0,400,300);
            crono.setVisible(true);
            crono.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dispose();
    }
    }}
    

