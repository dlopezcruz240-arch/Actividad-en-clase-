public class Profesor extends Persona {

    protected String especialidad;

    public Profesor(String cedula, String nombre, String especialidad) {
        super(cedula, nombre);
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Especialidad='" + especialidad + '\'';
    }
}
