/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.est.practica_tres.dao;

import ec.edu.ups.est.practica_tres.controlador.IControlador;
import ec.edu.ups.est.practica_tres.modelo.Compositor;
import ec.edu.ups.est.practica_tres.modelo.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author davidvargas
 */
public class CompositorDAO implements IControlador {
    private List<Compositor> compositores;

    public CompositorDAO() {
        compositores = new ArrayList<>();
    }

    @Override
    public void create(Persona obj) {
        if (obj instanceof Compositor) {
            compositores.add((Compositor) obj);
        }
    }

    @Override
    public Persona read(Persona obj) {
        if (obj instanceof Compositor) {
            Compositor compositor = (Compositor) obj;
            for (Compositor c : compositores) {
                if (c.equals(compositor)) {
                    return c;
                }
            }
        }
        return null;
    }

    @Override
    public void update(Persona obj) {
        if (obj instanceof Compositor) {
            Compositor compositor = (Compositor) obj;
            for (int i = 0; i < compositores.size(); i++) {
                if (compositores.get(i).equals(compositor)) {
                    compositores.set(i, compositor);
                    return;
                }
            }
        }
    }

    @Override
    public void delete(Persona obj) {
        if (obj instanceof Compositor) {
            compositores.remove(obj);
        }
    }
}
