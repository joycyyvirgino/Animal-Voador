package aniamalvoador;

public class Mocego implements Voador{
    private String especie;

    @Override
    public void voar() {
        System.out.println("O morcego está batendo suas asas e voando.");
    }
    public void localizarPresas() {
        System.out.println("O morcego está usando ecolocalização para encontrar presas.");
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
