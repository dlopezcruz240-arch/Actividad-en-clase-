public abstract class Vehiculo {

    protected String marca;
    protected String modelo;
    protected int anio;
    protected Propietario propietario;
    protected boolean matriculado;

    public Vehiculo(String marca, String modelo, int anio, Propietario propietario) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.propietario = propietario;
        this.matriculado = false;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnio() {
        return anio;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public abstract int matricular();

    @Override
    public String toString() {
        return "Marca: " + marca +
                ", Modelo: " + modelo +
                ", Año: " + anio +
                ", Propietario: " + propietario.getNombre();
    }
}
