package org.miGuru;

public class Usuario {
    private int idEmpleado;
    private String nombre;
    private String correo;
    private String password;
    private String rol;

    public Usuario(int idEmpleado, String nombre, String correo, String password, String rol) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
        this.rol = rol;
    }

    public void login() {
        System.out.println(nombre + " ha iniciado sesión.");
    }

    public void logout() {
        System.out.println(nombre + " ha cerrado sesión.");
    }

    public void cambiarPassword(String newPassword){
        this.password = newPassword;
        System.out.println(nombre + " ha cambiado su contraseña.");
    }

    public String getNombre(){
        return nombre;
    }

    public int getIdEmpleado(){
        return idEmpleado;
    }

    public String getCorreo(){
        return correo;
    }
    public String getPassword(){
        return password;
    }

}