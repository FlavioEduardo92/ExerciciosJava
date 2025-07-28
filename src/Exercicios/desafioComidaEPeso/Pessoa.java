package Exercicios.desafioComidaEPeso;

public class Pessoa {

    String nome;
    double peso;

    Pessoa (String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Comida comida) {
        if (comida != null) {
            this.peso += comida.peso;
            System.out.println(this.nome + " comeu " + comida.nome + " e agora pesa " + this.peso + " kg.");
         }
    }
}


