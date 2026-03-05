public class Sintoma {
    private String descripcion;
    private double temperatura;
    private double peso;
    private double estatura;

    public Sintoma(String descripcion, double temperatura,double peso, double estatura){

        this.descripcion = descripcion;
        this.temperatura = temperatura;
        this.peso = peso;
        this.estatura = estatura;
    }
    public String toString(){
        return "Sintomas: "+descripcion +
                "\nTemperatura: "+temperatura + " °C" +
                "\nPeso: "+peso +" kg" +
                "\nEstatura: "+estatura + " m";
    }
}
