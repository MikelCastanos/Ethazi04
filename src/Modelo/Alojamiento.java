package Modelo;

import BBDD.Conexion;
import BBDD.Consultas;
import Vista.VistaTipoAlojamiento;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Alojamiento {
    
    protected   String calle, ciudad;
    protected   int codigo_postal;
    protected   int num_habitaciones;
    protected  String fechaEntrada;
    protected  String fechaSalida;
    protected  int diasEstancia;
    protected double precioBase;
    protected double precioFestivo;
    protected double precioEstival;
    protected int cantidadDiasFestivos;
    protected int cantidadDiasNormales;
    


    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(int codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public int getNum_habitaciones() {
        return num_habitaciones;
    }

    public void setNum_habitaciones(int num_habitaciones) {
        this.num_habitaciones = num_habitaciones;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getDiasEstancia() {
        return diasEstancia;
    }

    public void setDiasEstancia(int diasEstancia) {
        this.diasEstancia = diasEstancia;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getPrecioFestivo() {
        return precioFestivo;
    }

    public void setPrecioFestivo(double precioFestivo) {
        this.precioFestivo = precioFestivo;
    }

    public double getPrecioEstival() {
        return precioEstival;
    }

    public void setPrecioEstival(double precioEstival) {
        this.precioEstival = precioEstival;
    }

    public int getCantidadDiasFestivos() {
        return cantidadDiasFestivos;
    }

    public void setCantidadDiasFestivos(int cantidadDiasFestivos) {
        this.cantidadDiasFestivos = cantidadDiasFestivos;
    }

    public int getCantidadDiasNormales() {
        return cantidadDiasNormales;
    }

    public void setCantidadDiasNormales(int cantidadDiasNormales) {
        this.cantidadDiasNormales = cantidadDiasNormales;
    }
    
    
    
    public void mostrar(){
        System.out.println("Imprimirrrrr "+codigo_postal);
    }

   

    

    


    
    public  void calcularDiasFestivos(){
        
        //        Instanciar BBDD
        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();
        com.mysql.jdbc.Connection con= conexion.conectar();

        

            
        
        String query="select * from festivos where fecha between'"+Alojamiento.alojamiento1.getFechaEntrada()+"' and '"+ Alojamiento.alojamiento1.getFechaSalida()+"'";
        
        try{
           //        Llamamos al metodo de consultasLogin y le pasamos la conexion y la consulta
        ResultSet rs= consultas.consultaBD(query);
            while(rs.next())
            {
                Alojamiento.alojamiento1.setCantidadDiasFestivos(Alojamiento.alojamiento1.getCantidadDiasFestivos()+1);
                System.out.println("Hay un festivo.");
                System.out.println(Alojamiento.alojamiento1.getCantidadDiasFestivos());
            }

            }
            catch(SQLException | HeadlessException ex)
            {
                JOptionPane.showMessageDialog(null,ex);
            }
        
        Alojamiento.alojamiento1.setCantidadDiasNormales(Alojamiento.alojamiento1.getDiasEstancia()-Alojamiento.alojamiento1.getCantidadDiasFestivos());
        System.out.println("Su estancia va a ser de: ");
        System.out.println(Alojamiento.alojamiento1.getDiasEstancia());
        System.out.println("De los cuales son dias normales: ");
        System.out.println(Alojamiento.alojamiento1.getCantidadDiasNormales());
        System.out.println("Y Dias Festivos: ");
        System.out.println(Alojamiento.alojamiento1.getCantidadDiasFestivos());
    }
    


    public static Alojamiento alojamiento1=new Alojamiento();
    public static Alojamiento alojamiento2=new Alojamiento();
    public static Alojamiento alojamiento3=new Alojamiento();

    @Override
    public String toString() {
        return "Alojamiento{" + "calle=" + calle + ", ciudad=" + ciudad + ", codigo_postal=" + codigo_postal + ", num_habitaciones=" + num_habitaciones + ", fechaEntrada=" + fechaEntrada + ", fechaSalida=" + fechaSalida + ", diasEstancia=" + diasEstancia + ", precioBase=" + precioBase + ", precioFestivo=" + precioFestivo + ", precioEstival=" + precioEstival + ", cantidadDiasFestivos=" + cantidadDiasFestivos + ", cantidadDiasNormales=" + cantidadDiasNormales + '}';
    }
    
    
    
    
    
}
