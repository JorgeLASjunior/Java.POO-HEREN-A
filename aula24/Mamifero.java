package aula24;

public class Mamifero extends Animal {
private String azulao;
private float tamanhoPata;
private String tamanhoPernas;


public void amamentar(){
System.out.println("AMAMENTA MUITO");

}


public String getAzulao() {
    return azulao;
}


public float getTamanhoPata() {
    return tamanhoPata;
}


public String getTamanhoPernas() {
    return tamanhoPernas;
}


public void setAzulao(String azulao) {
    this.azulao = azulao;
}


public void setTamanhoPata(float tamanhoPata) {
    this.tamanhoPata = tamanhoPata;
}


public void setTamanhoPernas(String tamanhoPernas) {
    this.tamanhoPernas = tamanhoPernas;
}

}

