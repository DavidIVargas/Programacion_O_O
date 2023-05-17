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
import ec.edu.ups.est.practica_tres.modelo.Persona;
import java.util.Scanner;

public class VistaPersona {
    public static void buscarPorNombreDeDisco(ControladorPersona controlador, Scanner scanner) {
        System.out.print("Ingrese el nombre del disco: ");
        String nombreDisco = scanner.nextLine();

        Persona personaEncontrada = controlador.buscarPorNombreDeDisco(nombreDisco);

        if (personaEncontrada != null) {
            System.out.println("Persona encontrada:");
            System.out.println(personaEncontrada.toString());
        } else {
            System.out.println("No se encontró ninguna persona con ese nombre de disco.");
        }
    }

    public static void buscarPorTituloDeCancion(ControladorPersona controlador, Scanner scanner) {
        System.out.print("Ingrese el título de la canción: ");
        String tituloCancion = scanner.nextLine();

        Persona personaEncontrada = controlador.buscarPorTituloDeCancion(tituloCancion);

        if (personaEncontrada != null) {
            System.out.println("Persona encontrada:");
            System.out.println(personaEncontrada.toString());
        } else {
            System.out.println("No se encontró ninguna persona con ese título de canción.");
        }
    }
}
