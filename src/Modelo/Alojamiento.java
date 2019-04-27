package Modelo;


public class Alojamiento {
    
    protected static  String nombre, calle, ciudad, provincia;
    protected static  int codigo_postal;
    protected static  int num_habitaciones;

    
    //Constructores innecesarios porque al no poner ninguno se utiliza el constructor vacio standard
   /*
    public Alojamiento(String nombre,String calle,String provincia,int codigo_postal) {
        this.nombre=nombre;
        this.calle=calle;
        this.provincia=provincia;
        this.codigo_postal=codigo_postal;
    }

    public Alojamiento() {
    }*/

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
    
    
    
    
    public void mostrar(){
        System.out.println("Imprimirrrrr "+codigo_postal);
    }
    @Override
    public String toString() {
        return "Alojamiento"+"Nombre :"+nombre+"Calle: "+calle+"Ciudad: "+ciudad+"Provincia: "+provincia+"Codigo hotel: "+codigo_postal;
    }

    
    

    
    
    
}
