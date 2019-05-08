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
import java.util.Iterator;
import javax.swing.JButton;
import javax.swing.JComboBox;

/**
 *
 * @author shabi
 */
public class ControladorUbicacionCasa {
    
    
public ControladorUbicacionCasa(){}

    public ControladorUbicacionCasa(JButton botonSiguienteUbicacionCasa,JComboBox comboBoxUbicacionCasa,JComboBox comboBoxNumeroPersonasCasa,JDateChooser fechaEntradaCasa,JDateChooser fechaSalidaCasa){
        botonSiguienteUbicacionCasa.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                System.out.println("VAYA");
                

            }
            
        });
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
