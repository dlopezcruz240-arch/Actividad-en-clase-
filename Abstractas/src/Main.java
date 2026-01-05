import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Util util = new Util();
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Agregar huella digital");
            System.out.println("3. Agregar token seguridad");
            System.out.println("4. Agregar reconocimiento facial");
            System.out.println("5. Mostrar empleados");
            System.out.println("6. Autenticar empleado");
            System.out.println("7. Salir");
            System.out.print("Opcion: ");

            op = sc.nextInt();
            sc.nextLine();

            switch (op) {

                case 1:
                    System.out.print("Cedula: ");
                    String cedula = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    util.AgregarEmpleado(cedula, nombre);
                    break;

                case 2:
                    System.out.print("Cedula: ");
                    cedula = sc.nextLine();
                    System.out.print("Nivel seguridad: ");
                    int nivel = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Patron huella: ");
                    String patron = sc.nextLine();
                    util.AgregarHuella(cedula, nivel, patron);
                    break;

                case 3:
                    System.out.print("Cedula: ");
                    cedula = sc.nextLine();
                    System.out.print("Nivel seguridad: ");
                    nivel = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Codigo token: ");
                    String token = sc.nextLine();
                    util.AgregarToken(cedula, nivel, token);
                    break;

                case 4:
                    System.out.print("Cedula: ");
                    cedula = sc.nextLine();
                    System.out.print("Nivel seguridad: ");
                    nivel = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Mapa rostro: ");
                    String mapa = sc.nextLine();
                    System.out.print("Precision (0-1): ");
                    double precision = sc.nextDouble();
                    sc.nextLine();
                    util.AgregarFacial(cedula, nivel, mapa, precision);
                    break;

                case 5:
                    if (util.getEmpleados().isEmpty()) {
                        System.out.println("No hay empleados registrados");
                    } else {
                        for (Empleado e : util.getEmpleados())
                            System.out.println(e);
                    }
                    break;

                case 6:
                    System.out.print("Cedula: ");
                    cedula = sc.nextLine();
                    int i = util.BuscarEmpleado(cedula);

                    if (i == -1) {
                        System.out.println("Empleado no encontrado");
                        break;
                    }

                    System.out.print("Metodo (huella/token/facial): ");
                    String metodo = sc.nextLine();
                    System.out.print("Dato autenticacion: ");
                    String dato = sc.nextLine();

                    if (util.getEmpleados().get(i).Autenticar(metodo, dato))
                        System.out.println("ACCESO PERMITIDO");
                    else
                        System.out.println(" ACCESO DENEGADO");
                    break;

                case 7:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        } while (op != 7);

        sc.close();
    }
}
