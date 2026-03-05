public class Diagnostico {
    private String padecimiento;

    public Diagnostico(String padecimiento){
        this.padecimiento = padecimiento;
    }
    @Override
    public String toString(){
        return "Diagnostico: "+padecimiento;
    }
}
