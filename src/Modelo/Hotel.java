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
        String query="select distinct alojamiento.ciudad from alojamiento inner join hotel on hotel.cod_hotel=alojamiento.cod_alojamiento where alojamiento.tipo='H';";
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
    
    public ArrayList<String>AlojamientoPorLugar(String ubicacionHotel, char tipoAlojamiento){
// Instanciar BBDD

        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();
        System.out.println(tipoAlojamiento);
// Crear ArrayList
        ArrayList<String> consulta = new ArrayList<String>();
// Consulta
        String query="select hotel.nombre_hotel from hotel inner join alojamiento "
                + "on hotel.cod_hotel=alojamiento.cod_alojamiento where alojamiento.tipo='"+tipoAlojamiento+"' AND alojamiento.ciudad='"+ubicacionHotel+"'";
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
        String query="Select * from hotel inner join ubicacion on hotel.cod_hotel=ubicacion.cod_hotel where nombre_hotel='"+nombreHotel+"'";
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
                int codioPostal=rs.getInt(3);
//                String ubicacion=rs.getString(4);
                String ciudad=rs.getString(5);
                String provincia=rs.getString(6);
                String calle=rs.getString(7);

                infoCompleta.add(codigoHotel);
                infoCompleta.add(nombre);
                infoCompleta.add(codioPostal);
//                infoCompleta.add(ubicacion);
                infoCompleta.add(ciudad);
                infoCompleta.add(provincia);
                infoCompleta.add(calle);
                
                
                
                //Llenamos el Objeto de Hotel con los Getters y Setters heredados o propios
                
                //Setters de la clase Alojamiento que se extienden a Hotel
                hotel1.setNombre(rs.getString(2));
                hotel1.setProvincia(rs.getString(6));
                hotel1.setCalle(rs.getString(7));
                hotel1.setCodigo_postal(rs.getInt(3));
                hotel1.setCiudad(rs.getString(5));
                
                //Unico Setter que es PROPIO de Hotel
                hotel1.setCodigoHotel(rs.getInt(1));
                
                //HABRIA QUE SACAR EL PRECIO 
                
                
                
               
//                System.out.println(Alojamiento.getCalle());
                
                

            }
//        Control de errores
        }catch(Exception e){
            System.out.println("Ubicacion  "+e.getMessage());
        }
//        System.out.println("Hoteles en son "+consultaUbicacion);
       System.out.println(infoCompleta);
        return infoCompleta;
    }
    public void cargarHoteles(){
//        Instanciar BBDD
        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();

        
//        Consulta
        String query="Select * from hotel";
//        Llamamos al metodo de consultasBD y le pasamos la conexion y la consulta
        ResultSet rs= consultas.consultaBD(query);
//        Recorrer todos los datos a mostrar
        try{
            while(rs.next()){
                System.out.println (rs.getInt (1) + " " + rs.getString (2)+ " " + rs.getInt(3)+ " " + rs.getString (4));
            }
//        Control de errores
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
//    Busca los hoteles que se encuentran en la ubicacion que se le pasa por paramatro
//    Devuelve un arrayList con los hoteles de esa ubicacion
    
public ArrayList<String>HabitacionHoteles(String ubicacionHotel, String nombreHotel){


        Conexion conexion= new Conexion();
        Consultas consultas= new Consultas();

        ArrayList<String> consulta2 = new ArrayList<String>();
        String query="SELECT habitacion_hotel.cod_habitacion_hotel, camas.cama_doble, "
                + "camas.cama_simple,camas.cama_nino, alojamiento.ciudad FROM habitacion_hotel "
                + "INNER JOIN camas ON habitacion_hotel.cod_habitacion_hotel=camas.cod_habitacion_hotel "
                + "INNER JOIN alojamiento ON habitacion_hotel.cod_hotel=alojamiento.cod_alojamiento "
                + "INNER JOIN hotel ON alojamiento.cod_alojamiento=hotel.cod_hotel WHERE "
                + "hotel.nombre_hotel='"+nombreHotel+"' AND alojamiento.ciudad='"+ubicacionHotel+"'";
        ResultSet rs= consultas.consultaBD(query);
        try{
            while(rs.next()){
       
                String codigo=rs.getString(1);
                String cama1=rs.getString(2);
                String cama2=rs.getString(3);
                String cama3=rs.getString(4);
                consulta2.add("Codigo: "+codigo+"Simple: "+cama1+"Doble: "+cama2+"Niño: "+cama3);
                
                
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        return consulta2;
    }
    
    
}






 
    
//    Consulta estandar la dejo por si acaso pinta los datos d elos hoteles
    
    
