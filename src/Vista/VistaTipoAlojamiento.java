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
        
        JRadioButton radioHotel = new JRadioButton("Hotel");
        JRadioButton radioCasa = new JRadioButton("Casa");
        JRadioButton radioApartamento = new JRadioButton("Apartamento");
        
        ButtonGroup group = new ButtonGroup();
        group.add(radioHotel);
        group.add(radioCasa);
        group.add(radioApartamento);
        
        radioHotel.setBounds(250,200,100,30);
        add(radioHotel);
        
        radioCasa.setBounds(250,250,100,30);
        add(radioCasa);
        
        radioApartamento.setBounds(250,300,100,30);
        add(radioApartamento);
        
        JLabel mensajeTipoAlojamiento=new JLabel("Seleccione el tipo de alojamiento");
        mensajeTipoAlojamiento.setBounds(50,250,200,30);
        add(mensajeTipoAlojamiento);
        
        JButton botonTipoAlojamiento=new JButton("Siguiente");
        botonTipoAlojamiento.setBounds(450,600,100,30);
        add(botonTipoAlojamiento);
        
        JButton botonCancelar=new JButton("Cancelar");
        botonCancelar.setBounds(340,600,100,30);
        add(botonCancelar);
        
                ImageIcon icon=new ImageIcon("src//images/Bidaion.png");
        JLabel logo2 = new JLabel(icon);
            logo2.setSize(575,200);
            add(logo2);
            validate();
        
        ImageIcon icono=new ImageIcon("src//images/fondo.png");
            logo1=new JLabel(icono);
            logo1.setSize(900,690);
            add(logo1);
            validate();
        
        ControladorTipoAlojamiento cont=new ControladorTipoAlojamiento(botonTipoAlojamiento,botonCancelar,radioHotel,radioCasa,radioApartamento);
    }
    
    
    
}

