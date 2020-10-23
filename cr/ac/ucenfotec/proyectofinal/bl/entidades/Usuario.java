/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucenfotec.proyectofinal.bl.entidades;

public class Usuario {

    private Persona personas;
    private int edad;
    /*private image avatar;
    Recordar agregar avatar al set y get y al constructor/toString
     */
    private String correo;
    private String nombreUsuario;
    private String contrasenna;

    public String getContrasenna() {
        return contrasenna;
    }

    public String getCorreo() {
        return correo;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public Persona getPersonas() {
        return personas;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setPersonas(Persona personas) {
        this.personas = personas;
    }

    public Usuario(Persona personas, int edad, String correo, String nombreUsuario, String contrasenna) {
        this.personas = personas;
        this.edad = edad;
        this.correo = correo;
        this.nombreUsuario = nombreUsuario;
        this.contrasenna = contrasenna;
    }

    public Usuario() {
    }

    @Override
    public String toString() {
        return "Usuario{" + "personas=" + personas + ", edad=" + edad + ", correo=" + correo + ", nombreUsuario=" + nombreUsuario + ", contrasenna=" + contrasenna + '}';
    }

}
