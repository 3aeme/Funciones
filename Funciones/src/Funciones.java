import java.util.ArrayList;
import java.util.Scanner;

public class Funciones {

    static ArrayList<String> alumnos = new ArrayList<>();
    static ArrayList<String> resultados = new ArrayList<>();
    static Scanner consola = new Scanner(System.in);

    static void mostrarMenu() {
        System.out.println("\n\nBienvenidos al curso!\n1- Registrar usuario\n2- Ver usuarios registrados\n3- Resultados de las pruebas\n4- Salir\n\nIngrese su opcion deseada: ");
    }

    static void registrarUsuario() {
        if (alumnos.size() < 8) {
           
            System.out.println("\nIngrese el nombre del alumno: ");
            alumnos.add(consola.next());
            System.out.println("El alumno aprobo? (1 para si 2 para no)");
            int respuesta = consola.nextInt();
            if (respuesta == 1) {
                resultados.add("Aprobado");
            } else {
                resultados.add("No Aprobado");
            }
        } else {
            System.out.println("La cantidad de alumnos ha llegado al limite");
        }
    }

    static void verUsuarios() {
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println((i + 1) + " - " + alumnos.get(i));
        }
    }

    static void verCalificaciones() {
        for (int i = 0; i < resultados.size(); i++) {
            System.out.println((i + 1) + " - " + resultados.get(i));
        }
    }

    public static void main(String[] args) {
        int op;
        do {
            mostrarMenu();
            op = consola.nextInt();
            System.out.println("**************************************************************");
            switch (op) {
                case 1:
                    registrarUsuario();
                    break;
                case 2:
                    verUsuarios();
                    break;
                case 3:
                    verCalificaciones();
                    break;
                default:
                    break;
            }
        } while (op != 4);
        System.out.println("Gracias por su preferencia!");
    }
}