package _7orientacaoObjeto;

public class Carro {


    // Campos
	//atributos
    public String cor;
    public String marca;
    private int velocidade;

    // Construtor
    public Carro(String _cor, String _marca) {
    		this.cor = _cor;
     	    this.marca = _marca;
            this.velocidade = 0;
    }

    // Método
    public void acelerar() {
        velocidade += 10;
    }

    public void frear() {
        velocidade -= 10;
        if (velocidade < 0) {
            velocidade = 0;
        }
    }

    public int getVelocidade() {
        return velocidade;
    }
}

