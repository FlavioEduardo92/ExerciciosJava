package Exercicios.desafioComidaEPeso;

public class Jantar {
    public static void main(String[] args) {


        Comida c1 = new Comida ("Arroz", 0.300);
        Comida c2 = new Comida ("Feijão", 0.200);

        Pessoa p1 = new Pessoa("Flávio", 85.80);

        p1.comer(c1);
    }
}
