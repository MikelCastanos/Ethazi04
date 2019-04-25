package Modelo;


public class Alojamiento {
    
    public static String nombre, calle, ciudad, provincia;
    public static int codigo_postal;
    public static int num_habitaciones;

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Alojamiento.nombre = nombre;
    }

    public static String getCalle() {
        return calle;
    }

    public static void setCalle(String calle) {
        Alojamiento.calle = calle;
    }

    public static String getCiudad() {
        return ciudad;
    }

    public static void setCiudad(String ciudad) {
        Alojamiento.ciudad = ciudad;
    }

    public static String getProvincia() {
        return provincia;
    }

    public static void setProvincia(String provincia) {
        Alojamiento.provincia = provincia;
    }

    public static int getCodigo_postal() {
        return codigo_postal;
    }

    public static void setCodigo_postal(int codigo_postal) {
        Alojamiento.codigo_postal = codigo_postal;
    }

    public static int getNum_habitaciones() {
        return num_habitaciones;
    }

    public static void setNum_habitaciones(int num_habitaciones) {
        Alojamiento.num_habitaciones = num_habitaciones;
    }

    


    
    
    
}
