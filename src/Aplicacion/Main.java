
package Aplicacion;
import Modelo.Conectar;
import javax.swing.JFrame;
import vista.*;

import Controlador.*;


public class Main {
    
    public static void main(String[] args){
    Conectar cxn = new Conectar();
    cxn.conexion();
    
//    ControladorVista controladorv=new ControladorVista();
//    controladorv.ventanaBienvenida();
    
    }
}
