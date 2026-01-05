public class Alumno extends Persona {

    protected String universidad;

    public Alumno(String cedula, String nombre, String universidad) {
        super(cedula, nombre);
        this.universidad = universidad;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Universidad='" + universidad + '\'';
    }
}
