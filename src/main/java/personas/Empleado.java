package personas;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Empleado extends Persona{

    private int idEmpleado;
    private double salario;
    private Empleado supervisor;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSalida;

    public Empleado(String nombre, String apellidos, String DNI, Direccion direccion, LocalDate fechaNacimiento,
                    LocalDateTime horaEntrada, LocalDateTime horaSalida) {
        super(nombre, apellidos, DNI, direccion, fechaNacimiento);
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Empleado getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalDateTime horaSalida) {
        this.horaSalida = horaSalida;
    }
}
