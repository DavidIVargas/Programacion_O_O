/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.est.practica_tres.controlador;

import ec.edu.ups.est.practica_tres.modelo.Cancion;
import ec.edu.ups.est.practica_tres.modelo.Cantante;
import ec.edu.ups.est.practica_tres.modelo.Compositor;
import ec.edu.ups.est.practica_tres.modelo.Disco;
import ec.edu.ups.est.practica_tres.modelo.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author davidvargas
 */
public class ControladorPersona {

    private List<Persona> personas;

    public ControladorPersona() {
        this.personas = new ArrayList<>();
    }

    public void create(Persona persona) {
        personas.add(persona);
    }

    public void imprimir() {
        for (Persona persona : personas) {
            System.out.println(persona.toString());
            System.out.println("Salario Final: " + persona.calcularSalario());
        }
    }

    public Cantante buscarPorNombreDeDisco(String valor) {
        for (Persona persona : personas) {
            if (persona instanceof Cantante) {
                Cantante cantante = (Cantante) persona;
                for (Disco disco : cantante.getDiscografia()) {
                    if (disco.getNombre().equals(valor)) {
                        return cantante;
                    }
                }
            }
        }
        return null;
    }

    public Persona buscarPorTituloDeCancion(String valor) {
        for (Persona persona : personas) {
            if (persona instanceof Compositor) {
                Compositor compositor = (Compositor) persona;
                for (Cancion cancion : compositor.getCancionesTop100Billboard()) {
                    if (cancion.getTitulo().equals(valor)) {
                        return persona;
                    }
                }
            }
        }
        return null;
    }

    public void agregarPersona(Persona persona) {
        personas.add(persona);
    }

    public Persona buscarPorCodigo(int codigo) {
        for (Persona persona : personas) {
            if (persona.getCodigo() == codigo) {
                return persona;
            }
        }
        return null;
    }

    public List<Cantante> buscarCantantePorNombreDeDisco(String nombreDisco) {
        List<Cantante> cantantesEncontrados = new ArrayList<>();

        for (Persona persona : personas) {
            if (persona instanceof Cantante) {
                Cantante cantante = (Cantante) persona;
                if (cantante.tieneDisco(nombreDisco)) {
                    cantantesEncontrados.add(cantante);
                }
            }
        }

        return cantantesEncontrados;
    }


    public List<Compositor> buscarCompositorPorNombreDeCancion(String nombreCancion) {
        List<Compositor> compositoresEncontrados = new ArrayList<>();

        for (Persona persona : personas) {
            if (persona instanceof Compositor) {
                Compositor compositor = (Compositor) persona;
                if (compositor.tieneCancion(nombreCancion)) {
                    compositoresEncontrados.add(compositor);
                }
            }
        }

        return compositoresEncontrados;
    }

}
