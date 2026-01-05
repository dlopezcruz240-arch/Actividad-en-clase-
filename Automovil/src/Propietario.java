public class Propietario {

    private String nombre;
    private String cedula;
    private String telefono;

    public Propietario(String nombre, String cedula, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                ", Cedula: " + cedula +
                ", Telefono: " + telefono;
    }
}
