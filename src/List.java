import java.util.ArrayList;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        // leemos la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // creamos una lista para guardar las tareas
        ArrayList<String> tareas = new ArrayList<>();

        // mostrar el menú
        while (true) {
            System.out.println("\n=== Lista de Tareas ===");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Ver tareas");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            // leer la opcion
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            // seleccionamos la opción del usuario con un switch
            switch (opcion) {
                case 1: //agregar tarea
                    System.out.print("Escribe la tarea: ");
                    String tarea = scanner.nextLine(); // Leer la tarea
                    tareas.add(tarea); // Agregar a la lista
                    System.out.println("Tarea agregada.");
                    break;

                case 2: // ver tareas
                    System.out.println("\n Tareas:");
                    if (tareas.isEmpty()) {
                        System.out.println("No hay tareas.");
                    } else {
                        for (int i = 0; i < tareas.size(); i++) {
                            System.out.println((i + 1) + ". " + tareas.get(i));
                        }
                    }
                    break;

                case 3: // eliminar tarea
                    System.out.print("Número de tarea a eliminar: ");
                    int index = scanner.nextInt();
                    if (index > 0 && index <= tareas.size()) {
                        tareas.remove(index - 1);
                        System.out.println("Tarea eliminada.");
                    } else {
                        System.out.println("Número no válido.");
                    }
                    break;

                case 4: // salir del programa
                    System.out.println("¡Hasta pronto!");
                    scanner.close(); // Cerramos el scanner
                    return; // salir del programa

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }
    }
}
