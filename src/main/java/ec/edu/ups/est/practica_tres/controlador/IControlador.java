/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.est.practica_tres.controlador;

import ec.edu.ups.est.practica_tres.modelo.Persona;

/**
 *
 * @author davidvargas
 */
public interface IControlador {
    int Max_OBJECTS = 10;

    void create(Persona obj);
    Persona read(Persona obj);
    void update(Persona obj);
    void delete(Persona obj);
}
