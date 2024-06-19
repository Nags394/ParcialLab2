package Entidades;

import Entidades.Enums.Rol;

import java.time.LocalDate;
import javax.persistence.*;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "Empleado")
public class Empleado implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "telefono")
    private  String telefono;
    @Column(name = "email")
    private  String email;
    @Column(name = "fechaNacimiento")
    private static LocalDate fechaNacimiento;
    @Column(name = "rol")
    private Rol rol;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, String telefono, String email, Rol rol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public static void setFechaNacimiento(LocalDate fechaNacimiento) {
        Empleado.fechaNacimiento = fechaNacimiento;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
