package org.miGuru;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private int id;
    private Usuario usuario;
    private List<Capacitacion> capacitacionesAsignadas = new ArrayList<>();
    private List<Capacitacion> capacitacionesFinalizadas = new ArrayList<>();

    public Empleado(int id, Usuario usuario) {
        this.id = id;
        this.usuario = usuario;
    }

    public Usuario getUsuario(){
        return usuario;
    }

    public List<Capacitacion> getCapacitacionesAsignadas(){
        return capacitacionesAsignadas;
    }

    public void realizarCapacitacion(Capacitacion capacitacion) {
        capacitacionesAsignadas.remove(capacitacion);
        capacitacionesFinalizadas.add(capacitacion);
        System.out.println(usuario.getNombre() + " ha completado la capacitación: " + capacitacion.getTitulo());
    }

    public void verProgreso() {
        System.out.println("Capacitaciones asignadas: " + capacitacionesAsignadas.size());
        System.out.println("Capacitaciones finalizadas: " + capacitacionesFinalizadas.size());
    }
}