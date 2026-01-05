import java.util.ArrayList;
import java.util.List;

public class Utilitaria {

    private List<Propietario> propietarios = new ArrayList<>();
    private List<Vehiculo> vehiculos = new ArrayList<>();

    // ================= PROPIETARIOS =================

    public void agregarPropietario(String nombre, String cedula, String telefono) {
        propietarios.add(new Propietario(nombre, cedula, telefono));
    }

    public Propietario buscarPropietario(String cedula) {
        for (Propietario p : propietarios) {
            if (p.getCedula().equals(cedula)) {
                return p;
            }
        }
        return null;
    }

    public String obtenerListaPropietario() {
        StringBuilder sb = new StringBuilder();
        for (Propietario p : propietarios) {
            sb.append(p).append("\n");
        }
        return sb.toString();
    }

    // ================= VEHICULOS =================

    public void agregarAutomovil(String marca, String modelo, int anio,
                                 Propietario p, String tipo, String traccion) {
        vehiculos.add(new Automovil(marca, modelo, anio, p, tipo, traccion));
    }

    public void agregarMotocicleta(String marca, String modelo, int anio,
                                   Propietario p, String altura, String arranque) {
        vehiculos.add(new Motocicleta(marca, modelo, anio, p, altura, arranque));
    }

    public String obtenerListaSVehiculo() {
        StringBuilder sb = new StringBuilder();
        for (Vehiculo v : vehiculos) {
            sb.append(v).append("\n");
        }
        return sb.toString();
    }

    public List<Vehiculo> buscarVehiculo(String marca) {
        List<Vehiculo> lista = new ArrayList<>();
        for (Vehiculo v : vehiculos) {
            if (v.getMarca().equalsIgnoreCase(marca)) {
                lista.add(v);
            }
        }
        return lista;
    }

    public String listarMotocicletas() {
        StringBuilder sb = new StringBuilder();
        for (Vehiculo v : vehiculos) {
            if (v instanceof Motocicleta) {
                sb.append(v).append("\n");
            }
        }
        return sb.toString();
    }

    public String listarTraccionAutomovilMarca(String marca) {
        StringBuilder sb = new StringBuilder();

        for (Vehiculo v : vehiculos) {
            if (v instanceof Automovil) {
                Automovil a = (Automovil) v; // 👈 CAST CLÁSICO
                if (a.getMarca().equalsIgnoreCase(marca)) {
                    sb.append("Traccion: ")
                            .append(a.getTraccion())
                            .append("\n");
                }
            }
        }

        if (sb.length() == 0) {
            return "No hay automoviles de esa marca";
        }

        return sb.toString();
    }

    public int matricular(String cedula, int anio, String marca) {
        for (Vehiculo v : vehiculos) {
            if (v.getPropietario().getCedula().equals(cedula)
                    && v.getMarca().equalsIgnoreCase(marca)
                    && v.getAnio() == anio) {
                return v.matricular();
            }
        }
        return 0;
    }
}
