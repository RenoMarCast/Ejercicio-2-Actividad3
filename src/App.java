import java.time.LocalDate;

public class App {

    public static void main(String[]args){

        Paciente paciente = new Paciente("Juan Perez",
                "JUAP900101", LocalDate.of(1990,1,1));

        Consulta consulta = new Consulta(LocalDate.now());

        Sintoma sintoma1 = new Sintoma("Fiebre",38.5,70,1.75);
        consulta.agregarSintoma(sintoma1);

        Diagnostico diagnostico = new Diagnostico("Gripe");
        consulta.agregarDiagnostico(diagnostico);

        Receta receta = new Receta("Reposo y tomar liquidos");

        Medicamento med = new Medicamento("Paracetamol","500mg cada 8hrs");
        receta.agregarMedicamentos(med);

        consulta.setReceta(receta);

        paciente.agregarConsulta(consulta);
        System.out.println("==== Sistema De Consultas Medicas ====");

        //Esto Muestra La Informacion General Del Paciente
        System.out.println("----Informacion General Del Paciente----");

        System.out.println("Paciente: "+ paciente.getNombre());
        System.out.println("RFC: "+paciente.getRfc());
        System.out.println("Edad: "+paciente.calcularEdad());

        System.out.println("\n----- SINTOMAS -----");
        System.out.println(sintoma1);

        System.out.println("\n----- DIAGNOSTICO -----");
        System.out.println(diagnostico);

        System.out.println("\n----- RECETA -----");
        System.out.println(receta);
    }
}
