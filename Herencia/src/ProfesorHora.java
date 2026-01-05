public class ProfesorHora extends Profesor {

    private int horas;
    private double sueldo;

    public ProfesorHora(String cedula, String nombre,
                        String especialidad, int horas) {
        super(cedula, nombre, especialidad);
        this.horas = horas;
        this.sueldo = horas * 35;
    }

    public int getHoras() {
        return horas;
    }

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        return "PROFESOR | " + super.toString() +
                ", Horas=" + horas +
                ", Sueldo=$" + sueldo;
    }
}
