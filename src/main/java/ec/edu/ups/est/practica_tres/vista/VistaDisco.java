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
import ec.edu.ups.est.practica_tres.modelo.Disco;
import ec.edu.ups.est.practica_tres.modelo.Persona;
import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

public class VistaDisco {
    public static void agregarDisco(ControladorPersona controlador, Scanner scanner) {
        System.out.print("Ingrese el código del cantante: ");
        int codigoCantante = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        Persona personaEncontrada = controlador.buscarPorCodigo(codigoCantante);

        if (personaEncontrada != null && personaEncontrada instanceof Cantante) {
            Cantante cantante = (Cantante) personaEncontrada;

            System.out.print("Ingrese el código del disco: ");
            int codigoDisco = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            System.out.print("Ingrese el nombre del disco: ");
            String nombreDisco = scanner.nextLine();

            System.out.print("Ingrese el año de lanzamiento del disco: ");
            int anioLanzamiento = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            Disco disco = new Disco(codigoDisco, nombreDisco, anioLanzamiento);
            cantante.agregarDisco(codigoDisco, nombreDisco, anioLanzamiento);

            System.out.println("Disco agregado al cantante exitosamente.");
        } else {
            System.out.println("No se encontró ningún cantante con ese código.");
        }
    }
}
