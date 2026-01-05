import java.util.ArrayList;
import java.util.List;

public class Empleado {

    private String cedula;
    private String nombre;
    private List<MetodoAutenticacion> metodos;

    public Empleado(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        metodos = new ArrayList<>();
    }

    public String getCedula() {
        return cedula;
    }

    public void AgregarMetodo(MetodoAutenticacion metodo) {
        metodos.add(metodo);
    }

    public int CantidadHuellas() {
        int c = 0;
        for (MetodoAutenticacion m : metodos)
            if (m instanceof HuellaDigital) c++;
        return c;
    }

    public int CantidadTokens() {
        int c = 0;
        for (MetodoAutenticacion m : metodos)
            if (m instanceof TokenSeguridad) c++;
        return c;
    }

    public int CantidadFacial() {
        int c = 0;
        for (MetodoAutenticacion m : metodos)
            if (m instanceof ReconocimientoFacial) c++;
        return c;
    }

    public boolean Autenticar(String tipo, String dato) {
        for (MetodoAutenticacion m : metodos) {

            if (tipo.equalsIgnoreCase("huella") && m instanceof HuellaDigital)
                return m.Autenticar(dato);

            if (tipo.equalsIgnoreCase("token") && m instanceof TokenSeguridad)
                return m.Autenticar(dato);

            if (tipo.equalsIgnoreCase("facial") && m instanceof ReconocimientoFacial)
                return m.Autenticar(dato);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "Cedula='" + cedula + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", Metodos=" + metodos +
                '}';
    }
}
