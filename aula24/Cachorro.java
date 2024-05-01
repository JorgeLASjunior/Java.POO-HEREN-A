package aula24;

public class Cachorro {


    private String tamanho;
    private String raca;

    public void amamentar(){
        System.out.println("seus filhos");

    }


    public void emitorSom(){
 System.out.println("rau rau");
    }
    public String getTamanho() {
        return tamanho;
    }
    public String getRaca() {
        return raca;
    }


    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }


    public void setRaca(String raca) {
        this.raca = raca;
    }
}
