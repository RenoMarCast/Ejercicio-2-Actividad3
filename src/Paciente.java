import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Period;

public class Paciente {

    private String nombre;
    private String rfc;
    private LocalDate fechaNacimiento;
    private List<Consulta> consultas;

    public Paciente(String nombre, String rfc, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.rfc = rfc;
        this.fechaNacimiento = fechaNacimiento;
        this.consultas = new ArrayList<>();
    }

    public void agregarConsulta(Consulta c) {

        consultas.add(c);
    }
    public int calcularEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }
    public String getNombre(){
        return nombre;
    }
    public String getRfc(){
        return rfc;
    }
    public LocalDate getFechaNacimiento(){
        return fechaNacimiento;
    }

}
