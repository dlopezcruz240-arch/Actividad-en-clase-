import java.util.ArrayList;
import java.util.List;

public class Util {

    private List<Empleado> empleados = new ArrayList<>();

    public void AgregarEmpleado(String cedula, String nombre) {
        if (BuscarEmpleado(cedula) == -1)
            empleados.add(new Empleado(cedula, nombre));
    }

    public int BuscarEmpleado(String cedula) {
        for (int i = 0; i < empleados.size(); i++)
            if (empleados.get(i).getCedula().equals(cedula))
                return i;
        return -1;
    }

    public void AgregarHuella(String cedula, int nivel, String patron) {
        int i = BuscarEmpleado(cedula);
        if (i != -1)
            empleados.get(i).AgregarMetodo(new HuellaDigital(nivel, patron));
    }

    public void AgregarToken(String cedula, int nivel, String codigo) {
        int i = BuscarEmpleado(cedula);
        if (i != -1)
            empleados.get(i).AgregarMetodo(new TokenSeguridad(nivel, codigo));
    }

    public void AgregarFacial(String cedula, int nivel, String mapa, double precision) {
        int i = BuscarEmpleado(cedula);
        if (i != -1)
            empleados.get(i).AgregarMetodo(
                    new ReconocimientoFacial(nivel, mapa, precision));
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }
}
