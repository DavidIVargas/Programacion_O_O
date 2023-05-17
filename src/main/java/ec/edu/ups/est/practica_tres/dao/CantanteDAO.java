/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.est.practica_tres.dao;

import ec.edu.ups.est.practica_tres.controlador.IControlador;
import ec.edu.ups.est.practica_tres.modelo.Cantante;
import ec.edu.ups.est.practica_tres.modelo.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author davidvargas
 */
public class CantanteDAO implements IControlador {
    private List<Cantante> cantantes;

    public CantanteDAO() {
        cantantes = new ArrayList<>();
    }

    @Override
    public void create(Persona obj) {
        if (obj instanceof Cantante) {
            cantantes.add((Cantante) obj);
        }
    }

    @Override
    public Persona read(Persona obj) {
        if (obj instanceof Cantante) {
            Cantante cantante = (Cantante) obj;
            for (Cantante c : cantantes) {
                if (c.equals(cantante)) {
                    return c;
                }
            }
        }
        return null;
    }

    @Override
    public void update(Persona obj) {
        if (obj instanceof Cantante) {
            Cantante cantante = (Cantante) obj;
            for (int i = 0; i < cantantes.size(); i++) {
                if (cantantes.get(i).equals(cantante)) {
                    cantantes.set(i, cantante);
                    return;
                }
            }
        }
    }

    @Override
    public void delete(Persona obj) {
        if (obj instanceof Cantante) {
            cantantes.remove(obj);
        }
    }
}
