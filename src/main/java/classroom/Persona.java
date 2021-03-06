package classroom;

public class Persona {
    public long cedula = 1;
    private String nombre;
    public static int totalPersonas;
    
    static {
        totalPersonas = 0;
    }
    
    Persona(){
    	this("", 0);
    }

    Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    Persona(String nombre) {
        this.nombre = nombre;
        this.cedula = 1;
        totalPersonas++;
    }
    Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}