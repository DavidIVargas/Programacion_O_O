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
import ec.edu.ups.est.practica_tres.modelo.Persona;
import java.util.Scanner;

public class VistaCantante {

    public static void agregarCantante(ControladorPersona controlador, Scanner scanner) {
        System.out.print("Ingrese el código: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        System.out.print("Ingrese la nacionalidad: ");
        String nacionalidad = scanner.nextLine();

        System.out.print("Ingrese el salario: ");
        double salario = scanner.nextDouble();
        scanner.nextLine(); // Consumir la nueva línea

        System.out.print("Ingrese el nombre artístico: ");
        String nombreArtistico = scanner.nextLine();

        System.out.print("Ingrese el género musical: ");
        String generoMusical = scanner.nextLine();

        System.out.print("Ingrese el número de sencillos: ");
        int numeroDeSencillos = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        System.out.print("Ingrese el número de conciertos: ");
        int numeroDeConciertos = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        System.out.print("Ingrese el número de giras: ");
        int numeroDeGiras = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        Cantante cantante = new Cantante(codigo, nombre, apellido, edad, nacionalidad, salario, nombreArtistico, generoMusical, numeroDeSencillos, numeroDeConciertos, numeroDeGiras);
        controlador.agregarPersona(cantante);

        System.out.println("Cantante agregado exitosamente.");
    }

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

}
