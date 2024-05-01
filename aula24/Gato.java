package aula24;

public class Gato extends Mamifero {
private String raca = "sianes";
private String corPelo= "preto";




@Override
public void amamentar(){
    System.out.println("seus gatinhos");

}
@Override
public void emitorSom(){
    System.out.println("miau miau amiau ");
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