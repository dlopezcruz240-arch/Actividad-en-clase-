public abstract class MetodoAutenticacion {

    private int nivelSeguridad;

    public MetodoAutenticacion(int nivelSeguridad) {
        this.nivelSeguridad = nivelSeguridad;
    }

    public int getNivelSeguridad() {
        return nivelSeguridad;
    }

    public void setNivelSeguridad(int nivelSeguridad) {
        this.nivelSeguridad = nivelSeguridad;
    }

    public abstract boolean Autenticar(String dato);

    @Override
    public String toString() {
        return "Nivel=" + nivelSeguridad + " ";
    }
}
