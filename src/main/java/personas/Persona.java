package personas;

import java.time.LocalDate;

public class Persona {

    private String nombre;
    private String apellidos;
    private String DNI;
    private Direccion direccion;
    private LocalDate fechaNacimiento;
    private LocalDate fechaAlta;
    private LocalDate fechaBaja;

    public Persona(String nombre, String apellidos, String DNI, Direccion direccion, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public LocalDate getFechaBaja() {
        return fechaBaja;
    }

    public void darBajaCliente(){
        this.fechaBaja = LocalDate.now();
    }
}
