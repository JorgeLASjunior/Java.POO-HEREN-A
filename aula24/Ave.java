package aula24;

public class Ave extends Animal {

private float tamanhoAsa;
private float tamanhoPerna;
private float tamanhoGarra;


public void voar(){
    System.out.println("voa altoooo");
}


public void setTamanhoAsa(float tamanhoAsa) {
    this.tamanhoAsa = tamanhoAsa;
}


public void setTamanhoPerna(float tamanhoPerna) {
    this.tamanhoPerna = tamanhoPerna;
}


public void setTamanhoGarra(float tamanhoGarra) {
    this.tamanhoGarra = tamanhoGarra;
}


public float getTamanhoAsa() {
    return tamanhoAsa;
}


public float getTamanhoPerna() {
    return tamanhoPerna;
}


public float getTamanhoGarra() {
    return tamanhoGarra;
}

}