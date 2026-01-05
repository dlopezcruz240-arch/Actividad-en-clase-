public class AlumnoPregrado extends Alumno {

    private String carrera;

    public AlumnoPregrado(String cedula, String nombre,
                          String universidad, String carrera) {
        super(cedula, nombre, universidad);
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "PREGRADO | " + super.toString() +
                ", Carrera='" + carrera + '\'';
    }
}
