import java.util.List;
import java.util.ArrayList;
public class Receta {
    private List<Medicamento> medicamentos;
    private String recomendaciones;

    public Receta(String recomendaciones) {
        this.recomendaciones = recomendaciones;
        this.medicamentos = new ArrayList<>();
    }

    public void agregarMedicamentos(Medicamento m) {
        medicamentos.add(m);
    }

    @Override
    public String toString() {
        String resultado = "==== Receta Medica ====\n";

        for (Medicamento m : medicamentos) {
            resultado += m + "\n";
        }
        resultado += "Recomendaciones: "+ recomendaciones;
        return resultado;
    }
}