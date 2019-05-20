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

import Modelo.Alojamiento;

import Modelo.Apartamento;


import Vista.VistaBienvenida;
import Vista.VistaResumenHotel;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Vista.VistaResumenApartamento;

/**
 *
 * @author shabi
 */
public class ControladorUnApartamento {
    
        public ControladorUnApartamento(JButton botonCancelar,JButton botonSiguienteUnaApartamento,
            JComboBox comboBoxResultadosApartamento){
            botonSiguienteUnaApartamento.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e){
                System.out.println("Boton Una Apartamento");


                Alojamiento alojamiento= new Alojamiento();
                alojamiento.calcularDiasFestivos(Apartamento.apartamento1.getFechaEntrada(),Apartamento.apartamento1.getFechaSalida());
                

                habitacionSeleccionada(comboBoxResultadosApartamento);
                Apartamento.apartamento1.datosApartamentoSeleccionado(Apartamento.apartamento1.getCodigoApartamento());
                
                Apartamento.apartamento1.setPrecioFinal(Apartamento.apartamento1.calcularPrecioFinal(Apartamento.apartamento1.getPrecioBase(), Apartamento.apartamento1.getPrecioFestivo(), 
                Apartamento.apartamento1.getCantidadDiasFestivos(),Apartamento.apartamento1.getCantidadDiasNormales()));
                
                VistaResumenApartamento ResumenDescuentoApartamento=new VistaResumenApartamento();
                ResumenDescuentoApartamento.setSize(905,720);
                ResumenDescuentoApartamento.setResizable(false);    ResumenDescuentoApartamento.setLocationRelativeTo(null);
                ResumenDescuentoApartamento.setVisible(true);
                ResumenDescuentoApartamento.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ResumenDescuentoApartamento.setVisible(true);
                
                    System.out.println(Apartamento.apartamento1.getPrecioBase()+" "+ Apartamento.apartamento1.getPrecioFestivo()+" "+
                Apartamento.apartamento1.getCantidadDiasFestivos()+" "+Apartamento.apartamento1.getCantidadDiasNormales());
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
            iniciostart.setSize(905,720);
            iniciostart.setResizable(false);    iniciostart.setLocationRelativeTo(null);
            iniciostart.setVisible(true);
            iniciostart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            iniciostart.setVisible(true);
          
          }
            
            public void habitacionSeleccionada(JComboBox comboBoxResultadosApartamento){
//                apartamento1.setCodigoApartamento(Integer.parseInt(comboBoxResultadosApartamento.getSelectedItem().toString()));
            }
    
            public void rellenarComboBox (JComboBox comboBoxResultadosHotel){
            Apartamento apartamento= new Apartamento();
//            hotel.HotelPorLugar(ControladorUbicacionHotel.seleccionUbicacion);
            
            Iterator<String> ite= apartamento.ApartamentoPorLugarYpersonas(Apartamento.apartamento1.getCiudad(),Apartamento.apartamento1.getNum_personas()).iterator();
            while(ite.hasNext()){
            comboBoxResultadosHotel.addItem(ite.next()); 
          }
           }
}

