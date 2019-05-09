/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Vista.VistaComplementosApartamento;
import Vista.VistaUnApartamento;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 *
 * @author shabi
 */
public class ControladorComplementosApartamento {
    
            public ControladorComplementosApartamento(JButton botonSiguienteComplementosApartamento,JCheckBox checkboxWifiApartamento,JCheckBox checkboxPiscinaApartamento,JCheckBox checkboxSpaApartamento,JCheckBox checkboxParkingApartamento,JCheckBox checkboxAAApartamento,JCheckBox checkboxRestauranteApartamento,JCheckBox checkboxBarApartamento,JCheckBox checkboxGymApartamento){
        botonSiguienteComplementosApartamento.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                
                comprobarCheckBoxesComplementosApartamento();
                siguienteVentana();
                
            }
            
        });
    }
        
        public void siguienteVentana(){
           VistaUnApartamento vista1Apartamento=new VistaUnApartamento();
                  vista1Apartamento.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      vista1Apartamento.setBounds(0,0,600,725);
      vista1Apartamento.setVisible(true);
       
            
        }
        
         public void comprobarCheckBoxesComplementosApartamento(){
            
            
            
            if(VistaComplementosApartamento.checkboxWifiApartamento.isSelected()){
            Modelo.Complementos.apartamentoComplementos.setWifi(true);
        }
        
            if(VistaComplementosApartamento.checkboxSpaApartamento.isSelected()){
            Modelo.Complementos.apartamentoComplementos.setSpa(true);
        }

            if(VistaComplementosApartamento.checkboxPiscinaApartamento.isSelected()){
            Modelo.Complementos.apartamentoComplementos.setPiscina(true);
        }

            if(VistaComplementosApartamento.checkboxParkingApartamento.isSelected()){
            Modelo.Complementos.apartamentoComplementos.setParking(true);
        }

            if(VistaComplementosApartamento.checkboxAAApartamento.isSelected()){
            Modelo.Complementos.apartamentoComplementos.setAireacondicionado(true);
        }

            if(VistaComplementosApartamento.checkboxRestauranteApartamento.isSelected()){
            Modelo.Complementos.apartamentoComplementos.setRestaurante(true);
        }

            if(VistaComplementosApartamento.checkboxBarApartamento.isSelected()){
            Modelo.Complementos.apartamentoComplementos.setBar(true);
        }

            if(VistaComplementosApartamento.checkboxGymApartamento.isSelected()){
            Modelo.Complementos.apartamentoComplementos.setGimnasio(true);
        }
        
        }
    
}
