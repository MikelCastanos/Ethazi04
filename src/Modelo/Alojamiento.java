package Modelo;


public class Alojamiento {
    
    protected  String nombre, calle, ciudad, provincia;
    protected  int codigo_postal;
    protected  int num_habitaciones;

    public Alojamiento(String nombre,String calle,String provincia,int codigo_postal) {
        this.nombre=nombre;
        this.calle=calle;
        this.provincia=provincia;
        this.codigo_postal=codigo_postal;
    }

    public Alojamiento() {
    }
    
    
    public  String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
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
    
    public void mostrar(){
        System.out.println("Imprimirrrrr "+codigo_postal);
    }
    @Override
    public String toString() {
        return "Alojamiento"+"Nombre :"+nombre+"Calle: "+calle+"Ciudad: "+ciudad+"Provincia: "+provincia+"Codigo hotel: "+codigo_postal;
    }

    
    

    
    
    
}
