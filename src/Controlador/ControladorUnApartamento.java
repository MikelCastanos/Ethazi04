/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import static Controlador.ControladorPago.cantidad_insertada;
import static Controlador.ControladorTipoAlojamiento.tipoDeAlojamiento;
import static Controlador.ControladorUbicacionHotel.seleccionUbicacion;
import Modelo.Apartamento;
import Modelo.Hotel;
import Vista.VistaBienvenida;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author shabi
 */
public class ControladorUnApartamento {
    
                    public ControladorUnApartamento(JButton botonCancelar,JButton botonSiguienteUnaApartamento,JComboBox comboBoxResultadosApartamento){
        botonSiguienteUnaApartamento.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                System.out.println("Boton Una Apartamento");
                
                
            }
            
        });
    botonCancelar.addMouseListener(new MouseAdapter(){
             public void mouseClicked(MouseEvent a){
                cancelar();
    }
             });
        
            }

public void cancelar(){
          JOptionPane.showMessageDialog(null,"Pedido cancelado. Volverá a la pantalla de inicio. ¡Hasta la proxima!");
            cantidad_insertada=0;
            VistaBienvenida iniciostart=new VistaBienvenida();
            iniciostart.setBounds(0,0,600,730);
            iniciostart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            iniciostart.setVisible(true);
          
          }
            
            public void habitacionSeleccionada(JComboBox comboBoxResultadosApartamento){
                comboBoxResultadosApartamento.getSelectedItem();
            }
    
            public void rellenarComboBox (JComboBox comboBoxResultadosHotel){
            Apartamento apartamento= new Apartamento();
//            hotel.HotelPorLugar(ControladorUbicacionHotel.seleccionUbicacion);
            
            Iterator<String> ite= apartamento.ApartamentoPorLugar(seleccionUbicacion).iterator();
            while(ite.hasNext()){
            comboBoxResultadosHotel.addItem(ite.next()); 
          }
           }
}

