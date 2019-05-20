/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import BBDD.Conexion;
import BBDD.Consultas;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import vista.VistaPago;

/**
 *
 * @author shabi
 */
public class Promocion {
    
    protected String codigoDescuento;
    protected int descuento;

    public String getCodigoDescuento() {
        return codigoDescuento;
    }

    public void setCodigoDescuento(String codigoDescuento) {
        this.codigoDescuento = codigoDescuento;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
    
    public static Promocion promocion=new Promocion();
    
    
     public  void checkPromocion(){
        
        //        Instanciar BBDD
        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();
        com.mysql.jdbc.Connection con= conexion.conectar();

        

            
        
        String query="select * from promocion where cod_promocion like '"+Promocion.promocion.getCodigoDescuento()+"' AND dni LIKE '"+Usuario.usuarioLogin.getDniUsuarioLogin()+"'";
         System.out.println(query);
        
        try{
           //        Llamamos al metodo de consultasLogin y le pasamos la conexion y la consulta
        ResultSet rs= consultas.consultaBD(query);
            if(rs.next())
            {
                JOptionPane.showMessageDialog(null,"El codigo promocional es correcto, lo vera reflejado en su nuevo precio");
                
                
                //Checkeamos qué tipo de alojamiento es para bajar el precio al correcto
                if(Alojamiento.alojamiento1.getTipoAlojamiento().equals("H")){
                    Hotel.hotel1.setPrecioFinal(Hotel.hotel1.getPrecioFinal()-20);
                }
                
                    if(Alojamiento.alojamiento1.getTipoAlojamiento().equals("C")){
                    Casa.casa1.setPrecioFinal(Casa.casa1.getPrecioFinal()-20);
                }
                                
                    if(Alojamiento.alojamiento1.getTipoAlojamiento().equals("A")){
                    Apartamento.apartamento1.setPrecioFinal(Apartamento.apartamento1.getPrecioFinal()-20);
                }
                
                     VistaPago vistab=new VistaPago();
                     vistab.setSize(905,720);
                     vistab.setResizable(false);
                     vistab.setLocationRelativeTo(null);
                     vistab.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "El codigo no es correcto.");
            }
            }
            catch(SQLException | HeadlessException ex)
            {
                JOptionPane.showMessageDialog(null,ex);
            }
        

    }
     
 
    
}
