package Modelo;

import BBDD.Conexion;
import BBDD.Consultas;
import static Modelo.Hotel.hotel1;
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
    protected double precioFinal;
    protected String tipoAlojamiento;

    public String getTipoAlojamiento() {
        return tipoAlojamiento;
    }

    public void setTipoAlojamiento(String tipoAlojamiento) {
        this.tipoAlojamiento = tipoAlojamiento;
    }
    
    
    

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

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }
  
    public static Alojamiento alojamiento1=new Alojamiento();
    public static Alojamiento alojamiento2=new Alojamiento();
    public static Alojamiento alojamiento3=new Alojamiento();

    @Override
    public String toString() {
        return "Alojamiento{" + "calle=" + calle + ", ciudad=" + ciudad + ", codigo_postal=" + codigo_postal + ", num_habitaciones=" + num_habitaciones + ", fechaEntrada=" + fechaEntrada + ", fechaSalida=" + fechaSalida + ", diasEstancia=" + diasEstancia + ", precioBase=" + precioBase + ", precioFestivo=" + precioFestivo + ", precioEstival=" + precioEstival + ", cantidadDiasFestivos=" + cantidadDiasFestivos + ", cantidadDiasNormales=" + cantidadDiasNormales + ", precioFinal=" + precioFinal + '}';
    }

 //Le pasasmo al metodo por parametros las fechas de entrada y salida acceciendo al getter corresponiendo de cada objeto
 //retorna los dias festivos
    
    public  int  calcularDiasFestivos(String fechaEntrada,String fechaSalida){
        System.out.println(fechaEntrada+""+fechaSalida);
        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();

        String query="select * from festivos where fecha between'"+fechaEntrada+"' and '"+ fechaSalida+"'";
        int diasFestivos=0;
        try{
        ResultSet rs= consultas.consultaBD(query);
            while(rs.next())
            {
                  diasFestivos++;
            }

            }
            catch(SQLException | HeadlessException ex)
            {
                JOptionPane.showMessageDialog(null,ex);
            }
        
        
        return diasFestivos;
    }
    //Calcula los dias nrmales de estamcia (No festivos)
    //Llamar a este metodo pasandole por parametro (calcularDiasFestivos(getterCorresponientea la fecha entrada y el otro de la fechaSalida),getDiasEstancia)
    public int calcularDiasNormales(int diasFestivos,int diasEstancia){
        
        int diasNormales=0;
        
        diasNormales=diasEstancia-diasFestivos;
        
        return diasNormales;
        
    }

//Calcula el precio final dela estamcia 
    public double calcularPrecioFinal(double precioBase,double precioFestivo,int cantidadDiasFestivos,int cantidadDiasNormales){
    
        double precioFinal=0;
        
        if(cantidadDiasFestivos==0){
           precioFinal=precioBase*cantidadDiasNormales; 
           
            System.out.println("Base "+precioBase+"cantidadDiasNormales "+cantidadDiasNormales);
        }else{
            double diasNormales=precioBase*cantidadDiasNormales;
            double diasFestivos=precioFestivo*cantidadDiasFestivos;
            precioFinal=diasNormales+diasFestivos;
            
            System.out.println("Precio dias normales "+diasNormales+"Precio diasFestivos: "+diasFestivos
            +"PrecioFinal: "+precioFinal);
        }
        System.out.println("Precio final "+precioFinal);
        
        return precioFinal;
    }
    
    
}
