
package Aplicacion;
import Modelo.Conectar;
import javax.swing.JFrame;
import Vista.*;
import Controlador.*;

import Controlador.*;
import javax.swing.SwingUtilities;


public class Main {
    
    public static void main(String[] args){
<<<<<<< HEAD
    Conectar cxn = new Conectar();
    cxn.conexion();
    
//    ControladorVista controladorv=new ControladorVista();
//    controladorv.ventanaBienvenida();
=======
    //Conectar cxn = new Conectar();
    //cxn.conexion();
    VistaBienvenida vistab=new VistaBienvenida();
    
    vistab.setBounds(0,0,600,600);
    vistab.setVisible(true);
    
    
    
    SwingUtilities.invokeLater(new Runnable(){
        @Override
        public void run(){
            ControladorVista controlador=new ControladorVista();
            controlador.contol();
        }});
>>>>>>> ba8545a277a761fdf5a4aeca5305942aa900f6b1
    
    
    }}
    
    
  

