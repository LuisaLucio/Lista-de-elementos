package gestionconjuntoasignaturas;

import java.util.*;

public class GestionConjuntoAsignaturas {

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("**Menu de opciones**");
            System.out.println("1. Insertar asignaturas");
            System.out.println("2. Mostrar asignaturas en orden alfabetico");
            System.out.println("3. Mostrar asignaturas en orden de inserción");
            System.out.println("4. Verificar si existe una asignatura");
            System.out.println("5. Crear un segundo conjunto");
            System.out.println("6. Verificar si las asignaturas del segundo conjunto existen en el primero");
            System.out.println("7. Realizar la unión de los conjuntos");
            System.out.println("8. Mostrar el numero de asignaturas en el conjunto union");
            System.out.println("9. Eliminar todas las asignaturas del conjunto");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opción deseada: ");

            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1 -> insertarAsignaturas(sc);
                case 2 -> mostrarAsignaturasAlfabeticamente();
                case 3 -> mostrarAsignaturasOrdenInsercion();
                case 4 -> verificarAsignatura(sc);
                case 5 -> crearSegundoConjunto();
                case 6 -> verificarAsignaturasSegundoConjunto();
                case 7 -> realizarUnionConjuntos();
                case 8 -> mostrarNumeroAsignaturasUnion();
                case 9 -> eliminarAsignaturas();
                case 0 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida.");
            }
        } while (opcion != 0);
    }

    private static void insertarAsignaturas(Scanner sc) {
        System.out.println("**Insertar asignaturas**");
    }
           
    private static void verificarAsignatura(Scanner sc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void crearSegundoConjunto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void verificarAsignaturasSegundoConjunto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void realizarUnionConjuntos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void mostrarNumeroAsignaturasUnion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void eliminarAsignaturas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void mostrarAsignaturasAlfabeticamente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void mostrarAsignaturasOrdenInsercion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
