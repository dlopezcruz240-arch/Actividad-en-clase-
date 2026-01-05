public class AlumnoMagister extends Alumno {

    private String tesis;

    public AlumnoMagister(String cedula, String nombre,
                          String universidad, String tesis) {
        super(cedula, nombre, universidad);
        this.tesis = tesis;
    }

    @Override
    public String toString() {
        return "MAESTRIA | " + super.toString() +
                ", Tesis='" + tesis + '\'';
    }
}
