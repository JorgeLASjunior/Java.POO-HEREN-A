package aula24;

public class Cavalo  extends  Mamifero {
private String raca;
private String corPelo;

 public Cavalo(String raca, String corPelo) {
    this.raca = raca;
    this.corPelo = corPelo;
}

public void amamentar(){
    System.out.println("seus filhos");

 }

  public void emitorSom(){
    System.out.println("brurburbru");
  }

public String getRaca() {
    return raca;
}

public String getCorPelo() {
    return corPelo;
}

public void setRaca(String raca) {
    this.raca = raca;
}

public void setCorPelo(String corPelo) {
    this.corPelo = corPelo;
}
}

