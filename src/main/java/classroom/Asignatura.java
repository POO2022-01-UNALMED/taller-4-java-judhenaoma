package classroom;

public class Asignatura {

    public String nombre;
    private String n = nombre;
    private int codigoInterno;
    public int codigoExterno;
    Tipo tipo;

    Asignatura() {
        this("Sin nombre", 0, 0);
    }
    
    Asignatura(String nombre) {
        this(nombre, 0, 0);
    }

    Asignatura(int codigoExterno) {
        this("Sin nombre", 0, codigoExterno);
    }
    

    Asignatura(String nombre, int codigoInterno, int codigoExterno) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
    }

    public void cambiarDatos(int codigoInterno, int codigoExterno, String nombre) {
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.nombre = nombre;
    }
    public void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }

    public void cambiarDatos(int codigoExterno) {
        this.codigoExterno = codigoExterno;
    }
    

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }
    
    public void setCodigoInterno(double codigoInterno) {
        this.codigoInterno = (int) codigoInterno;
    }
}