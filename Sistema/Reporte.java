package org.miGuru;

public class Reporte {
    private int id;
    private String titulo;
    private String tipo;
    private String fechaGeneracion;
    private Usuario autor;
    private String datos;
    private String formato;

    public Reporte(int id, String titulo, String tipo, String fechaGeneracion, Usuario autor, String datos, String formato) {
        this.id = id;
        this.titulo = titulo;
        this.tipo = tipo;
        this.fechaGeneracion = fechaGeneracion;
        this.autor = autor;
        this.datos = datos;
        this.formato = formato;
    }

    public void exportar() {
        System.out.println("Exportando reporte: " + titulo);
    }
}