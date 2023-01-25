package personas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class Supervisor extends Empleado{

    private List<Empleado> empleadosACargo = new LinkedList<>();

    public Supervisor(String nombre, String apellidos, String DNI, Direccion direccion, LocalDate fechaNacimiento, LocalDateTime horaEntrada, LocalDateTime horaSalida) {
        super(nombre, apellidos, DNI, direccion, fechaNacimiento, horaEntrada, horaSalida);
    }

    public String anyadirEmpleadoACargo(Empleado empleado){
        if(!(empleado instanceof Supervisor)){
            this.empleadosACargo.add(empleado);
            return "Empleado añadido correctamente";
        }
        return "Error, no se puede anyadir el empleado";
    }

    public String eliminarEmpleado(Empleado empleado){
        for(Empleado e: this.empleadosACargo){
            if(e.equals(empleado)) {
                this.empleadosACargo.remove(empleado);
                return "Empleado borrado correctamente";
            }
        }
        return "El empleado no existe";
    }

}
