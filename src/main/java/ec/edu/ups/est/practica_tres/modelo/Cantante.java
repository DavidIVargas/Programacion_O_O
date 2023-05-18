/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.est.practica_tres.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author davidvargas
 */
public class Cantante extends Persona {

    private String nombreArtistico;
    private String generoMusical;
    private int numeroDeSencillos;
    private int numeroDeConciertos;
    private int numeroDeGiras;
    private List<Disco> discografia;

    public Cantante(int codigo, String nombre, String apellido, int edad, String nacionalidad, double salario,
            String nombreArtistico, String generoMusical, int numeroDeSencillos, int numeroDeConciertos,
            int numeroDeGiras, Disco disco) {
        super(codigo, nombre, apellido, edad, nacionalidad, salario);
        this.nombreArtistico = nombreArtistico;
        this.generoMusical = generoMusical;
        this.numeroDeSencillos = numeroDeSencillos;
        this.numeroDeConciertos = numeroDeConciertos;
        this.numeroDeGiras = numeroDeGiras;
        this.discografia = new ArrayList<>();
        discografia.add(disco);
    }

    public void agregarDisco(int codigo, String nombre, int anioDeLanzamiento) {
        Disco disco = new Disco(codigo, nombre, anioDeLanzamiento);
        discografia.add(disco);
    }

    public Cantante(int codigo, String nombre, String apellido, int edad, String nacionalidad, double salario,
            String nombreArtistico, String generoMusical, int numeroDeSencillos, int numeroDeConciertos,
            int numeroDeGiras) {
        super(codigo, nombre, apellido, edad, nacionalidad, salario);
        this.nombreArtistico = nombreArtistico;
        this.generoMusical = generoMusical;
        this.numeroDeSencillos = numeroDeSencillos;
        this.numeroDeConciertos = numeroDeConciertos;
        this.numeroDeGiras = numeroDeGiras;
        this.discografia = new ArrayList<>();

    }

    @Override
    public double calcularSalario() {
        double salarioFinal = getSalario();
        if (numeroDeSencillos > 10 && numeroDeGiras > 3) {
            salarioFinal += 1000;
        } else if (numeroDeSencillos >= 1 && numeroDeSencillos <= 10) {
            salarioFinal *= 1.05;
        }
        if (numeroDeGiras >= 1 && numeroDeGiras <= 3) {
            salarioFinal *= 1.03;
        }
        if (discografia.size() >= 5) {
            salarioFinal += 2000;
        }
        return salarioFinal;
    }

    // Getters y setters
    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public int getNumeroDeSencillos() {
        return numeroDeSencillos;
    }

    public void setNumeroDeSencillos(int numeroDeSencillos) {
        this.numeroDeSencillos = numeroDeSencillos;
    }

    public int getNumeroDeConciertos() {
        return numeroDeConciertos;
    }

    public void setNumeroDeConciertos(int numeroDeConciertos) {
        this.numeroDeConciertos = numeroDeConciertos;
    }

    public int getNumeroDeGiras() {
        return numeroDeGiras;
    }

    public void setNumeroDeGiras(int numeroDeGiras) {
        this.numeroDeGiras = numeroDeGiras;
    }

    public List<Disco> getDiscografia() {
        return discografia;
    }

    public void setDiscografia(List<Disco> discografia) {
        this.discografia = discografia;
    }

    @Override
    public String toString() {
        return "Cantante{"
                + "nombreArtistico='" + nombreArtistico + '\''
                + ", generoMusical='" + generoMusical + '\''
                + ", numeroDeSencillos=" + numeroDeSencillos
                + ", numeroDeConciertos=" + numeroDeConciertos
                + ", numeroDeGiras=" + numeroDeGiras
                + ", discografia=" + discografia
                + "} " + super.toString();
    }

    public boolean tieneDisco(String nombreDisco) {
        for (Disco disco : discografia) {
            if (disco.getNombre().equals(nombreDisco)) {
                return true;
            }
        }
        return false;
    }
}
