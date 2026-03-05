import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
public class Consulta {
    private  LocalDate fecha;
    private  List<Sintoma> sintomas;
    private  List<Diagnostico> diagnosticos;
    private  Receta receta;

    public Consulta(LocalDate fecha){
        this.fecha = fecha;
        this.sintomas = new ArrayList<>();
        this.diagnosticos = new ArrayList<>();
    }
    public  void agregarSintoma(Sintoma s){
        sintomas.add(s);
    }
    public void agregarDiagnostico(Diagnostico d){
        diagnosticos.add(d);
    }
    public void setReceta(Receta receta){
        this.receta = receta;
    }
}
