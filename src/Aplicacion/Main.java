
package Aplicacion;
import Modelo.Conectar;
import javax.swing.JFrame;
import Vista.*;
import Controlador.*;

import Controlador.*;
import javax.swing.SwingUtilities;
import vista.VistaPago;


public class Main {
    
    public static void main(String[] args){

    Conectar cxn = new Conectar();
    cxn.conexion();
    
//    ControladorVista controladorv=new ControladorVista();
//    controladorv.ventanaBienvenida();

    //Conectar cxn = new Conectar();
    //cxn.conexion();
    VistaPago vistab=new VistaPago();
    vistab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    vistab.setBounds(0,0,600,600);
    vistab.setVisible(true);

    }}
    
    
  

