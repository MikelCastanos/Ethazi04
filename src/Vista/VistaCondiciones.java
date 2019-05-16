/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorCondiciones;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import static vista.VistaPago.logo1;

/**
 *
 * @author ibilbao
 */
public class VistaCondiciones extends JFrame {
  public VistaCondiciones(){
        setLayout(null);
        
        
        
        JLabel Condiciones = new JLabel("Bidai_ON mantiene este sitio web como un servicio para sus ");
        Condiciones.setBounds(100,100,400,300);
        add(Condiciones);
        
        JLabel Condiciones1 = new JLabel("visitantes y sus clientes. Para seguir utilizando este sitio web o");
        Condiciones1.setBounds(100,120,400,300);
        add(Condiciones1);
        
        JLabel Condiciones2 = new JLabel("contratar cualquiera de nuestros servicios, usted acepta atenerse a");
        Condiciones2.setBounds(100,140,400,300);
        add(Condiciones2);
        
        JLabel Condiciones3 = new JLabel("los Términos y Condiciones de nuestra firma: Bidai_ON S.L.");
        Condiciones3.setBounds(100,160,400,300);
        add(Condiciones3);
        
        JRadioButton radioCondiciones = new JRadioButton("He leído y acepto los terminos y las condiciones.");
        
        
        ButtonGroup group = new ButtonGroup();
        group.add(radioCondiciones);
        
        radioCondiciones.setBounds(110,400,300,30);
        add(radioCondiciones);

        
        JButton botonTipoAlojamiento=new JButton("Siguiente");
        botonTipoAlojamiento.setBounds(450,600,100,30);
        add(botonTipoAlojamiento);
        
        JButton botonCancelar=new JButton("Cancelar");
        botonCancelar.setBounds(340,600,100,30);
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
        
        ControladorCondiciones cont=new ControladorCondiciones(botonTipoAlojamiento,botonCancelar,radioCondiciones);
    }
    
    public static void main(String[] args) {
            VistaCondiciones iniciostart=new VistaCondiciones();
            iniciostart.setBounds(0,0,600,730);
            iniciostart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            iniciostart.setVisible(true);
    }
}
