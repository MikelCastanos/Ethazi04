
package Controlador;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import static Controlador.ControladorPago.cantidad_insertada;
import Modelo.Alojamiento;
import Modelo.Hotel;
import Vista.VistaBienvenida;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author shabi
 */
public class ControladorDosHabitaciones {
    
                public ControladorDosHabitaciones(JButton botonCancelar,JButton botonSiguienteDosHabitaciones,JComboBox comboBoxResultados2Habitaciones1,JComboBox comboBoxResultados2Habitaciones12){
        botonSiguienteDosHabitaciones.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                System.out.println("Dos Habitaciones");
                
                
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

        public void rellenarComboBox (JComboBox comboBoxResultados2Habitaciones1){
            Hotel hotel= new Hotel();
//            hotel.HotelPorLugar(ControladorUbicacionHotel.seleccionUbicacion);ç

            System.out.println("PRINT DE PRUEBA");
            System.out.println(Alojamiento.alojamiento1.getCiudad()+ControladorHotelesDisponibles.hotelSeleccionado );
            
            Iterator<String> ite= hotel.HabitacionHoteles(Alojamiento.alojamiento1.getCiudad(), ControladorHotelesDisponibles.hotelSeleccionado).iterator();
            while(ite.hasNext()){
            comboBoxResultados2Habitaciones1.addItem(ite.next()); 
            //comboBoxResultados2Habitaciones2.addItem(ite.next()); 
          }
           }
        
                public void rellenarComboBox2 (JComboBox comboBoxResultados2Habitaciones2){
            Hotel hotel= new Hotel();
//            hotel.HotelPorLugar(ControladorUbicacionHotel.seleccionUbicacion);ç

            System.out.println("PRINT DE PRUEBA");
            System.out.println(Alojamiento.alojamiento1.getCiudad()+ControladorHotelesDisponibles.hotelSeleccionado );
            
            Iterator<String> ite= hotel.HabitacionHoteles(Alojamiento.alojamiento1.getCiudad(), ControladorHotelesDisponibles.hotelSeleccionado).iterator();
            while(ite.hasNext()){
            comboBoxResultados2Habitaciones2.addItem(ite.next()); 
            //comboBoxResultados2Habitaciones2.addItem(ite.next()); 
          }
           }
                
                public void habitacionSeleccionada(JComboBox comboBoxResultados2Habitaciones1,JComboBox comboBoxResultados2Habitaciones2){
                comboBoxResultados2Habitaciones1.getSelectedItem();
                comboBoxResultados2Habitaciones2.getSelectedItem();
            }
    
}
