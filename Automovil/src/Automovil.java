public class Automovil extends Vehiculo {

    private String tipo;
    private String traccion;

    public Automovil(String marca, String modelo, int anio,
                     Propietario propietario, String tipo, String traccion) {
        super(marca, modelo, anio, propietario);
        this.tipo = tipo;
        this.traccion = traccion;
    }

    public String getTraccion() {
        return traccion;
    }

    @Override
    public int matricular() {
        if (!matriculado) {
            matriculado = true;
            return 150;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "AUTOMOVIL -> " + super.toString() +
                ", Tipo: " + tipo +
                ", Traccion: " + traccion;
    }
}
