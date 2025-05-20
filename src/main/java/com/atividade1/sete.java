package main.java.com.atividade1;

import java.util.Scanner;

public class sete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double primeiroNumero = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double segundoNumero = scanner.nextDouble();

        System.out.println("O resultado da soma é: ");
        System.out.println(primeiroNumero + segundoNumero);
        System.out.println("O resultado da subtração é: ");
        System.out.println(primeiroNumero - segundoNumero);
        System.out.println("O resultado da divisão é: ");
        System.out.println(primeiroNumero / segundoNumero);
        System.out.println("O resultado da multiplicação é: ");
        System.out.println(primeiroNumero * segundoNumero);
    }
}
