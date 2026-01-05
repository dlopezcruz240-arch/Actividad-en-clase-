import java.util.List;
import java.util.Scanner;

public class MainVehiculo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Utilitaria util = new Utilitaria();
        int op;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Agregar propietario");
            System.out.println("2. Agregar automovil");
            System.out.println("3. Agregar motocicleta");
            System.out.println("4. Mostrar propietarios");
            System.out.println("5. Mostrar vehiculos");
            System.out.println("6. Buscar vehiculo por marca");
            System.out.println("7. Listar motocicletas");
            System.out.println("8. Listar traccion de automoviles por marca");
            System.out.println("9. Matricular vehiculo");
            System.out.println("10. Salir");
            System.out.print("Opcion: ");

            op = sc.nextInt();
            sc.nextLine();

            switch (op) {

                case 1 -> {
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Cedula: ");
                    String cedula = sc.nextLine();
                    System.out.print("Telefono: ");
                    String telefono = sc.nextLine();
                    util.agregarPropietario(nombre, cedula, telefono);
                }

                case 2 -> {
                    System.out.print("Cedula propietario: ");
                    String cedula = sc.nextLine();
                    Propietario p = util.buscarPropietario(cedula);

                    if (p != null) {
                        System.out.print("Marca: ");
                        String marca = sc.nextLine();
                        System.out.print("Modelo: ");
                        String modelo = sc.nextLine();
                        System.out.print("Año: ");
                        int anio = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Tipo: ");
                        String tipo = sc.nextLine();
                        System.out.print("Traccion: ");
                        String traccion = sc.nextLine();

                        util.agregarAutomovil(marca, modelo, anio, p, tipo, traccion);
                    } else System.out.println("Propietario no encontrado");
                }

                case 3 -> {
                    System.out.print("Cedula propietario: ");
                    String cedula = sc.nextLine();
                    Propietario p = util.buscarPropietario(cedula);

                    if (p != null) {
                        System.out.print("Marca: ");
                        String marca = sc.nextLine();
                        System.out.print("Modelo: ");
                        String modelo = sc.nextLine();
                        System.out.print("Año: ");
                        int anio = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Altura: ");
                        String altura = sc.nextLine();
                        System.out.print("Arranque: ");
                        String arranque = sc.nextLine();

                        util.agregarMotocicleta(marca, modelo, anio, p, altura, arranque);
                    } else System.out.println("Propietario no encontrado");
                }

                case 4 -> System.out.println(util.obtenerListaPropietario());
                case 5 -> System.out.println(util.obtenerListaSVehiculo());

                case 6 -> {
                    System.out.print("Marca: ");
                    String marca = sc.nextLine();
                    List<Vehiculo> lista = util.buscarVehiculo(marca);
                    lista.forEach(System.out::println);
                }

                case 7 -> System.out.println(util.listarMotocicletas());

                case 8 -> {
                    System.out.print("Marca: ");
                    String marca = sc.nextLine();
                    System.out.println(util.listarTraccionAutomovilMarca(marca));
                }

                case 9 -> {
                    System.out.print("Cedula propietario: ");
                    String cedula = sc.nextLine();
                    System.out.print("Marca: ");
                    String marca = sc.nextLine();
                    System.out.print("Año: ");
                    int anio = sc.nextInt();
                    sc.nextLine();

                    int valor = util.matricular(cedula, anio, marca);
                    System.out.println(valor > 0
                            ? "Matriculado. Valor $" + valor
                            : "No se pudo matricular");
                }

                case 10 -> System.out.println("Saliendo...");

                default -> System.out.println("Opcion invalida");
            }

        } while (op != 10);

        sc.close();
    }
}
