package org.miGuru;

public class Capacitacion {
    private int id;
    private String titulo;
    private String descripcion;
    private int duracion;
    private String estado;

    public Capacitacion(int id, String titulo, String descripcion, int duracion, String estado) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void asignarAEmpleado(Empleado empleado) {
        empleado.getCapacitacionesAsignadas().add(this);
        System.out.println("Capacitación " + titulo + " asignada a " + empleado.getUsuario().getNombre());
    }
}