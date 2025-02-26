package org.miGuru;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(1, "Juan Perez", "juan@example.com", "password123", "Empleado");
        Empleado empleado = new Empleado(1, usuario);

        Capacitacion capacitacion = new Capacitacion(1, "Java Básico", "Curso introductorio a Java", 10, "Asignada");

        capacitacion.asignarAEmpleado(empleado);
        empleado.realizarCapacitacion(capacitacion);
        empleado.verProgreso();

        Reporte reporte = new Reporte(1, "Reporte de Capacitaciones", "PDF", "2023-10-01", usuario, "Datos del reporte", "PDF");
        reporte.exportar();
    }
}