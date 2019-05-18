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
import Modelo.Alojamiento;
import static Modelo.Alojamiento.alojamiento1;
import Modelo.Apartamento;
import static Modelo.Apartamento.apartamento1;
import Modelo.Hotel;
import Vista.VistaBienvenida;
import Vista.VistaResumenDescuento;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

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
                Alojamiento.alojamiento1.calcularDiasFestivos();
                habitacionSeleccionada(comboBoxResultadosApartamento);
//                Apartamento apart = new Apartamento();
                apartamento1.datosApartamentoSeleccionado(apartamento1.getCodigoApartamento());
                
                apartamento1.setPrecioFinal(alojamiento1.calcularPrecioFinal(alojamiento1.getPrecioBase(), alojamiento1.getPrecioFestivo(), 
                alojamiento1.getCantidadDiasFestivos(),alojamiento1.getCantidadDiasNormales()));
                
                VistaResumenDescuento ResumenDescuentoApartamento=new VistaResumenDescuento();
                ResumenDescuentoApartamento.setSize(916,729);    ResumenDescuentoApartamento.setLocationRelativeTo(null);
    ResumenDescuentoApartamento.setVisible(true);
                ResumenDescuentoApartamento.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ResumenDescuentoApartamento.setVisible(true);
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
            iniciostart.setSize(916,729);    iniciostart.setLocationRelativeTo(null);
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
            
            Iterator<String> ite= apartamento.ApartamentoPorLugarYpersonas(Alojamiento.alojamiento1.getCiudad(),Apartamento.apartamento1.getNum_personas()).iterator();
            while(ite.hasNext()){
            comboBoxResultadosHotel.addItem(ite.next()); 
          }
           }
}

