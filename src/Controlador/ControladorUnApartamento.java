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
import Vista.VistaResumenHotel;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static Modelo.Apartamento.apartamento1;

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
<<<<<<< HEAD
               // Alojamiento.alojamiento1.calcularDiasFestivos();
=======
                Alojamiento alojamiento= new Alojamiento();
                alojamiento.calcularDiasFestivos(apartamento1.getFechaEntrada(),apartamento1.getFechaSalida());
                
>>>>>>> 0faf3722b2bb1d7c686400612bc58191376169f9
                habitacionSeleccionada(comboBoxResultadosApartamento);
                apartamento1.datosApartamentoSeleccionado(apartamento1.getCodigoApartamento());
                
                apartamento1.setPrecioFinal(alojamiento1.calcularPrecioFinal(alojamiento1.getPrecioBase(), alojamiento1.getPrecioFestivo(), 
                alojamiento1.getCantidadDiasFestivos(),alojamiento1.getCantidadDiasNormales()));
                
                VistaResumenHotel ResumenDescuentoApartamento=new VistaResumenHotel();
                ResumenDescuentoApartamento.setSize(905,720);
                ResumenDescuentoApartamento.setResizable(false);    ResumenDescuentoApartamento.setLocationRelativeTo(null);
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
            
            Iterator<String> ite= apartamento.ApartamentoPorLugarYpersonas(apartamento1.getCiudad(),Apartamento.apartamento1.getNum_personas()).iterator();
            while(ite.hasNext()){
            comboBoxResultadosHotel.addItem(ite.next()); 
          }
           }
}

