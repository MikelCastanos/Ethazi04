package Modelo;

import BBDD.Conexion;
import BBDD.Consultas;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ikasleaETHAZI
 */
public class Hotel extends Alojamiento{
    
    public static Hotel hotel1=new Hotel();
    
    protected int num_estrellas,codigoHotel;

    public int getNum_estrellas() {
        return num_estrellas;
    }

    public void setNum_estrellas(int num_estrellas) {
        this.num_estrellas = num_estrellas;
    }

    public int getCodigoHotel() {
        return codigoHotel;
    }

    public void setCodigoHotel(int codigoHotel) {
        this.codigoHotel = codigoHotel;
    }


    
    public ArrayList<String>ubicacion(){
// Instanciar BBDD

        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();

// Crear ArrayList
        ArrayList<String> consultaUbicacion = new ArrayList<String>();
// Consulta
        String query="select distinct hotel.ciudad from hotel";
// Llamamos al metodo de consultasBD y le pasamos la conexion y la consulta
        ResultSet rs= consultas.consultaBD(query);
//Recorrer todos los datos a mostrar
        try{
            while(rs.next()){
//Si descomentamos la siguiente linea nos muestra todos los datos del hotel que ocincide con la ubicacion

//System.out.println (rs.getInt (1) + " " + rs.getString (2)+ " " + rs.getInt(3)+ " " + rs.getString (4));

//  Aqui en cambio guardamos los nombres del hotel que coinciden con la ubicaiocn en un arrayList
                String ubicacion=rs.getString(1);
                consultaUbicacion.add(ubicacion);
            }
//        Control de errores
        }catch(Exception e){
            System.out.println("Ubicacion  "+e.getMessage());
        }
        System.out.println("Hoteles en son "+consultaUbicacion);
        return consultaUbicacion;
    }
    
    public ArrayList<String>AlojamientoPorLugar(String ubicacionHotel){
// Instanciar BBDD

        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();
// Crear ArrayList
        ArrayList<String> consulta = new ArrayList<String>();
// Consulta
        String query="select hotel.nombre_hotel from hotel where hotel.ciudad='"+ubicacionHotel+"';";
// Llamamos al metodo de consultasBD y le pasamos la conexion y la consulta
        ResultSet rs= consultas.consultaBD(query);
        
        
//  Recorrer todos los datos a mostrar
        try{
            while(rs.next()){
//           Si descomentamos la siguiente linea nos muestra todos los datos del hotel que ocincide con la ubicacion

//              System.out.println (rs.getInt (1) + " " + rs.getString (2)+ " " + rs.getInt(3)+ " " + rs.getString (4));

//  Aqui en cambio guardamos los nombres del hotel que coinciden con la ubicaiocn en un arrayList
                String nombreHotel=rs.getString(1);
                consulta.add(nombreHotel);
            }
//        Control de errores
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Hoteles en "+ubicacionHotel+" son "+consulta);
        return consulta;
    }

    public ArrayList consultaCompleta(String nombreHotel){
// Instanciar BBDD

        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();

// Crear ArrayList
        ArrayList infoCompleta = new ArrayList<>();
// Consulta
        String query="select * from hotel where nombre_hotel='"+nombreHotel+"';";
// Llamamos al metodo de consultasBD y le pasamos la conexion y la consulta
        ResultSet rs= consultas.consultaBD(query);
//  Recorrer todos los datos a mostrar
        try{
            while(rs.next()){
//           Si descomentamos la siguiente linea nos muestra todos los datos del hotel que ocincide con la ubicacion

//              System.out.println (rs.getInt (1) + " " + rs.getString (2)+ " " + rs.getInt(3)+ " " + rs.getString (4));

//  Aqui en cambio guardamos los nombres del hotel que coinciden con la ubicaiocn en un arrayList

                int codigoHotel=rs.getInt(1);
                String nombre=rs.getString(2);
                int numeroEstrellas=rs.getInt(3);
                String ciudad=rs.getString(4);
                String direccion=rs.getString(5);
                int codigoPostal=rs.getInt(6);

                infoCompleta.add(codigoHotel);
                infoCompleta.add(nombre);
                infoCompleta.add(numeroEstrellas);
                infoCompleta.add(ciudad);
                infoCompleta.add(direccion);
                infoCompleta.add(codigoPostal);
                
                
                
                //Llenamos el Objeto de Hotel con los Getters y Setters heredados o propios
                
                //Setters de la clase Alojamiento que se extienden a Hotel
                hotel1.setNombre(nombre);
                hotel1.setCalle(direccion);
                hotel1.setCodigo_postal(codigoPostal);
                hotel1.setCiudad(ciudad);
                //Unico Setter que es PROPIO de Hotel
                hotel1.setCodigoHotel(codigoHotel);
                hotel1.setNum_estrellas(numeroEstrellas);
                
                //HABRIA QUE SACAR EL PRECIO 
              
            }
//        Control de errores
        }catch(Exception e){
            System.out.println("Ubicacion  "+e.getMessage());
        }
//        System.out.println("Hoteles en son "+consultaUbicacion);
       System.out.println("El hotel seleccionado es : "+infoCompleta);
        return infoCompleta;
    }
    
//    public void cargarHoteles(){
////        Instanciar BBDD
//        Conexion conexion= new Conexion();
//        Consultas consultas= new Consultas();
//        
////        Consulta
//        String query="Select * from hotel";
////        Llamamos al metodo de consultasBD y le pasamos la conexion y la consulta
//        ResultSet rs= consultas.consultaBD(query);
////        Recorrer todos los datos a mostrar
//        try{
//            while(rs.next()){
//                System.out.println (rs.getInt (1) + " " + rs.getString (2)+ " " + rs.getInt(3)+ " " + rs.getString (4));
//            }
////        Control de errores
//        }catch(Exception e){
//            System.out.println(e.getMessage());
//        }
//    }
    
//    Busca los hoteles que se encuentran en la ubicacion que se le pasa por paramatro
//    Devuelve un arrayList con los hoteles de esa ubicacion
    
public ArrayList<String>HabitacionHoteles(int codigoHotel){

        System.out.println("El codgio del hotel seleccionado es: "+codigoHotel);
        
        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();

        ArrayList<String> consulta2 = new ArrayList<String>();
        String query="select hotel.cod_hotel, habitacion_hotel.cod_habitacion_hotel,habitacion_hotel.precio_base_hotel,"
                + "habitacion_hotel.precio_festivo_hotel,habitacion_hotel.precio_estival_hotel,camas.cama_doble,camas.cama_simple,camas.cama_nino"
                +" from habitacion_hotel inner join hotel on habitacion_hotel.cod_hotel=hotel.cod_hotel inner join camas on "
                + "habitacion_hotel.cod_habitacion_hotel=camas.cod_habitacion_hotel where hotel.cod_hotel="+codigoHotel+"";
        ResultSet rs= consultas.consultaBD(query);
        try{
            while(rs.next()){
       
                int codigoHabitacion=rs.getInt(2);
                double precioBaseHotel=rs.getDouble(3);
                double precioFestivoHotel=rs.getDouble(4);
                double precioEstivalHotel=rs.getDouble(5);
                int camaDoble=rs.getInt(6);
                int camaSimple=rs.getInt(7);
                int camaNino=rs.getInt(8);
                

                consulta2.add("Cod "+codigoHabitacion+" Precio Base "+precioBaseHotel+" Cama Doble "+camaDoble+" Cama Simple "+camaSimple+" Cama Nino "+camaNino);
//                consulta2.add("Precio Base "+precioBaseHotel);
//                consulta2.add("Precio Festivo "+precioFestivoHotel);
//                consulta2.add("Precio Estival "+precioEstivalHotel);
            
                
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        return consulta2;
    }
    
    
}






 
    
//    Consulta estandar la dejo por si acaso pinta los datos d elos hoteles
    
    
