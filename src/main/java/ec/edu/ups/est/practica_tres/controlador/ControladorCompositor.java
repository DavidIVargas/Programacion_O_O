/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.est.practica_tres.controlador;

import ec.edu.ups.est.practica_tres.modelo.Cantante;
import ec.edu.ups.est.practica_tres.modelo.Compositor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author davidvargas
 */
public class ControladorCompositor {
    private List<Compositor> compositores;

    public ControladorCompositor() {
        compositores = new ArrayList<>();
    }

    public void agregarCompositor(Compositor compositor) {
        compositores.add(compositor);
    }

    public void agregarClientes(Compositor compositor, Cantante cliente) {
        compositor.agregarCliente(cliente);
    }

    public void imprimir() {
        for (Compositor compositor : compositores) {
            System.out.println(compositor.toString());
        }
    }

    public Compositor buscarCompositorPorCodigo(int codigo) {
        for (Compositor compositor : compositores) {
            if (compositor.getCodigo() == codigo) {
                return compositor;
            }
        }
        return null; // Si no se encuentra el compositor
    }

    public Compositor buscarCompositorPorNombre(String nombre) {
        for (Compositor compositor : compositores) {
            if (compositor.getNombre().equals(nombre)) {
                return compositor;
            }
        }
        return null; // Si no se encuentra el compositor
    }

    public void eliminarCompositor(Compositor compositor) {
        compositores.remove(compositor);
    }

    public double calcularSalarioFinal(Compositor compositor) {
        double salarioFinal = compositor.calcularSalario();

        int numeroComposiciones = compositor.getNumeroDeComposiciones();
        int cancionesTop100 = compositor.getCancionesTop100Billboard().size();

        if (numeroComposiciones > 5) {
            salarioFinal += 300; // Regalía de 300$
        }

        if (cancionesTop100 >= 6) {
            salarioFinal *= 1.2; // Aumento del 20% al salario final
        } else if (cancionesTop100 >= 4) {
            salarioFinal *= 1.1; // Aumento del 10% al salario final
        }

        return salarioFinal;
    }

    public List<Compositor> obtenerCompositores() {
        return compositores;
    }
}
