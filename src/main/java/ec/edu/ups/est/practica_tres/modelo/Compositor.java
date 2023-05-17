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
public class Compositor extends Persona {
    private int numeroDeComposiciones;
    private List<Cancion> cancionesTop100Billboard;
    private List<Cantante> clientes;

    public Compositor(int codigo, String nombre, String apellido, int edad, String nacionalidad, double salario, int numeroDeComposiciones) {
        super(codigo, nombre, apellido, edad, nacionalidad, salario);
        this.numeroDeComposiciones = numeroDeComposiciones;
        this.cancionesTop100Billboard = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void agregarCancion(int codigo, String titulo, String letra, double tiempoEnMinutos) {
        Cancion cancion = new Cancion(codigo, titulo, letra, tiempoEnMinutos);
        cancionesTop100Billboard.add(cancion);
    }

    public void agregarCliente(Cantante cliente) {
        clientes.add(cliente);
    }

    @Override
    public double calcularSalario() {
        double salarioFinal = getSalario();
        if (numeroDeComposiciones > 5) {
            salarioFinal += 300;
        }
        int numCancionesTop100 = cancionesTop100Billboard.size();
        if (numCancionesTop100 >= 1 && numCancionesTop100 <= 3) {
            salarioFinal *= 1.1;
        } else if (numCancionesTop100 >= 4 && numCancionesTop100 <= 6) {
            salarioFinal *= 1.2;
        } else if (numCancionesTop100 > 6) {
            salarioFinal *= 1.3;
        }
        return salarioFinal;
    }

    // getters y setters

    public int getNumeroDeComposiciones() {
        return numeroDeComposiciones;
    }

    public void setNumeroDeComposiciones(int numeroDeComposiciones) {
        this.numeroDeComposiciones = numeroDeComposiciones;
    }

    public List<Cancion> getCancionesTop100Billboard() {
        return cancionesTop100Billboard;
    }

    public void setCancionesTop100Billboard(List<Cancion> cancionesTop100Billboard) {
        this.cancionesTop100Billboard = cancionesTop100Billboard;
    }

    public List<Cantante> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cantante> clientes) {
        this.clientes = clientes;
    }
    

    @Override
    public String toString() {
        return "Compositor{" +
                "numeroDeComposiciones=" + numeroDeComposiciones +
                ", cancionesTop100Billboard=" + cancionesTop100Billboard +
                ", clientes=" + clientes +
                "} " + super.toString();
    }
}

