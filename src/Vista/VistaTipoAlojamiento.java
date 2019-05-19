package Vista;

import Controlador.ControladorTipoAlojamiento;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import static vista.VistaPago.logo1;

/**
 *
 * @author ikasleaETHAZI
 */
public class VistaTipoAlojamiento extends JFrame{
    

    
    
    
    
    public VistaTipoAlojamiento(){
        setLayout(null);
        
        JRadioButton radioHotel = new JRadioButton();
        JRadioButton radioCasa = new JRadioButton();
        JRadioButton radioApartamento = new JRadioButton();
        
        ButtonGroup group = new ButtonGroup();
        group.add(radioHotel);
        group.add(radioCasa);
        group.add(radioApartamento);
        
        radioHotel.setBounds(270,325,20,30);
        radioHotel.setOpaque(false);
        radioHotel.setContentAreaFilled(false);
        radioHotel.setBorderPainted(false);
        add(radioHotel);
        
        radioCasa.setBounds(620,325,20,30);
        radioCasa.setOpaque(false);
        radioCasa.setContentAreaFilled(false);
        radioCasa.setBorderPainted(false);
        add(radioCasa);
        
        radioApartamento.setBounds(450,450,20,30);
        radioApartamento.setOpaque(false);
        radioApartamento.setContentAreaFilled(false);
        radioApartamento.setBorderPainted(false);
        add(radioApartamento);
        
        JLabel mensajeTipoAlojamiento=new JLabel("Seleccione el tipo de alojamiento");
        mensajeTipoAlojamiento.setBounds(370,200,200,30);
        add(mensajeTipoAlojamiento);
        
        JButton botonTipoAlojamiento=new JButton("Siguiente");
        botonTipoAlojamiento.setBounds(470,600,100,30);
        add(botonTipoAlojamiento);
        
        JButton botonCancelar=new JButton("Cancelar");
        botonCancelar.setBounds(360,600,100,30);
        add(botonCancelar);
        
        ImageIcon icono=new ImageIcon("src//images/fondo_tipoaloj.png");
            logo1=new JLabel(icono);
            logo1.setSize(900,692);
            add(logo1);
            validate();
        
        ControladorTipoAlojamiento cont=new ControladorTipoAlojamiento(botonTipoAlojamiento,botonCancelar,radioHotel,radioCasa,radioApartamento);
    }
    
    
    
}

