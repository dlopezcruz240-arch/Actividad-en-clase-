import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainPersona {

    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            menu();
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1 -> {
                    System.out.print("Cedula: ");
                    String cedula = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Universidad: ");
                    String uni = sc.nextLine();
                    System.out.print("Carrera: ");
                    String carrera = sc.nextLine();

                    personas.add(
                            new AlumnoPregrado(cedula, nombre, uni, carrera)
                    );
                }

                case 2 -> {
                    System.out.print("Cedula: ");
                    String cedula = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Universidad: ");
                    String uni = sc.nextLine();
                    System.out.print("Tesis: ");
                    String tesis = sc.nextLine();

                    personas.add(
                            new AlumnoMagister(cedula, nombre, uni, tesis)
                    );
                }

                case 3 -> {
                    System.out.print("Cedula: ");
                    String cedula = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Especialidad: ");
                    String esp = sc.nextLine();
                    System.out.print("Horas trabajadas: ");
                    int horas = sc.nextInt();
                    sc.nextLine();

                    personas.add(
                            new ProfesorHora(cedula, nombre, esp, horas)
                    );
                }

                case 4 -> {
                    System.out.println("\nLISTADO GENERAL");
                    for (Persona p : personas)
                        System.out.println(p);
                }

                case 5 -> {
                    System.out.println("\nALUMNOS PREGRADO");
                    for (Persona p : personas)
                        if (p instanceof AlumnoPregrado)
                            System.out.println(p);
                }

                case 6 -> {
                    System.out.println("\nALUMNOS MAESTRIA");
                    for (Persona p : personas)
                        if (p instanceof AlumnoMagister)
                            System.out.println(p);
                }

                case 7 -> {
                    System.out.println("\nPROFESORES HORA");
                    for (Persona p : personas)
                        if (p instanceof ProfesorHora)
                            System.out.println(p);
                }

                case 8 -> System.out.println("Saliendo...");

                default -> System.out.println("Opcion invalida");
            }

        } while (opcion != 8);

        sc.close();
    }

    public static void menu() {
        System.out.println("\n===== MENU =====");
        System.out.println("1. Alumno Pregrado");
        System.out.println("2. Alumno Maestria");
        System.out.println("3. Profesor Hora");
        System.out.println("4. Mostrar todos");
        System.out.println("5. Listar Pregrado");
        System.out.println("6. Listar Maestria");
        System.out.println("7. Listar Profesores");
        System.out.println("8. Salir");
        System.out.print("Opcion: ");
    }
}
