/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.est.practica_tres.test;

/**
 *
 * @author davidvargas
 */
import java.util.Scanner;
import ec.edu.ups.est.practica_tres.controlador.ControladorPersona;
import ec.edu.ups.est.practica_tres.vista.VistaCantante;
import ec.edu.ups.est.practica_tres.vista.VistaCompositor;
import ec.edu.ups.est.practica_tres.vista.VistaPersona;

public class Principal {
    public static void main(String[] args) {
        ControladorPersona controlador = new ControladorPersona();

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 7) {
            System.out.println("------- MENÚ -------");
            System.out.println("1. Ingreso de Cantante");
            System.out.println("2. Ingreso de Compositor");
            System.out.println("3. Agregar Clientes");
            System.out.println("4. Imprimir personas");
            System.out.println("5. Búsqueda de cantante por nombre de disco");
            System.out.println("6. Búsqueda de compositor por nombre de canción");
            System.out.println("7. Salir");
            System.out.print("Ingrese la opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    VistaCantante.agregarCantante(controlador, scanner);
                    break;
                case 2:
                    VistaCompositor.agregarCliente(controlador, scanner);
                    break;
                case 3:
                    VistaCompositor.agregarCliente(controlador, scanner);
                    break;
                case 4:
                    controlador.imprimir();
                    break;
                case 5:
                    VistaPersona.buscarPorNombreDeDisco(controlador, scanner);
                    break;
                case 6:
                    VistaPersona.buscarPorTituloDeCancion(controlador, scanner);
                    break;
                case 7:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }

            System.out.println();
        }

        scanner.close();
    }
}
