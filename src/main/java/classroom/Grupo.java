package classroom;

public class Grupo {

    private Persona[] estudiantes;
    private Persona profesor;
    private Asignatura asignatura;
    private int codigo = 0;
    private String horario;

    Grupo(Persona[] estudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        this.estudiantes = estudiantes;
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.codigo = codigo;
        this.horario = horario;
    }

    Grupo(int cantidadEstudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        this(new Persona[cantidadEstudiantes], profesor, asignatura, codigo, horario);
    }

    Grupo(Persona[] estudiantes, Persona profesor, Asignatura asignatura) {
        this.estudiantes = estudiantes;
        this.profesor = profesor;
        this.asignatura = asignatura;
    }

    public void cambiarEstudiante(Persona estudianteViejo, Persona estudianteNuevo) {
        for (int i = 0; i < this.estudiantes.length; i++) {
            if (this.estudiantes[i].getCedula() == estudianteViejo.getCedula()) {
                this.estudiantes[i] = estudianteNuevo;
                break;
            }
        }
    }
    
    public void cambiarEstudiante(int indice, Persona estudiante) {
        this.estudiantes[indice] = estudiante;
    }
}