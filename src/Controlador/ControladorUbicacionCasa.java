/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Casa;
import Modelo.Hotel;
import com.toedter.calendar.JDateChooser;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JComboBox;
import Vista.VistaBienvenida;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;
import Vista.*;
import Modelo.*;
import java.awt.event.MouseEvent;
import java.util.Iterator;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Modelo.Hotel;
import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author shabi
 */
public class ControladorUbicacionCasa {
    
    
    public ControladorUbicacionCasa(){}

    public ControladorUbicacionCasa(JButton botonSiguienteUbicacionCasa,JComboBox comboBoxUbicacionCasa,JComboBox comboBoxNumeroPersonasCasa,JDateChooser fechaEntradaCasa,JDateChooser fechaSalidaCasa){
        botonSiguienteUbicacionCasa.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                impr();
                

            }
            
        });
    }
    
    
    public void impr(){
        System.out.println("VAYA2");
    }
    public void rellenarComboBox (JComboBox comboBoxUbicacionCasa){
           Hotel hotel=new Hotel();
//           hotel.ubicacion();
           
        Iterator<String> i= hotel.ubicacion().iterator();
        while(i.hasNext()){
           comboBoxUbicacionCasa.addItem(i.next()); 
        }
         }
    
}
