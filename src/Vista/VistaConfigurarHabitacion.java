/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JFrame;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import Controlador.*;

import static Vista.VistaBienvenida.boton_siguiente;
import com.toedter.calendar.JDateChooser;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.SwingUtilities;
import static vista.VistaPago.logo1;



public class VistaConfigurarHabitacion extends JFrame{
    
    JLabel mensaje_configuracion,mensaje_cama_individual,mensaje_cama_doble,mensaje_cama_niño;
    JComboBox camaSimpleBox,camaDobleBox,camaNiñoBox;
    static JButton irEstanciaSeleccionada;
    
    public VistaConfigurarHabitacion(JComboBox eleccion){
        
        irEstanciaSeleccionada=new javax.swing.JButton();
        
        setLayout(null);
        mensaje_configuracion=new JLabel("Está configurando la habitacion: ");
        mensaje_configuracion.setBounds(200,100,350,30);
        add(mensaje_configuracion);
    
        mensaje_cama_individual=new JLabel("Camas Individuales:");
        mensaje_cama_individual.setBounds(50,200,150,30);
        add(mensaje_cama_individual);
        
        camaSimpleBox=new JComboBox();
        camaSimpleBox.addItem(0);
        camaSimpleBox.addItem(1);
        camaSimpleBox.setBounds(200,200,100,30);
        add(camaSimpleBox);
        
        
        mensaje_cama_doble=new JLabel("Camas Dobles:");
        mensaje_cama_doble.setBounds(50,300,150,30);
        add(mensaje_cama_doble);
        
        camaDobleBox=new JComboBox();
        camaDobleBox.addItem(0);
        camaDobleBox.addItem(1);
        camaDobleBox.setBounds(200,300,100,30);
        add(camaDobleBox);
        
        
        mensaje_cama_niño=new JLabel("Camas Infantiles:");
        mensaje_cama_niño.setBounds(50,400,150,30);
        add(mensaje_cama_niño);
        
        camaNiñoBox=new JComboBox();
        camaNiñoBox.addItem(0);
        camaNiñoBox.addItem(1);
        camaNiñoBox.setBounds(200,400,100,30);
        add(camaNiñoBox);        
        
        irEstanciaSeleccionada=new JButton("Siguiente");
        irEstanciaSeleccionada.setBounds(400,500,150,30);
        add(irEstanciaSeleccionada);
        
        ControladorConfigurarHabitacion cont=new ControladorConfigurarHabitacion(irEstanciaSeleccionada,eleccion,camaSimpleBox,camaDobleBox,camaNiñoBox);
}
    
    
    
    /*
    public static void main(String[] args) {
        VistaConfigurarHabitacion ir=new VistaConfigurarHabitacion();
        ir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ir.setBounds(0,0,600,725);
               ir.setVisible(true);
                       
    }*/
    
}
