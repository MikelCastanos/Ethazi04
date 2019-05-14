/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

//import Controlador.ControladorEleccion;
import Controlador.ControladorResumenCompra;
import Modelo.Alojamiento;
import Modelo.Hotel;
import Modelo.Usuario;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static vista.VistaPago.logo1;


/**
 *
 * @author shabi
 */
public class VistaResumenCompra extends JFrame{
    
    
        JLabel mensajeEstancia,datosEstancia,datosEstancia2,mensajeEstancia1,datosHabitacion,datosFechaReserva,datosCliente;
        JButton boton_siguiente4;
        
    
    public VistaResumenCompra(){} 
    
    public VistaResumenCompra(JComboBox eleccion){
        
        
        
        boton_siguiente4=new javax.swing.JButton();
        
        JButton botonCancelar=new JButton("Cancelar");
        botonCancelar.setBounds(340,600,100,30);
        add(botonCancelar);
        
        setLayout(null);
        
        mensajeEstancia=new JLabel("¡GRAN ELECCIÓN!");
        mensajeEstancia.setBounds(230,200,350,30);
        add(mensajeEstancia);
        
        mensajeEstancia1=new JLabel("Estos son los datos de tu elección:");
        mensajeEstancia1.setBounds(190,225,350,30);
        add(mensajeEstancia1);
        
//        ConsultaHotel cons=new ConsultaHotel();
//        datosEstancia=new JLabel(cons.consultaCompleta(seleccionEleccion).toString()); 
        
        Alojamiento alojamiento= new Alojamiento();
        alojamiento.mostrar();
        System.out.println("Vista datos: "+alojamiento.getCalle());
        ControladorResumenCompra.sacarDatosEstancia();
        //datosEstancia=new JLabel("Datos: "+Alojamiento.getNombre()+" "+alojamiento.getProvincia()+" "+alojamiento.getCiudad()+" "+alojamiento.getCalle());
        datosEstancia=new JLabel("Codigo Hotel: "+Hotel.hotel1.getCodigoHotel()+" Nombre: "+Hotel.hotel1.getNombre());
        datosEstancia.setBounds(40,275,550,30);
        add(datosEstancia);
        
        datosEstancia2=new JLabel("Provincia: "+Hotel.hotel1.getProvincia()+" Ciudad: "+Hotel.hotel1.getCiudad()+" Calle: "+Hotel.hotel1.getCalle());
        datosEstancia2.setBounds(40,305,550,30);
        add(datosEstancia2);
        
//        datosHabitacion=new JLabel("Camas Simple: "+Habitacion.getCama_simple()+" Cama Doble: "+Habitacion.getCama_doble()+" Cama niño: "+Habitacion.getCama_nino());
//        datosHabitacion.setBounds(40,405,550,30);
//        add(datosHabitacion);
        
        datosFechaReserva=new JLabel("Fecha Entrada: "+Hotel.hotel1.getFechaEntrada()+" Fecha Salida: "+Hotel.hotel1.getFechaSalida());
        datosFechaReserva.setBounds(40,405,550,30);
        add(datosFechaReserva);
        
                datosCliente=new JLabel("DNI: "+Usuario.usuarioLogin.getDniUsuarioLogin());
        datosCliente.setBounds(40,435,550,30);
        add(datosCliente);
        
        boton_siguiente4=new JButton("Siguiente");
        boton_siguiente4.setBounds(450,465,100,30);
        add(boton_siguiente4);
        
        ControladorResumenCompra cont=new ControladorResumenCompra(botonCancelar,boton_siguiente4);
        
       // ControladorEleccion cont3=new ControladorEleccion();
        //cont3.cogerDatosEleccion(eleccion);
        cont.sacarDatosEstancia();
        
        ImageIcon icon=new ImageIcon("src//images/Bidaion.png");
        JLabel logo2 = new JLabel(icon);
            logo2.setSize(575,200);
            add(logo2);
            validate();
        
        ImageIcon icono=new ImageIcon("src//images/fondo.png");
            logo1=new JLabel(icono);
            logo1.setSize(585,695);
            add(logo1);
            validate();

        
    }
    
}
