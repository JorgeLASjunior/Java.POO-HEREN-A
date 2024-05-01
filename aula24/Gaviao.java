package aula24;

public class Gaviao  extends Ave{
private String bicoGrande;
private String penaGrande;
private String garraGrande;


@Override
public void emitorSom(){
    System.out.println("ha ha ha ha");
}


public String getBicoGrande() {
    return bicoGrande;
}
public String getPenaGrande() {
    return penaGrande;
}
public String getGarraGrande() {
    return garraGrande;
}



public void setBicoGrande(String bicoGrande) {
    this.bicoGrande = bicoGrande;
}
public void setPenaGrande(String penaGrande) {
    this.penaGrande = penaGrande;
}
public void setGarraGrande(String garraGrande) {
    this.garraGrande = garraGrande;
}



}
