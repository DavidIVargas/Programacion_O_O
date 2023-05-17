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
import ec.edu.ups.est.practica_tres.modelo.Cantante;
import ec.edu.ups.est.practica_tres.modelo.Compositor;
import ec.edu.ups.est.practica_tres.modelo.Persona;
import java.util.Scanner;

import java.util.Scanner;

public class VistaCompositor {

    public static void agregarCliente(ControladorPersona controlador, Scanner scanner) {
        System.out.print("Ingrese el código del cliente: ");
        int codigoCliente = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();

        System.out.print("Ingrese el apellido del cliente: ");
        String apellidoCliente = scanner.nextLine();

        System.out.print("Ingrese la edad del cliente: ");
        int edadCliente = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        System.out.print("Ingrese la nacionalidad del cliente: ");
        String nacionalidadCliente = scanner.nextLine();

        System.out.print("Ingrese el nombre artístico del cliente: ");
        String nombreArtisticoCliente = scanner.nextLine();

        System.out.print("Ingrese el género musical del cliente: ");
        String generoMusicalCliente = scanner.nextLine();

        System.out.print("Ingrese el número de sencillos del cliente: ");
        int numeroDeSencillos = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        System.out.print("Ingrese el número de conciertos del cliente: ");
        int numeroDeConciertos = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        System.out.print("Ingrese el número de giras del cliente: ");
        int numeroDeGiras = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        Cantante cliente = new Cantante(codigoCliente, nombreCliente, apellidoCliente, edadCliente, nacionalidadCliente, 0, nombreArtisticoCliente, generoMusicalCliente, numeroDeSencillos, numeroDeConciertos, numeroDeGiras);
        controlador.create(cliente);

        System.out.println("Cliente agregado exitosamente.");
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
