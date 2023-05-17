/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.est.practica_tres.vista;

/**
 *
 * @author davidvargas
 */
import ec.edu.ups.est.practica_tres.controlador.ControladorPersona;
import ec.edu.ups.est.practica_tres.modelo.Compositor;
import ec.edu.ups.est.practica_tres.modelo.Persona;
import java.util.Scanner;

public class VistaCancion {
    public static void agregarCancion(ControladorPersona controlador, Scanner scanner) {
        System.out.print("Ingrese el código del compositor: ");
        int codigoCompositor = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        Persona personaEncontrada = controlador.buscarPorCodigo(codigoCompositor);

        if (personaEncontrada != null && personaEncontrada instanceof Compositor) {
            Compositor compositor = (Compositor) personaEncontrada;

            System.out.print("Ingrese el código de la canción: ");
            int codigoCancion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            System.out.print("Ingrese el título de la canción: ");
            String tituloCancion = scanner.nextLine();

            System.out.print("Ingrese la letra de la canción:  ");
            String letraCancion = scanner.nextLine();

            System.out.print("Ingrese el tiempo en minutos de la canción: ");
            double tiempoEnMinutos = scanner.nextDouble();
            scanner.nextLine(); // Consumir la nueva línea

            compositor.agregarCancion(codigoCancion, tituloCancion, letraCancion, tiempoEnMinutos);

            System.out.println("Canción agregada al compositor exitosamente.");
        } else {
            System.out.println("No se encontró ningún compositor con ese código.");
        }
    }
}
