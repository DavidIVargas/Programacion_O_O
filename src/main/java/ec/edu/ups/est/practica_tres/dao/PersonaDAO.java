/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.est.practica_tres.dao;

import ec.edu.ups.est.practica_tres.controlador.IControlador;
import ec.edu.ups.est.practica_tres.modelo.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author davidvargas
 */
public class PersonaDAO implements IControlador {
    private List<Persona> personas;

    public PersonaDAO() {
        personas = new ArrayList<>();
    }

    @Override
    public void create(Persona obj) {
        personas.add(obj);
    }

    @Override
    public Persona read(Persona obj) {
        for (Persona persona : personas) {
            if (persona.equals(obj)) {
                return persona;
            }
        }
        return null;
    }

    @Override
    public void update(Persona obj) {
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).equals(obj)) {
                personas.set(i, obj);
                return;
            }
        }
    }

    @Override
    public void delete(Persona obj) {
        personas.remove(obj);
    }
}
