package Exercicios.arrays;

import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;



public class DesafioArraysNotas {

    public static void main(String[] args) {

        Scanner Entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual a quantidade de notas do aluno? ");

        int quantidadeNotas = Entrada.nextInt();

        double[] notas = new double[quantidadeNotas];

        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.println("Informe a nota número " + (i + 1) + ":");
            notas[i] = Entrada.nextDouble();
        }

        double total = 0;

        for (double nota : notas){
            total += nota;

        }
        double mediaNotas = (total / notas.length);
        System.out.println("A média do aluno é: " + mediaNotas + "!");
        Entrada.close();

    }
}
