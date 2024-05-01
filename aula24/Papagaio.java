package aula24;

public class Papagaio extends Ave {

private String cor;
private String bica;
private String tamanho;

public getPapagaio(String cor, String bica, String tamanho) {
    this.cor = cor;
    this.bica = bica;
    this.tamanho = tamanho;
}


@Override
public void emitorSom(){
    System.out.println("papapapa");
}
 
public void setCor(String cor) {
    this.cor = cor;
}
public void setBica(String bica) {
    this.bica = bica;
}
public void setTamanho(String tamanho) {
    this.tamanho = tamanho;
}
public String getCor() {
    return cor;
}
public String getBica() {
    return bica;
}
public String getTamanho() {
    return tamanho;
}
 



}
